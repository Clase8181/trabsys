
package trabajogrupo;

public class TsEt {
 public String tiposangre;
 public String etnia;
    

public TsEt(){
}
public TsEt(String obtenertiposangre){
           tiposangre= obtenertiposangre;
}
public TsEt(String obtenertiposangre, String obteneretnia){
            tiposangre= obtenertiposangre;
            etnia= obteneretnia;
}
            public static void main(String[] args) {
    
     TsEt Ts= new TsEt();
     TsEt Et= new TsEt();
     System.out.print("Son los datos"+Ts.getTiposangre()+Et.getEtnia());
}

    /**
     * @return the tiposangre
     */
    private String getTiposangre() {
        return tiposangre;
    }

    /**
     * @param tiposangre the tiposangre to set
     */
    private void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    /**
     * @return the etnia
     */
    private String getEtnia() {
        return etnia;
    }

    /**
     * @param etnia the etnia to set
     */
    private void setEtnia(String etnia) {
        this.etnia = etnia;
    }
}