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
public class Ed_continuada extends Sede {
    
    private String nombre_curso_pop;
    public ArrayList<Programa> programas;
    
    public Ed_continuada(String nombre, String direccion, String telefono, double Area) {
        super(nombre, direccion, telefono, Area);
        this.programas=new ArrayList<>();
    }

    @Override
    public String darInformacion() {
        String x= "Nombre:"+this.nombre +"direccion:"+this.direccion+"telefono:"+this.telefono +"curso popular:"+this.nombre_curso_pop;
        return x;
    }

    public String getNombre_curso_pop() {
        return nombre_curso_pop;
    }

    public void setNombre_curso_pop(String nombre_curso_pop) {
        this.nombre_curso_pop = nombre_curso_pop;
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
