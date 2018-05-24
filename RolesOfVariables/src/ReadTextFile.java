
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahika
 */
public class ReadTextFile {
    private int num;
    ArrayList <String> list = new ArrayList<>();
    private String [] stringArr;
    Scanner scan;
    static String text;
    static String everything;
    
    public ReadTextFile(int num){
        this.num =num;
    }
    
    public void readFile(){
        try {
            BufferedReader br = null;
        switch(num){
            case 1:
                 br = new BufferedReader(new FileReader("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\RolesOfVariables\\src\\Java Programs\\Sum.txt"));
                break;
                
            case 2: 
                br = new BufferedReader(new FileReader("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\RolesOfVariables\\src\\Java Programs\\doubles.txt"));
                break;
            case 3: 
                 br = new BufferedReader(new FileReader("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\RolesOfVariables\\src\\Java Programs\\Fibonacci.txt"));
                break;
            case 4: 
                br = new BufferedReader(new FileReader("C:\\Users\\Mahika\\Documents\\NetBeansProjects\\RolesOfVariables\\src\\Java Programs\\Palindrome.txt"));
                break;
                
            default: 
                System.out.print("Error!!!!");
                break;
        }
 
            try {
                 StringBuilder sb = new StringBuilder();
                text = br.readLine();
                
            
            while(text!=null){
                sb.append(text);
                sb.append(System.lineSeparator());
                text = br.readLine();
                list.add(text);
            }
            
            stringArr = list.toArray(new String [0]);
       
             everything = sb.toString();
             br.close();
             
            } catch (IOException ex) {
                Logger.getLogger(ReadTextFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        } catch (FileNotFoundException ex) {
          System.out.printf("Not working!");
        }
    }
    
    public String returnText (){
        if(everything!=null){
        return everything;
        }
        return "";
    }
    
    public String TrimText(){
        String text = everything.replaceAll("\t","");
        text = text.replace("\n", "").replace("\r", "");
        return text;
    }
}
