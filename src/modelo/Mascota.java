/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario
 */
public class Mascota {


    private String nombre;
    private String especie;
    private int edad;
    private List<Consulta> consultas;

    public Mascota(String nombre, String especie, int edad) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre de mascota inválido.");
        if (especie == null || especie.isBlank()) throw new IllegalArgumentException("Especie inválida.");
        if (edad < 0) throw new IllegalArgumentException("Edad no puede ser negativa.");

        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.consultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

 public void agregarConsulta(Consulta consulta) {
        if (consulta == null) throw new IllegalArgumentException("Consulta no puede ser nula.");
        consultas.add(consulta);
    }

    public void mostrarInformacion() {
        System.out.println("📋 Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
        System.out.println("Historial de consultas:");
        for (Consulta consulta : consultas) {
            consulta.mostrarConsulta();
            System.out.println("--------------------------");
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
}
