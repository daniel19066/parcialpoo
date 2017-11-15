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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String colegio;
    private String año_grad;
    private Programa programa;

    public Estudiante(String nombre, String apellido, String colegio, String año_grad, Programa programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.año_grad = año_grad;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getAño_grad() {
        return año_grad;
    }

    public void setAño_grad(String año_grad) {
        this.año_grad = año_grad;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    
}
