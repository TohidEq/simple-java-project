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
        //myFirstObject.howToUseFormat();
        myFirstObject.mathMethods();
        
        //testRifle();
        
        
        
        
        
        
        
        
        
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
    
    public void stringMethods(){
        String mystr = "Hello, World!";
        
        
        // #1 foreach:
        System.out.println("#1");
        for(String x:mystr.split("")){
            System.out.println(x);
        }
        
        // #2
        System.out.println("#2");
        char arr2[] = mystr.toCharArray();
        for(char x:arr2){
            System.out.println(x);
        }
        
        
        // #3 switch case:
        System.out.println("switch case:");
        for(char x:arr2)
            switch(x){
                case 'l':
                    System.out.println("l founded");
                    break;
                case ' ':
                    System.out.println("spase founded");
                    break;
                default:
                    System.out.println("nothing");
            }
        
        
        // #4
        int myint4 = Integer.parseInt("1234");
        
        //equals()
        if("test".equals("test"))
            System.out.println("test == test");
        
        //length()
        System.out.println("legth of 'hello': "+ 
                            "hello".length());
        
        //charAt()
        System.out.println("\"hello\".charAt(2): "+
                            "hello".charAt(2));
        
        //replace():
        System.out.println(
                mystr.replace("l", "x")
        );
        
        
    }
    
    public void mathMethods(){
        System.out.println("max(2,5): "+Math.max(2, 5));
        
        System.out.println("min(2,5): "+Math.min(2, 5));
        
        System.out.println("pow(3,4)[3 be tavaane 4]: "+Math.pow(3, 4));
        
        System.out.println("sqrt(36)[jazre 36]: "+Math.sqrt(36));
        
        System.out.println("round(3.33)[gerd kardan]: "+Math.round(3.33));
        System.out.println("round(3.5): "+Math.round(3.5));
        System.out.println("round(3.53): "+Math.round(3.53));
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