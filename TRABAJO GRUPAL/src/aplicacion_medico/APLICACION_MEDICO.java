/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion_medico;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author l.munozar.2023
 */
public class APLICACION_MEDICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Medico medico1 = new Medico("Pedro", 3424);
        Medico medico1 = new Medico("Irene",8761);
        TarjetaSanitaria tarjeta1 = new TarjetaSanitaria("Juan", "Calle Preciados,32", 915476325, 12345678, TarjetaSanitaria.tipoPaciente.BASIC);
        Medicamento medicamento1 = new Medicamento("Paracetamol", 1, 6, Medicamento.tipoTratamiento.TEMPORAL, 2);
        ArrayList<Medicamento> medicamentos1 = new ArrayList();
        medicamentos1.add(medicamento1);
        Consulta consulta1 = new Consulta("Dolor de cabeza", Consulta.TipoConsulta.PRESENCIAL, "Paracetamol cada 7 horas", medico1, tarjeta1, medicamentos1);
        Sistema sistema = new Sistema();
        
        
        TarjetaSanitaria tarjeta2 = new TarjetaSanitaria("Diego","Calle Arenal,2",67584120,54123447,TarjetaSanitaria.tipoPaciente.PREMIUM);
        Medicamento medicamento2 = new Medicamento("Nolotil",1,8,Medicamento.tipoTratamiento.TEMPORAL,4);
        Medicamento medicamento3 = new Medicamento("Frenadol",1,7,Medicamento.tipoTratamiento.TEMPORAL,4);
        ArrayList<Medicamento> medicamentos2 = new ArrayList();
        medicamentos2.add(medicamento2);
        medicamentos2.add(medicamento3);
        Consulta consulta2 = new Consulta("Gripe",Consulta.TipoConsulta.PRESENCIAL,"Frenadol,si te duele Nolotil y no te quites la mascarilla.",medico1,tarjeta2,medicamentos2);
        
        TarjetaSanitaria tarjeta3 = new TarjetaSanitaria("Lara", "Calle de la Paz", 689475122, 67412358, TarjetaSanitaria.tipoPaciente.ADVANCED);
        Medicamento medicamento4 = new Medicamento("Omeoprazol", 1,1, Medicamento.tipoTratamiento.CRONICO, 1000000000);
        ArrayList<Medicamento> medicamentos3 = new ArrayList();
        medicamentos1.add(medicamento4);
        Consulta consulta3 = new Consulta("Reflujo", Consulta.TipoConsulta.PRESENCIAL, "Dieta blanda y omeoprazol", medico1, tarjeta3, medicamentos3);
        
        Medicamento medicamento5 = new Medicamento("Ibuprofeno",1,5,Medicamento.tipoTratamiento.TEMPORAL,8);
        ArrayList<Medicamento> medicamentos4 = new ArrayList();
        medicamentos4.add(medicamento5);
        
        
        sistema.verHistorial(tarjeta2);
        sistema.verDatosPaciente(tarjeta1);
        Consulta consulta8 = new Consulta("Dolor de tobillo",Consulta.TipoConsulta.PRESENCIAL,"Reposo y hielo",medico1,tarjeta1,medicamentos4);
        sistema.anadirConsulta(consulta8);
        
        LocalDate fechaActual = LocalDate.now();
        sistema.dineroRecaudado(fechaActual);
        
        sistema.verConsulta(100002, fechaActual);
        
        sistema.verTodasConsultas(medico1);
    
}}
