/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Veterinario {
    private String nombre;
    private String especialidad;

    public Veterinario(String nombre, String especialidad) {
          if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre del veterinario inválido.");
        if (especialidad == null || especialidad.isBlank()) throw new IllegalArgumentException("Especialidad inválida.");


        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarVeterinario() {
        System.out.println(nombre + " | Especialidad: " + especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}