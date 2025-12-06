/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.util.Scanner;

/**
 *
 * @author l.munozar.2023
 */
public class TarjetaSanitaria {

    //creo que es mucho mas fácil usar el enum para el tipo de paciente que hacer clases hijas
    public enum tipoDescuento{
        BASIC, ADVANCED, PREMIUM
    }
    private String nombre;
    private String direccion;
    private long telefono;
    private final int CIP;
    private long DNI;
    private tipoDescuento descuento;
    private HistorialPaciente historial;
    private static int generadorCIP = 100000;

    public TarjetaSanitaria(String nombre,String direccion,long telefono,long DNI,tipoDescuento descuento,HistorialPaciente historial){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.CIP = generadorCIP;
        generadorCIP+=1;
        this.DNI = DNI;
        this.descuento = descuento;
        this.historial = historial;
    }

    public  tipoDescuento getDescuento(){
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

    public static String verDatos(TarjetaSanitaria tarjeta){
        return "";

    }


    //asumimos que el nombre, cip, dni e historial no se pueden modificar
    public void modificarTarjeta() {
        Scanner s = new Scanner (System.in);
        System.out.println("Dirección nueva:");
        String direccion = s.next();
        this.direccion = direccion;
        System.out.println("Telefono nuevo:");
        long telefono = s.nextLong();
        this.telefono = telefono;
        System.out.println("Descuento nuevo:");
        String descuento = s.next();
        tipoDescuento tipo = tipoDescuento.valueOf(descuento);
        if(tipo.equals(tipoDescuento.ADVANCED)){
            this.descuento = tipoDescuento.ADVANCED;
        } else if(tipo.equals(tipoDescuento.PREMIUM)){
            this.descuento = tipoDescuento.PREMIUM;
        } else {
            this.descuento = tipoDescuento.BASIC;
        }
        s.close();
    }




}
