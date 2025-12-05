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
public class HistorialPaciente {
    private static ArrayList<Receta> recetados;
    private TarjetaSanitaria tarjeta;   
 

    public ArrayList<Receta> getRecetados() {
        return recetados;
    }

    public TarjetaSanitaria getTarjeta() {
        return tarjeta;
    }
    
    public static void verHistorial(TarjetaSanitaria tarjeta){
        int i;
        for(i=0; i<recetados.size();i++){
            System.out.println(recetados.get(i).toString());
        }
    }
}
