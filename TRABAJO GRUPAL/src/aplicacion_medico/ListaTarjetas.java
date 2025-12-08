/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author l.munozar.2023
 */
public class ListaTarjetas {
    //creo que este atributo puede ser estatico sin problema pero hay que mirarlo, nos viene bien para
    // el ordenar porDNI para los listados, que salen por fichero en la clase Sistema
    private static ArrayList<TarjetaSanitaria> tarjetas = new ArrayList<>();

    public static ArrayList<TarjetaSanitaria> getTarjetas() {
        return tarjetas;
    }
    
    public static void ordenarPorDNI(){
        tarjetas.sort(Comparator.comparingLong(TarjetaSanitaria::getDNI));
    }
    
    public static void ordenarPorCIP(){
        tarjetas.sort(Comparator.comparingInt(TarjetaSanitaria::getCIP));
    }
}