
package correo.modelo;


public class Person {
    private String nombre;
    private String telefono;
   

    public Person(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

   
}
