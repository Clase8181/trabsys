
package trabajogrupo;


public class Arquitecto {
   
    private String lugarTrabajo;
    private String titulo;
    private String profesion;
    
    
public Arquitecto(){






}

    public Arquitecto(String lugarTrabajo, String titulo, String profesion) {
        this.lugarTrabajo = lugarTrabajo;
        this.titulo = titulo;
        this.profesion = profesion;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    }
