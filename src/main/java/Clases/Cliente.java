package Clases;

/**
 *
 * @author Juan_K
 */
public class Cliente extends Usuario {
    private double dinero_Gastado;

    public Cliente(){
        
    }
    public Cliente( String NIT, String nombre_Usuario) {
        super(NIT, nombre_Usuario);
        this.dinero_Gastado = 0.0;
    }

    public double getDinero_Gastado() {
        return dinero_Gastado;
    }

    public void setDinero_Gastado(double dinero_Gastado) {
        this.dinero_Gastado = dinero_Gastado;
    }
    
    public void gestion_Dinero(double dinero){
        this.dinero_Gastado += dinero;
    }
    public Object[] getinfo(){
        Object[] info = new Object [2];
        info[0] = this.nombre_Usuario;
        info[1] = this.dinero_Gastado;
        return info;
    }
}
