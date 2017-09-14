/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupo;

/**
 *
 * @author LDMM
 */
public class DatosNA {
    private String nombre;
    private String apellido;
    
    public DatosNA (){
        
    }
    
    public DatosNA (String nombre){
        this.nombre = nombre;
    }
    
    public DatosNA (String nombre, String apellido){
        this.nombre = nombre; 
        this.apellido = apellido;        
    }
    // metodos 

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
    
}
