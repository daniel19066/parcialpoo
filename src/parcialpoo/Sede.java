/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Estudiante
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected double Area;

    public Sede(String nombre, String direccion, String telefono, double Area) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.Area = Area;
    }
    
    public abstract String darInformacion();
    
}
