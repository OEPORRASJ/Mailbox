
package correo.modelo;


public class Mail {
    private String contenido;
    
    private Person emisor;
    private Person receptor;

    public Mail(String contenido, Person emisor, Person receptor) {
        this.contenido = contenido;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Person getEmisor() {
        return emisor;
    }

    public void setEmisor(Person emisor) {
        this.emisor = emisor;
    }

    public Person getReceptor() {
        return receptor;
    }

    public void setReceptor(Person receptor) {
        this.receptor = receptor;
    }
    
    
    
}
