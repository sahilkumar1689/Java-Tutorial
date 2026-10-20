
public class Stringbasic {
    public static void main(String[] args) {

        // 1. String = Basically string is a sequence of characters but in java string is an object that represent the sequence of character.The java.lang.String class is used to create a string object.

        // Ways of creating the string :

        // 1. Using string literals = In this we explicitly create string using "=" operator.String literal make java more memory efficient because in string literal no new object are created if there is already exists.
        // Syntax:
        // String object_name = "string_name";

        // e.g. :
        // String str="Sahil";
        // System.out.println(str);

        // 2. Using new keyword = In this we implicitly create string using dynamic memory allocation.
        // Syntax:
        // String object_name = new String("string_name");

        // e.g. :
        // String str1 = new String("Sahil Kumar");
        // System.out.println(str1);


        // Immutable String = In java string is immutable in nature it means that ones it's created their data cannot be changed but we create a new string at the place.
        // e.g.:
        // String name="Sahil";
        // name.concat("Kumar"); 
        // System.out.println(name.concat("Kumar")); 
        // System.out.println(name); // after concate function the name string will become same.

        // // After assigning:
        // name = name.concat("Kumar");
        // System.out.println(name);


        // String function:
        // 1. length()=Return the size of the string.
        // 2. tolowercase()=Return the string which is in lower case.
        // 3. touppercase()=Return the string which is in the upper case.
        // 4. trim()=Return a string by removing all the tralling and the leading zeroes.
        // 5. substring(start,end)=Return a substring from the starting index to the end index in which the starting index is included and the ending index is excluded.
        // 6. replace(old_char,new_char)=It replace all the occurance of the old char with the new char and return a new string.
        // 7. startsWith(string)=Return true or false if the original string starts with the given string.
        // 8. endsWith(string)=Return true or false if the original string ends with the given string.
        // 9. charAt(index)=Return the character at that index value.
        // 10. equals(string)=Return true if the original string is equal with the given one.But case sensitive.
        // 11. equlasIgnoreCase(string)=Return true if the original is equal with the given string case does'nt matters.
        // 12. indexOf(string)=Return the starting index of the string in the original string.You can also add one more parameter is index value after which checking start.
        // 13. lastIndexOf(string)=Return the ending index of the string in the original string.You can also add one more parameter is index value after which checking start.
        // 14.concat(string)=Return the new string after concate the original and the given string.


        // Memory Efficient = When we create our string object using the string literal they allocate memory at the special memory location in heap called string constant pool.It is memory efficient because it does'nt allocate memory of the predefined string.
        // On the other hand we can also create our string using dynamic memory allocation but in this we only use the heap storage not the string constant pool storage.It is comparitively less memory efficient.
        // We recommended to allocate memory using string literals.
        

    }
}
