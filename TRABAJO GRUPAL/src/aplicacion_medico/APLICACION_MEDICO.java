/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_medico;

import java.util.ArrayList;

/**
 *
 * @author l.munozar.2023
 */
public class APLICACION_MEDICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico medico1 = new Medico("Pedro", 3424);
        TarjetaSanitaria tarjeta1 = new TarjetaSanitaria("1", "2", 123456789, 12345678, TarjetaSanitaria.tipoPaciente.BASIC);
        Medicamento medicamento1 = new Medicamento("1", 1, 1, Medicamento.tipoTratamiento.TEMPORAL, 2);
        ArrayList<Medicamento> medicamentos1 = new ArrayList();
        medicamentos1.add(medicamento1);
        Consulta consulta1 = new Consulta("3", Consulta.TipoConsulta.PRESENCIAL, "4", medico1, tarjeta1, medicamentos1);
        Sistema sistema1 = new Sistema();
        HistorialConsulta historialConsultas = new HistorialConsulta();
        
        //sistema1.verDatosPaciente(tarjeta1);
        sistema1.anadirConsulta(consulta1);
        //sistema1.verHistorial(tarjeta1);
    }
    
}
