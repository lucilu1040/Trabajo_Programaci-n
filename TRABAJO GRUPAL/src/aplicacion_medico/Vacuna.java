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

    //Asumimos que la vacuna no puede ser cronica, y hay que mirr si el valor de duracion sobra tmb o no
    public Vacuna(String nombre, int dosis, int frecuencia, int duracion,String enfermedad) {
        super(nombre, dosis, frecuencia,tipoTratamiento.TEMPORAL ,duracion);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }
    
    
    
    
}
