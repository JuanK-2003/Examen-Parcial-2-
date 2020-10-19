package Clases;

/**
 *
 * @author Juan_K
 */
public abstract class Usuario {
    protected String NIT;
    protected String nombre_Usuario;
    
    public Usuario(){
        
    }

    public Usuario(String NIT, String nombre_Usuario) {
        this.NIT = NIT;
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }
    
}
