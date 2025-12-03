/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author l.munozar.2023
 */
public class Consulta {
    private String motivo;
    private boolean telefonica;
    private String diagnostico;
    private int cipPaciente;
    private LocalDate fecha;
    private int precio;
    private Medico medico;
    private ArrayList<Receta> medicamentos;
    
    public Consulta(String motivo,String diagnostico, int cipPaciente,LocalDate fecha,int precio,Medico medico){
        this.motivo = motivo;
        this.telefonica = false;
        this.diagnostico = diagnostico;
        this.cipPaciente = cipPaciente;
        this.fecha = fecha;
        this.precio = precio;
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean isTelefonica() {
        return telefonica;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public int getCipPaciente() {
        return cipPaciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public Medico getMedico() {
        return medico;
    }

    public ArrayList<Receta> getMedicamentos() {
        return medicamentos;
    }
    
    
    
}
