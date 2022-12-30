/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.text.MessageFormat;

/**
 *
 * @author tohid
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        TestClass myFirstObject = new TestClass();
        myFirstObject.howToUseFormat();
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
class TestClass{

    
    
    public void howToGetInput(){
        // imports:
        // import java.util.Scanner;

        Scanner userInput = new Scanner(System.in);
        
        String  testUserInput1 = userInput.nextLine();
        int     testUserInput2 = userInput.nextInt();
        
        
        
        System.out.println("inputs: \nA: "+testUserInput1+"\nB: "+testUserInput2);
        userInput.close();
        
        
        
        
        Scanner myCustomInput = new Scanner("test1/1234/test3");
        
        myCustomInput.useDelimiter("/");
        
        String  testCustomInput1 = myCustomInput.next();
        int     testCustomInput2 = Integer.parseInt(myCustomInput.next());
        String  testCustomInput3 = myCustomInput.next();

        
        
        System.out.println("custom inputs: \nA: "+testCustomInput1+"\nB: "+testCustomInput2+"\nC: "+testCustomInput3);
        myCustomInput.close();

    }
    
    public void howToUseFormat(){
        System.out.format("Double: %d, String: %s, Float: %f, Boolean: %b, Char: %c \n", 
                                        13452,"hi",3.14,true,'X');
        
        System.out.println(
                String.format("Double: %d, String: %s, Float: %f, Boolean: %b, Char: %c \n", 
                                        13452,"hi",3.14,true,'X')
        );
        
        // imports:
        // import java.text.MessageFormat;
        String x = MessageFormat.format("test {0}, and two {1} ", 123431321, "'hi'");
        System.out.println(x);
    }
    
}