package org.example;

import org.example.Tasks.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating an array to use it later for iteration of arrays
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

        //TODO Uncomment the lines below to test the methods in the Main class
//        reversingString(sc); // First
//        countTheWordsInAString(sc); // Second
//        iterateArrayList(arrayList); // Third
//        findTheDuplicates(sc); // Fourth
//        ExcelReader.readExcel("src/main/resources/Test.xlsx"); // Fifth
    }

    //        First - reversing a string without using the reverse() built-in java function
    public static void reversingString(Scanner sc) {
        System.out.println("Enter string to reverse: ");
        String reversed = StringReversing.reverseString(sc.nextLine());
        System.out.println(reversed);
    }

    //        Second - count the number of words in a string using HashMap
    public static void countTheWordsInAString(Scanner sc) {
        System.out.println("Enter a text to count: ");
        String input = sc.nextLine();
        int words = WordsCounter.countWords(input);
        System.out.println("Number of words: " + words);
    }

    //        Third - iterate over an ArrayList using for, while
    public static void iterateArrayList(ArrayList<String> arrayList) {

        System.out.println("Iterating over the ArrayList using for loop:");
        ArrayListIterator.arrayListIterationUsingFor(arrayList);
        System.out.println();
        System.out.println("Iterating over the ArrayList using while loop:");
        ArrayListIterator.arrayListIterationUsingWhile(arrayList);
    }

    //        Fourth - find duplicate characters in a string
    public static void findTheDuplicates(Scanner sc) {
        System.out.println("Enter a text to find duplicates: ");
        String input = sc.nextLine();
        System.out.println("Duplicate characters:");
        Duplicates.findDuplicateCharacters(input);
    }
}
