package Clases;

import static Clases.productUtils.isInStock;

/**
 *
 * @author Juan_K
 */
public class Producto {
    protected String codigo;
    protected String nombre;
    protected int existencia;
    protected double precio;
    protected boolean inStock;
    
    public Producto(){
        
    }

    public Producto(String codigo, String nombre, int existencia, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
        this.inStock = isInStock.test(this.existencia);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    public void compra_Cantidad(int productos_Nuevos){
        this.existencia += productos_Nuevos;
    }
    public void venta_Cantidad(int producto_Comp){
        if(producto_Comp < this.existencia){
            this.existencia -= producto_Comp;
        }
    }
    
    public Object[] getinfArray(){
        Object[] infArray = new Object[4];
        infArray[0] = this.codigo;
        infArray[1] = this.nombre;
        infArray[2] = this.existencia;
        infArray[3] = this.precio;
        return infArray;
    }
}
