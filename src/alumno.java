public class alumno {
    int codigo;
    String nombre;
    int Edad;

    public alumno() {
    }

    public alumno(int codigo, String nombre, int Edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
