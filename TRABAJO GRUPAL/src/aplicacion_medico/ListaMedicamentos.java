/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.util.ArrayList;

/**
 *
 * @author l.munozar.2023
 */
public class ListaMedicamentos {
    private ArrayList<Medicamento> medicamentos = new ArrayList();

    public ArrayList<Medicamento> getMedicamento() {
        return medicamentos;
    }
    
    public void anadirMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
    
    
}
