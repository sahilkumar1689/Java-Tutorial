// import java.util.*;
import java.io.*;

public class inputoutput {
    public static void main(String[] args){
        // 1. File Handling = File handling is one of the important feature of any programming language.

        // 1. To create a file = To create a file we have need to make a "File" class object and in the constructor pass the file name.After that use the createNewFile() method using the "File" object.Also surround all this code in the try catch block it is compulsary.

        // e.g.:

        // File NewFile = new File("Sahil.txt");

        //  try {
        //     NewFile.createNewFile();
        //     System.out.println("File create successfully.");
        // } catch (IOException e) {
        //     System.out.println("File not created.");
        //     e.printStackTrace();
        // }


        // 2. Writting from the file = To write in the file we need to make a "FileWritter" class object and in the constructor we need to pass the file name.
        // After that we have a write() method to write inside a file.Also surround the code inside the try catch block.After writting inside a file we need to close the file using close() method.
        
        // e.g.:

        // try {
        //     FileWriter writter = new FileWriter("Sahil.txt");
        //     writter.write("Hello World \nMy name is Sahil Kumar. \nI am a good boy.");
        //     System.out.println("Write Successfully.");
        //     writter.close();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // 3. Reading From the file = To read from the file we need to make a file object and gave any existing file name in the constructor.
        // After that we use scanner object to read inside them.

        // e.g.:

        // File myFile = new File("Sahil.txt");
        // try {
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         System.out.println(sc.nextLine());
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }


        // 4. Deleting the file = To delete the file we simple have a delete() method.

        // e.g.:
        File myFile2 = new File("Sahil.txt");

        if(myFile2.delete()) System.out.println("Delete successfully.");
        else System.out.println("Some problem arrises in the deletion.");

    }
}
