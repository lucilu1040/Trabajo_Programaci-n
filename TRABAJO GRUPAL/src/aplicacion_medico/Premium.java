/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author l.munozar.2023
 */
public class Premium extends TarjetaSanitaria{

    public Premium(String nombre, String direccion, long telefono, int CIP, long DNI, float descuento,HistorialPaciente historial) {
        super(nombre, direccion, telefono, CIP, DNI, 2500,historial);
    }
    
    
    
    
    
    
}
