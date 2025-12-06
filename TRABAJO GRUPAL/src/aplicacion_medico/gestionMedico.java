/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.time.LocalDate;

/**
 *
 * @author d.lavado.2023
 */
interface gestionMedico {
        
        
        
        public void anadirConsulta(Consulta nueva);
        
        public int dineroRecaudado(LocalDate date);
        
        public Consulta verConsulta(int cip, LocalDate fecha);
            
        public void verTodasConsultas(Medico medico);
}
