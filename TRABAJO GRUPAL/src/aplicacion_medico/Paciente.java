/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author d.lavado.2023
 */
public class Paciente {
    private TarjetaSanitaria tarjeta;
    private HistorialPaciente historial;
    
    public Paciente(TarjetaSanitaria tarjeta){
        this.tarjeta = tarjeta;
        
    }
    
    public int getCIP(){
        return tarjeta.getCIP();
    }
    
    public HistorialPaciente getHistorial(){
        return historial;
    }
}
