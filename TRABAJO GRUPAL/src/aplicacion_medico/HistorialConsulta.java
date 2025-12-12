/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.util.ArrayList;

/**
 *
 * @author d.lavado.2023
 */
public class HistorialConsulta {
    private ArrayList<Consulta> consultas;
    
    public HistorialConsulta(){
        this.consultas = new ArrayList();
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    public void anadirConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    
    
}
