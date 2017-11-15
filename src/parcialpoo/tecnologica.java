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
public class tecnologica extends Sede {
    
    private int n_estudiantes;
    public ArrayList<Programa> programas;

    public tecnologica(String nombre, String direccion, String telefono, double Area) {
        super(nombre, direccion, telefono, Area);
        this.programas=new ArrayList<>();        
    }
    

    @Override
    public String darInformacion() {
        String x= "Nombre:"+this.nombre +"direccion:"+this.direccion+"telefono:"+this.telefono +"numero de estudiantes:"+this.n_estudiantes;
        return x;
    }

    public int getN_estudiantes() {
        return n_estudiantes;
    }

    public void setN_estudiantes(int n_estudiantes) {
        this.n_estudiantes = n_estudiantes;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }
    
}
