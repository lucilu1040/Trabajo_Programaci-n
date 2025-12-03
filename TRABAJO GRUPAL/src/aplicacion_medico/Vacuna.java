/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author l.munozar.2023
 */
public class Vacuna extends Medicamento {
    private String enfermedad;

    public Vacuna(String nombre, int dosis, int frecuencia, boolean cronico, int duracion,String enfermedad) {
        super(nombre, dosis, frecuencia, cronico, duracion);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }
    
    
    
    
}
