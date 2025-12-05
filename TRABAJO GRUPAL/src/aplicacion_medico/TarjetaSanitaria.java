/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author l.munozar.2023
 */
public class TarjetaSanitaria {
    private String nombre;
    private String direccion;
    private long telefono;
    private final int CIP;
    private long DNI;
    private float descuento;
    private HistorialPaciente historial;
    
    public TarjetaSanitaria(String nombre,String direccion,long telefono,int CIP,long DNI,float descuento,HistorialPaciente historial){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.CIP = CIP;
        this.DNI = DNI;
        this.descuento = descuento;
        this.historial = historial;
    }
    
    public  float getDescuento(){
        return descuento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public int getCIP() {
        return CIP;
    }

    public long getDNI() {
        return DNI;
    }

    public HistorialPaciente getHistorial() {
        return historial;
    }
    
    public static void verDatos(TarjetaSanitaria tarjeta){
        
    }
    
    
    //asumimos que el nombre, cip, dni e historial no se pueden modificar
    public void modificarTarjeta() {
        this.direccion = direccion;
        this.telefono = telefono;
        this.descuento = descuento;
    }

    

    
}
