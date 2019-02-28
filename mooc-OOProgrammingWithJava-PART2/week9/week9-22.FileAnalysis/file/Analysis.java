/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {

        this.file = file;
    }

    public void openFile() throws FileNotFoundException {

        this.reader = new Scanner(file);

    }

    public void closeFile() throws FileNotFoundException {

        this.reader.close();
    }
    
    public void printAll() throws FileNotFoundException {
        
        openFile();
        
        while(reader.hasNextLine()) {
            
            String buffer = reader.nextLine();
            System.out.println(buffer);
            
        }
        
        closeFile();
        
    }

    public int lines() throws FileNotFoundException {

        int countLines = 0;
        openFile();

        while (reader.hasNextLine()) {

            String buffer = reader.nextLine();
            countLines++;

        }

        closeFile();
        return countLines;

    }
    
    public int characters() throws FileNotFoundException {
        
        int countChar = 0;
        openFile();
        
        while(reader.hasNextLine()){
            
        String buffer = reader.nextLine();
         countChar += buffer.length();
         countChar++;
          
        }
        
        closeFile();
        return countChar;
        
    }

}
