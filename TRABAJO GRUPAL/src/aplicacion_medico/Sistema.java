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
        int i;
            for (i=0;i<tarjetas.getTarjetas().size();i++){
                if (tarjeta == tarjetas.getTarjetas().get(i)){
                    tarjetas.getTarjetas().get(i).getHistorial().verHistorial(tarjeta);
                }
    }
                
    }
    //Hay que completar el verDatos en TarjetaSanitaria que esta vacio por ahora
    public void verDatosPaciente(TarjetaSanitaria tarjeta){
        System.out.println(TarjetaSanitaria.verDatos(tarjeta));
    }
    
    
    
    
    public void anadirConsulta(Consulta nueva) {
        historial.getConsultas().add(nueva);
    }

    public int dineroRecaudado(int LocalDate) {
        int dineroTotal = 0;
        int i;
        for (i = 0; i < historial.getConsultas().size(); i++) {

        }
        dineroTotal = dineroTotal + i * 50;
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
    public void listadoMedicamentos(){
        int i;
        for (i = 0; i < medicamentos.getMedicamento().size(); i++) {
            System.out.println(medicamentos.getMedicamento().get(i).toString());
        }
    }
    
     public void listadoTarjetas(){
        int i;
        for (i = 0; i <  tarjetas.getTarjetas().size(); i++) {
            System.out.println( tarjetas.getTarjetas().get(i).toString());
        }
    }
     
     //aqui en el UML tiene un metodo más q no se muy bien que es, aqui y en su clase padre, gestionAdmin.
}
