/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeclientes.dto;

import java.util.Date;

/**
 *
 * @author Gonzalo
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;
    
    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public Date getFecha(){
        return fechaAlta;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = nombre;
        s[1] = apellidos;
        s[2] = fechaAlta.toString();
        s[3] = provincia;
        return s;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setFechaAlta(Date fechaAlta){
        this.fechaAlta = fechaAlta;
    }
    
    public void setProvincia(String provincia){
        this.provincia = provincia;
    }
}
