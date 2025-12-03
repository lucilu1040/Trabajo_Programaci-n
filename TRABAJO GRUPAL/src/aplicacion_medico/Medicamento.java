/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

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
    
    
    
    
}
