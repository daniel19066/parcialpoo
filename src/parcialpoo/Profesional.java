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
public class Profesional extends Sede{
    private int n_prog_calidad;
    public ArrayList<Programa> programas;

    public Profesional(String nombre, String direccion, String telefono, double Area) {
        super(nombre, direccion, telefono, Area);
        this.programas=new ArrayList<>();        
    }
    

    @Override
    public String darInformacion() {
        String x= "Nombre:"+this.nombre +"direccion:"+this.direccion+"telefono:"+this.telefono +"programas de calidad:"+this.n_prog_calidad;
        return x;
    }
    
    public void programas_tecnicos_continuada(){
        
    }

    public int getN_prog_calidad() {
        return n_prog_calidad;
    }

    public void setN_prog_calidad(int n_prog_calidad) {
        this.n_prog_calidad = n_prog_calidad;
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
