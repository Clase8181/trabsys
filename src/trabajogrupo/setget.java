package trabajogrupo;
public class Persona {
    


Persona persona = new Persona( );
 
persona.setNombre("Sebastián");
persona.setApellidos("Barrionuevo");
persona.setEdad(23);
persona.setSexo(true);
 
String nombreCompleto = persona.getNombre( ) + " " + persona.getApellidos( );
}