package org.launchcode.exercises;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        Divide(10,0);
        Divide(10,5);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(studentFiles.get("Carl"));

        System.out.println(CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));


    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        try{
            if(y != 0){
                System.out.println(x/y);
                return x/y;
            } else{
                throw new ArithmeticException("Error: Cannot divide by zero.");
            }
        } catch(ArithmeticException e){
            System.out.println("Can't divide by zero silly goose.");
        }
        return 0;
    }

    public static int CheckFileExtension(String fileName)
    {
        char[] lastFourChars = new char[5];
        String lastFourCharsCastToString = "";
        // Write code here!
        try{
            fileName.getChars(fileName.length()-5,fileName.length(),lastFourChars,0);
            lastFourCharsCastToString = new String(lastFourChars);
        } catch(Exception e) {
            if(lastFourCharsCastToString.equals(null)|| lastFourCharsCastToString.equals("")){
                try{
                    throw new RuntimeException("Your filename was null of empty.");
                } catch(RuntimeException runtimeException) {
                    e.printStackTrace();
                    return -1;
                }
            }
        }
        if(lastFourCharsCastToString.equals(".java")){
            return 1;
        }  else {
            return 0;
        }
    }

}
