/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    private ArrayList<Sede> sedes;
    private String nombre;

    public Universidad(ArrayList<Sede> sedes, String nombre) {
        this.sedes = sedes;
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
        this.sedes.add(nueva_sede);
        }
        if(tipo.equals("tecnologica")){
        tecnologica nueva_sede= new tecnologica(Nombre, direccion, telefono, Area);
        this.sedes.add(nueva_sede);
        }
        if(tipo.equals("educaion continua")){
        Ed_continuada nueva_sede= new Ed_continuada(Nombre, direccion, telefono, Area);
        this.sedes.add(nueva_sede);
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
    public String mostrar_sedes(){
        return "";
    }
    public void consultar_sede(String nombre){
        for(int i=0; i< this.sedes.size();i++){
            if(this.sedes.get(i).nombre.equals(nombre)){
                this.sedes.get(i).darInformacion();
                break;
            }
        }
    }
    
}
