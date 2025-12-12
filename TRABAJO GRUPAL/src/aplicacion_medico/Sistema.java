/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author d.lavado.2023
 */

/*Me acabo de dar cuenta de que es probable que muchas de estas funciones hay que cambiar los ==, por metodo equals, pero si 
se necesita ya lo solucionamos rapido cuando lo probemos, por ahora seguimos mejor con el resto del codigo
Tmb vamos a tener que definir todos los toString para que queden, "bonitos" pq por ahora ni estan en las clases,
he usado el predetermiando en todos*/

public class Sistema implements gestionPaciente, gestionMedico, gestionAdministrativo{
    private HistorialConsulta historial;
    private ListaMedicamentos medicamentos;
    private ListaTarjetas tarjetas;
    
    //este metodo hay que remirarlo, esta mal es el que he dicho del UML AAAAAAAAAA
    //Creo que ya esta bien pero hay que comprobar si funciona, miento estaba mal ya lo he cambaido
    //Vale espero que ultimo apunte de esta funcion, pero no se si tiene sentido para luego la construccion, habra que verlo
    public void verHistorial(TarjetaSanitaria tarjeta){
        /*int i;
            for (i=0;i<tarjetas.getTarjetas().size();i++){
                if (tarjeta == tarjetas.getTarjetas().get(i)){
                    tarjetas.getTarjetas().get(i).getHistorial().verHistorial(tarjeta);
                }
    }*/
         tarjeta.getHistorial().verHistorial(tarjeta);       
    }
    //Hay que completar el verDatos en TarjetaSanitaria que esta vacio por ahora
    public void verDatosPaciente(TarjetaSanitaria tarjeta){
        System.out.println(TarjetaSanitaria.verDatos(tarjeta));
    }
    
    
    
    
    public void anadirConsulta(Consulta nueva) {
        historial.getConsultas().add(nueva);
    }

    public int dineroRecaudado(LocalDate date) {
        int dineroTotal = 0;
        int i;
        for (i = 0; i < historial.getConsultas().size(); i++) {
            if( date == historial.getConsultas().get(i).getFecha())
                dineroTotal+=historial.getConsultas().get(i).getPrecio();
        }
        
        return dineroTotal;
    }

    public Consulta verConsulta(int cip, LocalDate fecha) {
        // asumimos que un paciente solo tiene como maximo una consutla al dia
        int i;
        for (i = 0; i < historial.getConsultas().size(); i++) {
            if (historial.getConsultas().get(i).getCipPaciente() == cip && historial.getConsultas().get(i).getFecha().equals(fecha)) {
                return historial.getConsultas().get(i);
            }
        }
        return null;
    }

    public void verTodasConsultas(Medico medico) {
        int i;
        for (i = 0; i < historial.getConsultas().size(); i++) {
            //Corregir el if para que tenga sentido la consulta, debeia ser este estilo de "consulta"
            if (medico == historial.getConsultas().get(i).getMedico()) {
                System.out.println(historial.getConsultas().get(i).toString());
            }
        }

    }
    
    
    
    public void anadirMedicamento(Medicamento nuevo){
        medicamentos.getMedicamento().add(nuevo);
    }
    
    public void anadirTarjeta(TarjetaSanitaria nueva){
        tarjetas.getTarjetas().add(nueva);
    }
    
    public void eliminarMedicamento(Medicamento eliminar) {
        int i;
        for (i = 0; i < medicamentos.getMedicamento().size(); i++) {
            
            if (eliminar == medicamentos.getMedicamento().get(i)) {
                medicamentos.getMedicamento().remove(i);
            }
        }
    }
    
    public void eliminarTarjeta(TarjetaSanitaria eliminar) {
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            
            if (eliminar ==  tarjetas.getTarjetas().get(i)) {
                 tarjetas.getTarjetas().remove(i);
            }
        }
    }
    /*A partir de aqui hay que añadir metodos que interactuen sobre los sets de cada clase, no lo
    he hecho aquí pq me parecia más apropiado hacerlos en la clase, pero no los he hecho en la clase
    todavía así que tocará hacerlos jajaja----- En principio estan ya, hayq ue comprobar si funcionan
    Tmb, los toString de abajo, y el de arriba, habrá que crearlos tmb en la clase, principalmente para
    que salgan más apropiados y bonitos, y pq quiza luego debería dejar de ser toStrings,
    y que nos lo diera de otra manera para la interfaz gráfica, pero eso es problema de otro momento.
    */
    public void modificarMedicamento(Medicamento medicamento){
        int i;
        for (i = 0; i < medicamentos.getMedicamento().size(); i++) {
            
            if (medicamento == medicamentos.getMedicamento().get(i)) {
                medicamentos.getMedicamento().get(i).modificarMedicamento();
            }
        }
    }
    
    public void modificarTarjeta(TarjetaSanitaria tarjeta){
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            
            if (tarjeta ==  tarjetas.getTarjetas().get(i)) {
                 tarjetas.getTarjetas().get(i).modificarTarjeta();
            }
        }
    }
    
    public void verDatos(TarjetaSanitaria tarjeta){
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            
            if (tarjeta ==  tarjetas.getTarjetas().get(i)) {
                 System.out.println(tarjetas.getTarjetas().get(i).toString());
            }
        }
    }
    
    //creo que esta función hay que cambiarla para que tenga sentido buscar por el nombre del medicamento y no el medicamento en si
    public void verMedicamentos(Medicamento medicamento){
        int i;
        for (i = 0; i < medicamentos.getMedicamento().size(); i++) {
            
            if (medicamento == medicamentos.getMedicamento().get(i)) {
                System.out.println(medicamentos.getMedicamento().get(i).toString());
            }
        }
    }
    
    //creo que hay que hacer que lo ordene de otra manera, los dos de abajo
    //deberia estar ya, hayq  comprobar, y crear los ficheros de texto correspondientes en las carpetas
    public void listadoMedicamentos(){
        try{
            PrintStream flujo;
            flujo = new PrintStream(new FileOutputStream("ListaMedicamentos.txt"));
        
        int i;
        for (i = 0; i < medicamentos.getMedicamento().size(); i++) {
            flujo.println(medicamentos.getMedicamento().get(i).toString());
        }
        flujo.close();
            
        }catch (FileNotFoundException ex){
            System.err.println(ex + "Fichero no encontrado");
        }
    }
    
    public void listadoTarjetasCIP(){
        try{
            PrintStream flujo;
            flujo = new PrintStream(new FileOutputStream("ListaTarjetasCIP.txt"));
            
            ListaTarjetas.ordenarPorCIP();
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            flujo.println( tarjetas.getTarjetas().get(i).toString());
        }
        flujo.close();
        }catch (FileNotFoundException ex){
            System.err.println(ex + "Fichero no encontrado");
        }
    }
    
     public void listadoTarjetasDNI(){
        try{
            PrintStream flujo;
            flujo = new PrintStream(new FileOutputStream("ListaTarjetasDNI.txt"));
            
            ListaTarjetas.ordenarPorDNI();
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            flujo.println( tarjetas.getTarjetas().get(i).toString());
        }
        flujo.close();
        }catch (FileNotFoundException ex){
            System.err.println(ex + "Fichero no encontrado");
        }
    }
     
    
     
     //aqui en el UML tiene un metodo más q no se muy bien que es, aqui y en su clase padre, gestionAdmin.
     
     
     
     //Esta empezado pero espero que lo den en clase pq ahora mismo estoy dudando bastante,
     // pero algo se apañara si nos e dna en calse, a malas aprecido al año pasado
     
     /*public void hacerBackup(String rutaConsulta, String rutaMedicamento, String rutaMedico,
             String rutaRecetas, String rutaTarjetas){
         try{
             FileOutputStream out1 = new FileOutputStream(rutaConsulta);
             FileOutputStream out2 = new FileOutputStream(rutaMedicamento);
             FileOutputStream out3 = new FileOutputStream(rutaMedico);
             FileOutputStream out4 = new FileOutputStream(rutaRecetas);
             FileOutputStream out5 = new FileOutputStream(rutaTarjetas);
             ObjectOutputStream consulta = new ObjectOutputStream(out1);
             consulta.writeObject(HistorialConsulta);
             consulta.close();
             out1.close();
         }*/
     }


