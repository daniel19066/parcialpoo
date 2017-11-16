/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    private ArrayList<Sede> sedes;
    private String nombre;

    public Universidad( String nombre) {
        this.sedes =new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadir_sede(String Nombre,String direccion,String telefono, double Area, String tipo){
        if(tipo.equals("profesional")){
        Profesional nueva_sede= new Profesional(Nombre, direccion, telefono, Area);
        Sede x=nueva_sede;
        this.sedes.add(x);
        }
        if(tipo.equals("tecnologica")){
        tecnologica nueva_sede= new tecnologica(Nombre, direccion, telefono, Area);
        Sede x=nueva_sede;
        this.sedes.add(x);
        }
        if(tipo.equals("educaion continua")){
        Ed_continuada nueva_sede= new Ed_continuada(Nombre, direccion, telefono, Area);
        Sede x=nueva_sede;
        this.sedes.add(x);
        }
    }
    public void eliminar_sede(String nombre){
        for(int i=0; i< this.sedes.size();i++){
            if(this.sedes.get(i).nombre.equals(nombre)){
                this.sedes.remove(i);
                break;
            }
        }
    }
    public void mostrar_sedes(File c) throws FileNotFoundException{
            PrintStream output= new PrintStream(c);
        for(int i=0;i<this.sedes.size();i++){
            output.println(this.sedes.get(i).darInformacion());
            for(int k=0;k<this.sedes.get(i).programas.size();i++){
            output.println(this.sedes.get(i).programas.get(k).mostrar_inf());
            }
        }
    }
    public void consultar_sede(String nombre){
        for(int i=0; i< this.sedes.size();i++){
            if(this.sedes.get(i).nombre.equals(nombre)){
                this.sedes.get(i).darInformacion();
                break;
            }
        }
    }
     public Sede mod_sede(String nombre){
         Sede x = null;
        for(int i=0; i< this.sedes.size();i++){
            if(this.sedes.get(i).nombre.equals(nombre)){
                x=this.sedes.get(i);
            }
        }
         return x;
     }
}
