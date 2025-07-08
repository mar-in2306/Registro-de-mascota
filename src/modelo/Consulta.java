/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Consulta {
    private String codigo;
    private String fecha;
    private Veterinario veterinario;

    public Consulta(String codigo, String fecha, Veterinario veterinario) {
        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("Código inválido.");
        if (fecha == null || fecha.isBlank()) throw new IllegalArgumentException("Fecha inválida.");
        if (veterinario == null) throw new IllegalArgumentException("Veterinario no puede ser nulo.");

        this.codigo = codigo;
        this.fecha = fecha;
        this.veterinario = veterinario;
    }

    public void mostrarConsulta() {
        System.out.println("Consulta Código: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.print("Veterinario: ");
        veterinario.mostrarVeterinario();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    
}

