/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupo;

/**
 *
 * @author Karen
 */
public class Arquitecto {
    private String lugarTrabajo;
    private String titulo;
    private String Profesion;
    public Arquitecto(){
}

    public Arquitecto(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public Arquitecto(String lugarTrabajo, String titulo, String Profesion) {
        this.lugarTrabajo = lugarTrabajo;
        this.titulo = titulo;
        this.Profesion = Profesion;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
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
