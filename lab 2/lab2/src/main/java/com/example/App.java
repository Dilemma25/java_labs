package com.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MusikDownloads musik = new MusikDownloads();
        ArrayList<String> newTitles = new ArrayList<String>();

        newTitles.add("Роман");
        newTitles.add("DXMINXS");
        newTitles.add("KILLERS FROM THE NORTHSIDE");
        newTitles.add("KILLERS FROM THE NORTHSIDE");
        newTitles.add("Адская колыбельная");
        newTitles.add("DXMINXS");
        newTitles.add("KILLERS FROM THE NORTHSIDE");
        newTitles.add("Dust [Hotline Miami 2 OST]");
        newTitles.add("Адская колыбельная");
        newTitles.add("Dust [Hotline Miami 2 OST]");
        newTitles.add("KILLERS FROM THE NORTHSIDE");
        newTitles.add("Роман");


        musik.updateDownloads(newTitles);

        musik.printList();

        System.out.println();

        System.out.println(musik.getDownloadInfo("Numb"));

        System.out.println(musik.getDownloadInfo("DXMINXS"));
    }
}
