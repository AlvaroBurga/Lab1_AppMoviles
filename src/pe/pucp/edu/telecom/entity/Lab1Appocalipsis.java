/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.pucp.edu.telecom.entity;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Lab1Appocalipsis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in);
       boolean end = false;
       while(!end)
       {
            System.out.println("Opcion 1: Leer datos");
            System.out.println("Opcion 2: Agregar usuario");
            System.out.println("Opcion 3: Buscar usuario");
            System.out.println("Opcion 4: Escribir Directorio");
            System.out.println("Opcion 5: Salir");
            System.out.print("Escoja su opcion: ");
            String a=sc.nextLine();
            switch(a)
            {
                case "1":
                {
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
                    end=true;
                    break;
                }
                default:
                {
                    try
                    {
                        int num= Integer.parseInt(a);
                        System.out.println("Opcion erronea");
                    }catch(NumberFormatException e)
                    {
                        System.out.println("Por favor ingrese un numero");
                    }
                }
             }
    
        }
    }
    
}
