/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author l.munozar.2023
 */
public class Medico {
    private String nombre;
    private final int IDENTIFICADOR;

    public Medico(String nombre, int IDENTIFICADOR) {
        this.nombre = nombre;
        this.IDENTIFICADOR = IDENTIFICADOR;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }
    
    
    
}
