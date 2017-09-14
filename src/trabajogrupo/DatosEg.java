//creacion de constructores 
package trabajogrupo;
public class DatosEg {
    private int Edad;
    private String Genero;
  
   public DatosEg() {
       }
   
  public DatosEg(int Edad){
 this.Edad=Edad;
  }
  
  public DatosEg(String Genero){
     this.Edad=Edad;
     this.Genero=Genero; 
   
  }
//metodo set y get 
// para set es void y para get es String
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
  
}

