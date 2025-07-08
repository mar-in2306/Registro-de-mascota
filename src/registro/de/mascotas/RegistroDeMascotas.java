/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro.de.mascotas;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Propietario;
import modelo.Consulta;
import modelo.Veterinario;
import modelo.Mascota;

/**
 *
 * @author usuario
 */
public class RegistroDeMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Propietario propietario = null;
            
            // Registro del propietario con validación
            while (propietario == null) {
                try {
                    System.out.println("====== Datos Propietario ========");
                    System.out.print("Ingrese su nombre: ");
                    String nombre = entrada.nextLine();
                    
                    int documento = leerEnteroPositivo(entrada, "Ingrese N.Documento: ");
                    int telefono = leerEnteroPositivo(entrada, "Ingrese N.Telefono: ");
                    
                    propietario = new Propietario(nombre, documento, telefono);
                } catch (IllegalArgumentException e) {
                    System.out.println("⚠️ Error: " + e.getMessage());
                }
            }
            
            int numMascotas = leerEnteroPositivo(entrada, "Ingrese el número de mascotas a registrar: ");
            
            for (int i = 0; i < numMascotas; i++) {
                Mascota mascota = null;
                while (mascota == null) {
                    try {
                        System.out.println("\n===== Mascota #" + (i + 1) + " =====");
                        System.out.print("Nombre Mascota: ");
                        String nombre = entrada.nextLine();
                        
                        System.out.print("Especie Mascota: ");
                        String especie = entrada.nextLine();
                        
                        int edad = leerEnteroNoNegativo(entrada, "Edad Mascota: ");
                        mascota = new Mascota(nombre, especie, edad);
                    } catch (IllegalArgumentException e) {
                        System.out.println("⚠️ Error: " + e.getMessage());
                    }
                }
                
                int numConsultas = leerEnteroPositivo(entrada, "¿Cuántas consultas desea registrar para " + mascota.getNombre() + "?: ");
                
                for (int j = 0; j < numConsultas; j++) {
                    Consulta consulta = null;
                    while (consulta == null) {
                        try {
                            System.out.println("\n--- Consulta #" + (j + 1) + " ---");
                            System.out.print("Código de la Consulta: ");
                            String codigo = entrada.nextLine();
                            
                            System.out.print("Fecha Consulta: ");
                            String fecha = entrada.nextLine();
                            
                            System.out.print("Veterinario Responsable: ");
                            String nombreVet = entrada.nextLine();
                            
                            System.out.print("Especialidad: ");
                            String especialidad = entrada.nextLine();
                            
                            Veterinario vet = new Veterinario(nombreVet, especialidad);
                            consulta = new Consulta(codigo, fecha, vet);
                            mascota.agregarConsulta(consulta);
                        } catch (IllegalArgumentException e) {
                            System.out.println("⚠️ Error: " + e.getMessage());
                        }
                    }
                }
                
                propietario.agregarMascota(mascota);
            }
            
            System.out.println("\n---------------------------");
            propietario.mostrarInformacionCompleta();
        }
    }

    // Métodos auxiliares para leer enteros
    public static int leerEnteroPositivo(Scanner entrada, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextInt()) {
                System.out.println("⚠️ Ingrese un número válido.");
                entrada.next();
            }
            valor = entrada.nextInt();
            entrada.nextLine(); // Limpia el salto de línea
            if (valor <= 0) {
                System.out.println("⚠️ El número debe ser mayor que cero.");
            }
        } while (valor <= 0);
        return valor;
    }

    public static int leerEnteroNoNegativo(Scanner entrada, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje);
            while (!entrada.hasNextInt()) {
                System.out.println("⚠️ Ingrese un número válido.");
                entrada.next();
            }
            valor = entrada.nextInt();
            entrada.nextLine(); // Limpia el salto de línea
            if (valor < 0) {
                System.out.println("⚠️ La edad no puede ser negativa.");
            }
        } while (valor < 0);
        return valor;
    }
}
