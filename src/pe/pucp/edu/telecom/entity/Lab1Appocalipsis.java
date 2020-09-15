/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.pucp.edu.telecom.entity;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import pe.pucp.edu.telecom.entity.base.Usuario;
import pe.pucp.edu.telecom.manager.DirectorioTelefonico;

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
        DirectorioTelefonico dt = new DirectorioTelefonico();
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
                    System.out.println("Escriba el codigo de su usuario");
                    String codigo = sc.nextLine();
                     System.out.println("Escriba el nombre de su usuario");
                    String nombre = sc.nextLine();
                     System.out.println("Escriba el apellido de su usuario");
                    String apellido = sc.nextLine();
                     System.out.println("Escriba el telefono de su usuario");
                    String Telefono = sc.nextLine();
                    System.out.println("Escriba el anexo de su usuario");
                    int anexo = Integer.parseInt(sc.nextLine());
                    System.out.println("Escriba el Departamento de su usuario (ING, CIE, LET)");
                    String Departamento = sc.nextLine();
                   
                    System.out.println("Es Docente o administrativo (D/A)");
                    String aux=sc.nextLine();
                    if(aux.equalsIgnoreCase("D"))
                    {
                        System.out.println("Cual es su año de inicio");
                        int año=Integer.parseInt(sc.nextLine());
                        
                        System.out.println("Es profesor, jefe de practica o instructor (P/J/I)");
                        String aux2=sc.nextLine();
                        if(aux2.equalsIgnoreCase("P"))
                        {
                            System.out.println("Indique su facultad");
                            String facultad=sc.nextLine();
                            Profesor profesor= new Profesor();
                            profesor.setAnexo(anexo);
                            profesor.setApellido(apellido);
                            profesor.setAño(año);
                            profesor.setCodigo(codigo);
                            profesor.setDepartamento(Departamento);
                            profesor.setFacultad(facultad);
                            profesor.setNombre(nombre);
                            profesor.setAnexo(anexo);
                            dt.agregar(profesor);
                        }
                        else if(aux2.equalsIgnoreCase("J"))
                        {
                            System.out.println("Indique el año de su egreso");
                            int egreso=Integer.parseInt(sc.nextLine());
                            JefeDePractica jp= new JefeDePractica();
                            jp.setAnexo(anexo);
                            jp.setApellido(apellido);
                            jp.setAño(año);
                            jp.setCodigo(codigo);
                            jp.setDepartamento(Departamento);
                            jp.setEgreso(egreso);
                            jp.setNombre(nombre);
                            jp.setAnexo(anexo);
                            dt.agregar(jp);                           
                        }
                        else
                        {
                            System.out.println("Indique en que ciclo va");
                            int ciclo=Integer.parseInt(sc.nextLine());
                            Instructor instructor= new Instructor();
                            instructor.setAnexo(anexo);
                            instructor.setApellido(apellido);
                            instructor.setAño(año);
                            instructor.setCodigo(codigo);
                            instructor.setDepartamento(Departamento);
                            instructor.setCiclo(ciclo);
                            instructor.setNombre(nombre);
                            instructor.setAnexo(anexo);
                            dt.agregar(instructor);
                        }
                        
                    }
                    else
                    {
                        System.out.println("Indique su cargo");
                        String cargo=sc.nextLine();
                        Administrativo admin= new Administrativo();
                        admin.setAnexo(anexo);
                        admin.setApellido(apellido);
                        admin.setCargo(cargo);
                        admin.setCodigo(codigo);
                        admin.setDepartamento(Departamento);
                        admin.setNombre(nombre);
                        admin.setAnexo(anexo);
                        dt.agregar(admin);
                    }
                    break;
                }
                case "3":
                {
                    System.out.println("Elija su palabra a buscar: ");
                    String palabra = sc.nextLine();
                    ArrayList<Usuario> resultados = new ArrayList<>();
                    for(Usuario i : dt.getLista())
                    {
                        if (i.getNombre().contains(palabra) || i.getApellido().contains(palabra))
                        {
                            resultados.add(i);
                        }
                    }
                    
                    //Ordenar la lista
                    
                    for(Usuario i : resultados)
                    {
                        System.out.println(i.getNombre() + " " +i.getApellido());
                    }
                    
                    System.out.println("¿Desea exportar su busqueda? (S/N)");
                    String aux = sc.nextLine();
                    if(aux.equalsIgnoreCase("S"))
                    {
                        try (FileWriter writer = new FileWriter("busqueda.csv"))
                    {
                        BufferedWriter bf = new BufferedWriter(writer);
                        for (Usuario i : resultados) 
                        {
                            String clase = i.getClass().getSimpleName();
                            bf.write(clase);
                            bf.write(",");
                            bf.write(i.getCodigo());
                            bf.write(",");
                            bf.write(i.getNombre());
                            bf.write(",");
                            bf.write(i.getApellido());
                            bf.write(",");
                            bf.write(i.getTelefono());
                            bf.write(",");
                            bf.write(i.getAnexo());
                            bf.write(",");
                            bf.write(i.getDepartamento());
                            bf.write(",");
                            if (i.getClass().getSimpleName().equalsIgnoreCase("profesor"))
                            {
                                Profesor p = (Profesor) i;
                                bf.write(p.getFacultad());
                            } else if(i.getClass().getSimpleName().equalsIgnoreCase("JefeDePractica"))
                            {
                                JefeDePractica jp = (JefeDePractica) i;
                                bf.write(jp.getEgreso());
                            }
                            else if(i.getClass().getSimpleName().equalsIgnoreCase("JefeDePractica"))
                            {
                                Instructor ins = (Instructor) i;
                                bf.write(ins.getCiclo());
                            }
                            else
                            {
                                Administrativo admin = (Administrativo) i;
                                bf.write(admin.getCargo());
                            }                             
                        }
                        bf.close();
                    } 
                    }
                    
                    break;

                }
                case "4":
                {
                    try (FileWriter writer = new FileWriter("escritura.csv"))
                    {
                        BufferedWriter bf = new BufferedWriter(writer);
                        for (Usuario i : dt.getLista()) 
                        {
                            String clase = i.getClass().getSimpleName();
                            bf.write(clase);
                            bf.write(",");
                            bf.write(i.getCodigo());
                            bf.write(",");
                            bf.write(i.getNombre());
                            bf.write(",");
                            bf.write(i.getApellido());
                            bf.write(",");
                            bf.write(i.getTelefono());
                            bf.write(",");
                            bf.write(i.getAnexo());
                            bf.write(",");
                            bf.write(i.getDepartamento());
                            bf.write(",");
                            if (i.getClass().getSimpleName().equalsIgnoreCase("profesor"))
                            {
                                Profesor p = (Profesor) i;
                                bf.write(p.getFacultad());
                            } else if(i.getClass().getSimpleName().equalsIgnoreCase("JefeDePractica"))
                            {
                                JefeDePractica jp = (JefeDePractica) i;
                                bf.write(jp.getEgreso());
                            }
                            else if(i.getClass().getSimpleName().equalsIgnoreCase("JefeDePractica"))
                            {
                                Instructor ins = (Instructor) i;
                                bf.write(ins.getCiclo());
                            }
                            else
                            {
                                Administrativo admin = (Administrativo) i;
                                bf.write(admin.getCargo());
                            }                             
                        }
                        bf.close();
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
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
