/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupo;

/**
 *
 * @author LAB-18
 */
public class Artista {

private String lugardetrabajo;
private String titulo;
 private String Profesion;    

 public Artista(){ 
     
}

    public Artista(String lugardetrabajo) {
        this.lugardetrabajo = lugardetrabajo;
        
    }

    public Artista(String lugardetrabajo, String titulo, String Profesion) {
        this.lugardetrabajo = lugardetrabajo;
        this.titulo = titulo;
        this.Profesion = Profesion;
    
    //metodos get y set
   
    
    
    }

    public String getLugardetrabajo() {
        return lugardetrabajo;
    }

    public void setLugardetrabajo(String lugardetrabajo) {
        this.lugardetrabajo = lugardetrabajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
}