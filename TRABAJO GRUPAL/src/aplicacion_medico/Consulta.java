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

/*Hay que cambiar cosas de esta clase relacionadas con las recetas, principalmente si eliminamos de por si las recetas
y metemos fecha en cada objeto de medicamento de por si

VALE, creo que no es necesario, es más creoq ue se gestiona bien lo de las recetas, pero si vemos que en realidad es lioso
o que realmente si que nos da problemas se elimina y se da hora a las medicinas, pero creo que tiene bastante mas sentido
con recetas
*/
public class Consulta {
    
    public enum TipoConsulta{
        PRESENCIAL, TELEFONICA
    }
    private String motivo;
    private TipoConsulta tipoConsulta;
    private String diagnostico;
    private int cipPaciente;
    private LocalDate fecha;
    private int precio;
    private Medico medico;
    private ArrayList<Receta> medicamentos;
    
    public Consulta(String motivo, TipoConsulta tipo, String diagnostico, int cipPaciente,LocalDate fecha,int precio,Medico medico){
        this.motivo = motivo;
        this.tipoConsulta = tipo;
        this.diagnostico = diagnostico;
        this.cipPaciente = cipPaciente;
        this.fecha = fecha;
        this.precio = precio;
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
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
