
package correo.modelo;

import java.util.ArrayList;
import java.util.Scanner;


public class Mailbox {
    private ArrayList<Mail> mails;
        
    public Mailbox(ArrayList<Mail> mails){
        this.mails = new ArrayList<>();
    }
    
    Scanner lector = new Scanner(System.in);

    public void registrarMail(){
        System.out.println("Registrar mail");
        System.out.println("Escriba el contenido del mail: "); 
        String contenido = lector.nextLine();
        System.out.println("De: ");
        String nombreE = lector.nextLine();
        System.out.println("Telefono: ");
        String telefonoE = lector.nextLine();
        System.out.println("Para: ");
        String nombreR = lector.nextLine();
        System.out.println("Telefono: ");
        String telefonoR = lector.nextLine();
        
        Mail nuevoCorreo = new Mail(contenido, new Person(nombreE , telefonoE), new Person(nombreR , telefonoR));
        this.mails.add(nuevoCorreo);
    }
    
 
    
    
    public void mailsxPersona(){
        System.out.println("Escriba el nombre de la persona para el que desea ver sus mails enviados: ");
        String persona = lector.nextLine();
        for (int i = 0; i < mails.size(); i++) {
            if(persona.compareTo(mails.get(i).getEmisor().getNombre()) == 0){
                System.out.println("Los mails enviados por " + persona + " son: " + mails.get(i).getContenido());
            } 
            
        }
        
    }
    
    
    public void personaMasMailsRecibidos(){
        
        
           
            
            
        
    }
        
        
        
    
}
