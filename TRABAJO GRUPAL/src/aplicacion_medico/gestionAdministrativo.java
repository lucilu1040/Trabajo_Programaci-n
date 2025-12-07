/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_medico;

/**
 *
 * @author d.lavado.2023
 */
interface gestionAdministrativo {
    
    
    public void anadirMedicamento(Medicamento nuevo);
    
    public void anadirTarjeta(TarjetaSanitaria nueva);
    
    public void eliminarMedicamento(Medicamento eliminar);
    
    public void eliminarTarjeta(TarjetaSanitaria eliminar);
    
    public void modificarMedicamento(Medicamento medicamento);
    
    public void modificarTarjeta(TarjetaSanitaria tarjeta);
    
    public void verDatos(TarjetaSanitaria tarjeta);
    
    public void verMedicamentos(Medicamento medicamento);
    
    public void listadoMedicamentos();
    
    public void listadoTarjetasCIP();
    
    public void listadoTarjetasDNI();
}
