package org.example;

import org.example.Tasks.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //TODO Uncomment the lines below to test the methods in the Main class

//        First - reversing a string without using the reverse() built-in java function
        System.out.println("Enter string to reverse: ");
        String reversed = StringReversing.reverseString(sc.nextLine());
        System.out.println(reversed);

//        Second - count the number of words in a string using HashMap
//        System.out.println("Enter a text:");
//        String input2 = sc.nextLine();
//        int words = WordsCounter.countWords(input2);
//        System.out.println("Number of words: " + words);


//        Third - iterate over an ArrayList using for, while
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Apple");
//        arrayList.add("Banana");
//        arrayList.add("Orange");
//        arrayList.add("Mango");
//
//        System.out.println("Iterating over the ArrayList using for loop:");
//        ArrayListIterator.arrayListIterationUsingFor(arrayList);
//        System.out.println();
//        System.out.println("Iterating over the ArrayList using while loop:");
//        ArrayListIterator.arrayListIterationUsingWhile(arrayList);

//        Fourth - find duplicate characters in a string
//        System.out.println("Enter a text:");
//        String input3 = sc.nextLine();
//        System.out.println("Duplicate characters:");
//        Duplicates.findDuplicateCharacters(input3);

//        Fifth - Reading Excel file
//        String file = "src/main/resources/Test.xlsx";
//        ExcelReader.readExcel(file);
    }
}
