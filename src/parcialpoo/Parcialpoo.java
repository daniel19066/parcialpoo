/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Parcialpoo {
//A)1. falso
    //2.verdadero
    //3.verdadero
    //4. falso
    //B) si se puede
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException{
        Scanner in=new Scanner(System.in);
        int x=0;
        x=in.nextInt();
        Universidad UN=new Universidad("u nacional");
        for(int i=0;i<x;i++){
            String nombre;
            String direccion;
            String telefono;
            double Area;
            String Tipo;
            System.out.println("ingrese nombre de sede:");
            nombre=in.next();
            System.out.println("ingrese direccion:");
            direccion=in.next();
            System.out.println("ingrese telefono:");
            telefono=in.next();
            System.out.println("ingrese area:");
            Area=in.nextDouble();
            System.out.println("ingrese Tipo:");
            Tipo=in.next();
            UN.añadir_sede(nombre, direccion, telefono, Area, Tipo);
        }
        File m= new File("prueba.txt");
        UN.mostrar_sedes(m);
    }
    
}
