/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.pucp.edu.telecom.entity;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Lab1Appocalipsis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in);
       boolean end = false;
       while(!end)
       {
            System.out.println("Opcion 1: ");
            System.out.println("Opcion 2: ");
            System.out.println("Opcion 3: ");
            System.out.println("Opcion 4: ");
            System.out.println("Opcion 5: ");
            System.out.print("Escoja su opcion: ");
            String a=sc.nextLine();
            switch(a)
            {
                case "1":
                {
                    
                    String SEPARATOR=",";

                       BufferedReader br = null;

                       try {

                          br =new BufferedReader(new FileReader("C:\\Users\\a2015\\Documents\\NetBeansProjects\\Lab1_AppMoviles\\csv\\directorio_pucp.csv"));
                          String line = br.readLine();
                          while (null!=line) {
                             String [] fields = line.split(SEPARATOR);
                             System.out.println(Arrays.toString(fields));

                             line = br.readLine();
                          }

                       } catch (Exception e) {
                         // ...
                       } 
                    break;
                }
                case "2":
                {
                    break;
                }
                case "3":
                {
                    break;

                }
                case "4":
                {
                    break;
                }
                case "5":
                {
                    break;
                }
                default:
                {
                    end=true;
                }
             }
    
        }
    }
    
}
