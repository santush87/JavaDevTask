package org.example;
import Tasks.Duplicates;
import Tasks.StringReversing;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        First
        System.out.println("Enter string to reverse: ");
        String reversed = StringReversing.reverseString(sc.nextLine());
        System.out.println(reversed);

//        Second
//        System.out.println("Enter a text:");
//        String input2 = sc.nextLine();
//        int words = WordsCounter.countWords(input2);
//        System.out.println("Number of words: " + words);


//        Third
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

//        Fourth
        System.out.println("Enter a text:");
        String input3 = sc.nextLine();
        System.out.println("Duplicate characters:");
        Duplicates.findDuplicateCharacters(input3);

//        Fifth

    }
}
