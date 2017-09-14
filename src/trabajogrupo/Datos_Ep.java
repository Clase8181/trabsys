package trabajogrupo;
public class Datos_Ep {
    private String EstadoCivil;
    private String Profesion;
public Datos_Ep(){

}
     
public Datos_Ep(String EstadoCivil){
this.EstadoCivil=EstadoCivil;
}

public Datos_Ep(String EstadoCivil, String Profesion){
this.EstadoCivil=EstadoCivil;
this.Profesion=Profesion;
}

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }




}


