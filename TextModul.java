package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TextModul {
    List<String> firstName = new ArrayList<String>();
    List<String> secondName = new ArrayList<String>();
    List<String> eMail = new ArrayList<String>();
    String[] mailEnding = new String[]{"@outlook.de", "@gmail.com", "@gmx.de", "@gmx.com", "@web.de", "@freemail.com" , "@hotmail.de" , "@yahoo.de"};
    String[] symbol = new String[]{".", "-", "_", ""};
    String line = null;


    public void readInput() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\PC\\Documents\\Hacking\\javaProject\\HaveIBeenPwndChecker\\src\\com\\company\\Namen.txt"));
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(":");
                firstName.add(names[0]);
                secondName.add(names[1]);
            }

        } catch (Exception e) {

            return;
        }
    }

    public void nameUpperLower() {
        for (int i = 0; i < firstName.size(); i++) {
            String firstNameLower = firstName.get(i);

            // First letter of the String in lowercase
            firstNameLower = firstNameLower.substring(0, 1).toLowerCase() + firstNameLower.substring(1);

            String firstNameUpper = firstName.get(i);

            // First letter of the String in uppercase


            String secondNameLower = secondName.get(i);

            //First letter of the String in lowercase
            secondNameLower =  secondNameLower.substring(0, 1).toLowerCase() + secondNameLower.substring(1);


            //First letter of the String in uppercase



            //Call of the Method mailGenerator

            mailGenerator(firstNameLower,  secondNameLower );
        }
    }

    public void mailGenerator(String firstNameLower, String secondNameLower) {
        for (int j = 0; j < mailEnding.length; j++) {
            for (int k = 0; k < symbol.length; k++) {

                String e0 = firstNameLower + symbol[k] + secondNameLower + mailEnding[j];   // LowerCase LowerCase
                String e1 = firstNameLower + symbol[k] + secondNameLower.charAt(0) + mailEnding[j];   // LowerCase LowerCase
                String e2 = secondNameLower + mailEnding[j];
                String e3 = secondNameLower + symbol[k] + firstNameLower.charAt(0) + mailEnding[j];
                String e4 = secondNameLower + symbol[k] + firstNameLower + mailEnding[j];


                System.out.println(e0);
                System.out.println(e1);
                System.out.println(e2);
                System.out.println(e3);
                System.out.println(e4);






            }
        }
    }
}



