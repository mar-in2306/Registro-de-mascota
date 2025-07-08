/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Propietario {
   
    private String nombre;
    private int documento;
    private int telefono;
    private List<Mascota> mascotas;

    public Propietario(String nombre, int documento, int telefono) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido.");
        if (documento <= 0) throw new IllegalArgumentException("Documento debe ser positivo.");
        if (telefono <= 0) throw new IllegalArgumentException("Teléfono debe ser positivo.");
        
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }

     public void agregarMascota(Mascota mascota) {
        if (mascota == null) throw new IllegalArgumentException("Mascota no puede ser nula.");
        mascotas.add(mascota);

    }

    public void mostrarInformacionCompleta() {
        System.out.println("===== FICHA CLÍNICA =====");
        System.out.println("👤 Propietario: " + nombre);
        System.out.println("🆔 Documento: " + documento);
        System.out.println("📞 Teléfono: " + telefono);
        System.out.println();

        for (Mascota mascota : mascotas) {
            mascota.mostrarInformacion();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
}

