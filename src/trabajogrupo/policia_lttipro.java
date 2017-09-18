package trabajogrupo;
public class policia_lttipro {
    private String lugartrabajo;
    private String titulo;
    private String profesion;
    
    public policia_lttipro(){
    }

    public policia_lttipro(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }

    public policia_lttipro(String lugartrabajo, String titulo, String profesion) {
        this.lugartrabajo = lugartrabajo;
        this.titulo = titulo;
        this.profesion = profesion;
    }
//metodos set y get
    public String getLugartrabajo() {
        return lugartrabajo;
    }

    public void setLugartrabajo(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    }

