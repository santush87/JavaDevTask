package org.example.Tasks;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void readExcel(String fileName) {
        try {
            FileInputStream file = new FileInputStream(new File(fileName));
            Workbook workbook = WorkbookFactory.create(file);

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through each row of the sheet
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Print the cell value
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }

            // Close the workbook and file input stream
            workbook.close();
            file.close();
        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
    }
}
