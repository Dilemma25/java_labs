package lab3;

public class HiddenWord {
    private String hiddenValue;
    
    public HiddenWord(String value) {
        this.hiddenValue = value;
    }

    public String getHint(String tryValue) {
        if (tryValue.length() != hiddenValue.length()) {
           System.out.println("Длина вашей догадки не равна длине загаданного слова, попробуйте еще раз");
            return null;
        }
        
        char[] tryValueArray = tryValue.toLowerCase().toCharArray();
        char[] hiddenValueArray = hiddenValue.toLowerCase().toCharArray();
        String[] answerValue = new String[hiddenValue.length()];


        for (int i = 0; i < hiddenValue.length(); i++) {
            String strCh = "" + tryValueArray[i]; 
            
            if (!hiddenValue.contains(strCh)) {
                answerValue[i] = "*";
            } else if (hiddenValue.contains(strCh) && tryValueArray[i] != hiddenValueArray[i]) {
                answerValue[i] = "+";
            } else if (tryValueArray[i] == hiddenValueArray[i]) {
                answerValue[i] = hiddenValueArray[i] + "";
            }
        }
        
        return String.join("", answerValue);
    }
}
