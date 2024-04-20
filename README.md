# Java Project with Maven

This repository contains a Java project built with Maven. The project consists of five classes, each serving a specific purpose. Below is an overview of each class and its functionalities:

## Classes

1. **StringReversing**
    - This class contains a method `reverseString(String input)` which reverses a given string without using the integrated Java method `reverse()`.

2. **WordCounter**
    - The `WordCounter` class provides a method `countWords(String input)` to count the number of words in the given text.

3. **ArrayListIterator**
    - This class offers two methods:
        - `arrayListIteratorUsingFor(ArrayList<String> array)`: Iterates through and prints the data from the ArrayList using a for loop.
        - `arrayListIteratorUsingWhile(ArrayList<String> array)`: Iterates through and prints the data from the ArrayList using a while loop.

4. **Duplicates**
    - The `Duplicates` class contains a method `findDuplicateCharacters(String input)` which identifies characters that appear more than once in a string and displays the number of times they are repeated.

5. **ExcelReader**
    - The `ExcelReader` class includes a method `readExcel(String file)` to read an Excel file. A sample file named `Test.xlsx` is provided in the `resources` directory for testing purposes.

## Getting Started

To use these classes in your project, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/santush87/JavaDevTask.git
```

2. Open the project in your preferred Java IDE.

3. Import the project as a Maven project.

4. You can now use the classes and methods provided in your Java project.

## Dependencies
This project is built using Maven. Make sure you have Maven installed on your system. There are no additional dependencies required beyond what is provided by Maven itself.

## Testing Instructions

To test the methods in the `Main` class, follow these steps:

1. Open the `Main` class located in the `src/main/java` directory.

2. In the `main` method, uncomment the lines of code that invoke the methods you want to test.

3. Run the `Main` class.

4. Verify the output in the console to ensure that the methods are functioning correctly.

## Contributing
If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request. Contributions are welcome!

