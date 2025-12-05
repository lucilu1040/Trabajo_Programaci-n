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
public class Medicamento {
    private String nombre;
    private int dosis;
    private int frecuencia;
    private boolean cronico;
    private int duracion;

    public Medicamento(String nombre, int dosis, int frecuencia, boolean cronico, int duracion) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.cronico = cronico;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDosis() {
        return dosis;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public boolean isCronico() {
        return cronico;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setCronico(boolean cronico) {
        this.cronico = cronico;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //ANTES HAY QUE COMPROBAR SI ESTO FUNCIONA QUE NO ESTOY 100% SEGURO 
    //asumimos que el nombre del emdicamento, y si es cronico o no no se puedde cambiar
    public void modificarMedicamento() {
        Scanner s = new Scanner (System.in);
        System.out.println("Dosis nueva:");
        int dosis = s.nextInt();
        this.dosis = dosis;
        System.out.println("Frecuencia nueva:");
        int frecuencia = s.nextInt();
        this.frecuencia = frecuencia;
        System.out.println("Duración nueva:");
        int duracion = s.nextInt();
        this.duracion = duracion;
        s.close();
    }
    
    
    
    
}
