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
public class HistorialPaciente {
    private ArrayList<Receta> recetados;
    private TarjetaSanitaria tarjeta;
    
    public HistorialPaciente(TarjetaSanitaria tarjeta){
        this.recetados = new ArrayList<>();
        this.tarjeta = tarjeta;
    }
 

    public ArrayList<Receta> getRecetados() {
        return recetados;
    }

    public TarjetaSanitaria getTarjeta() {
        return tarjeta;
    }
    
    //Hay que editar este metodo, para que nos de por separado los medicamentos actuales, pasados y vacunas
    //ya esta editado pero no se si del todo correcto, y sobretodo hay q mirar si nos viene bien que termine escribiendolo
    //ademas hay que mirar estos toString tmb, sobretodo pq nos interesa desde la receta llegar al de medicamento tmb
    public void verHistorial(TarjetaSanitaria tarjeta){
        int i;
        LocalDate hoy = LocalDate.now();
        for(i=0; i<recetados.size();i++){
            LocalDate fecha = recetados.get(i).getFecha();
            if (hoy.isBefore(fecha.plusDays(recetados.get(i).getMedicamento().getDuracion()+1))){
                System.out.println(recetados.get(i).toString());
            }
        }
        for(i=0; i<recetados.size();i++){
            LocalDate fecha = recetados.get(i).getFecha();
            if (hoy.isAfter(fecha.plusDays(recetados.get(i).getMedicamento().getDuracion()))){
                System.out.println(recetados.get(i).toString());
            }
        }
    }
}
