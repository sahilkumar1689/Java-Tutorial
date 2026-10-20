package firstpackage;

public class Basic {
    public static void main(String[] args) {
        // Packages=A java package is a group of similar types of classes,interfaces and subpackages.Basically packages is used to categorised the classes and interfaces so that they can be easily maintained.It can also provide the access protection and naming collision.
        // syntax:
        // package userdefined_Name;
        
        // Step to make package:
        // 1. Firstly add the syntax line at the starting of the file.
        // 2. Write you full fledge code.
        // 3. In terminal firstly compile the program using code line:
        // javac -d . filename with extension.
        // e.g. = javac -d . basic.java.
        // 4. After execution you see in the folder menu a new folder is created whose name is similar to the package name and inside them a class file created.
        // 5. After that in the next line you need to interpret the machine code:
        // java newfoldername/filename only
        // e.g. = java firstpackage/basic

        System.out.println("Package executed.");
    }
}
