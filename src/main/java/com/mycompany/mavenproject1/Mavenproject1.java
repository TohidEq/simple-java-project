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
        
        
        testRifle();
        
        
        
        
        
        
        
        
        
    }
    
    public static void testRifle(){
        // :D
        Gun Ak_47 = new Rifle();
        for(int i =0; i<21; i++){
            Ak_47.shoot();  
            if(i%5==0)
                Ak_47.displayStatus();  
        }
        Ak_47.reload();
        Ak_47.displayStatus();
        for(int i =0; i<21; i++){
            Ak_47.shoot();
            if(i%5==0)
                Ak_47.displayStatus(); 
        }
        Ak_47.safeReload();
        Ak_47.displayStatus();
        
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





// interface:
interface InterfaceNum1{
    public void shoot();
}

/*  interface <- interface (extends)  */
interface InterfaceNum2 extends InterfaceNum1{
    public void reload();
}


/*  abstract class <- interface (impliments)  */
abstract class Gun implements InterfaceNum2{
    int bullets =30;
    int magazine = 120;
    public abstract void safeReload();
    public abstract void displayStatus();
}

/*  class <- abstract class (extends and @Override)   */
class Rifle extends Gun{
    
    public void shoot(){
        if(bullets==0)
            System.out.println("no bullets");
        else{
            System.out.println("Bang!");
            bullets-=1;
        }
    }
    
    public void reload(){
        if(magazine>=30 && bullets!=30){
            magazine-=30;
            bullets =30;
            System.out.println("Reloaded!");
        }
    
    }
    
    
    // its not safe... but, its ok :)
    @Override
    public void safeReload(){
        if(magazine>=30 && bullets!=30){
            magazine-=30-bullets;
            bullets=30;
            System.out.println("Safe Reloaded!");
        }
    }
    
    @Override
    public void displayStatus(){
        System.out.println("Bullets: "+bullets+ ", Magazine: "+magazine);
    }
    
    
}