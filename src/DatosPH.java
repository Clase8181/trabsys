
public class DatosPH {
    protected String Hobbi ="Video Juegos";
    protected String Peso ="120.gr";
     public DatosPH(){
    }
    public DatosPH(String ObtenerHobbie, String ObtenerPeso){
  
  Hobbi=ObtenerHobbie;
  Peso=ObtenerPeso;
  } 
    public static void main(String[] args) {
         DatosPH datH=new DatosPH(); 
         DatosPH datP=new DatosPH(); 
         //
    
   System.out.println("Este es Hobbie: "+datH.getHobbi()+" Este es el peso: "+datP.getPeso());
    }

    /**
     * @return the Hobbi
     */
    private String getHobbi() {
        return Hobbi;
    }

    /**
     * @param Hobbi the Hobbi to set
     */
    private void setHobbi(String Hobbi) {
        this.Hobbi = Hobbi;
    }

    /**
     * @return the Peso
     */
    private String getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    private void setPeso(String Peso) {
        this.Peso = Peso;
    }
}
