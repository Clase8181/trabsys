
package trabajogrupo;

public class DatosNc {
    
    private String Nacionalidad;
    private int Ci;
    
    public DatosNc ()
    {
        
    }
          
    public DatosNc (String Nacionalidad)
    {
        
        this.Nacionalidad = Nacionalidad;
           
    }
        
          
    public DatosNc (String Nacionalidad,int Ci)
    {
        this.Nacionalidad = Nacionalidad;
        this.Ci=Ci; 
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getCi() {
        return Ci;
    }

    public void setCi(int Ci) {
        this.Ci = Ci;
    }
    
    
    
    
}
