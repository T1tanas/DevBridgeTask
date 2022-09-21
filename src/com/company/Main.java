package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File stringList = new File("String.txt");
        int textNumber;
        String textData;
        String editedTextData;

        Scanner reader = new Scanner(stringList);
        while (reader.hasNextLine())
        {
            textData = reader.nextLine();
            editedTextData = extractInt(textData);
            Scanner scanner = new Scanner(editedTextData);
            while (scanner.hasNextInt())
            {
                textNumber = scanner.nextInt();
                if (textNumber >= 10)
                    System.out.println(textData);

            }
        }
    }

    static String extractInt(String str)
    {

        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll(" +", " ");

        return str;
    }

}
