\# Registro de Mascotas 🐾



Este es un proyecto de consola en Java para llevar el registro de mascotas, sus propietarios, consultas médicas y veterinarios. Permite ingresar datos de forma interactiva y realizar validaciones básicas.



\## 🛠️ Tecnologías utilizadas



\- Java (JDK 8+)

\- NetBeans (estructura generada por el IDE)

\- Programación orientada a objetos



\## 📂 Estructura del Proyecto

Registro de Mascotas/

├── src/

│ ├── modelo/

│ │ ├── Consulta.java

│ │ ├── Mascota.java

│ │ ├── Propietario.java

│ │ └── Veterinario.java

│ └── registro/de/mascotas/

│ └── RegistroDeMascotas.java

├── manifest.mf

├── build.xml

└── .gitignore



\## 📋 Funcionalidades principales



\- Registro de un \*\*propietario\*\* con validación de datos.

\- Ingreso de una o varias \*\*mascotas\*\* asociadas al propietario.

\- Registro de \*\*consultas veterinarias\*\* para cada mascota.

\- Asociación de un \*\*veterinario\*\* por consulta.

\- Validaciones básicas para evitar datos erróneos.



\## ▶️ Ejecución



1\. Clona o descarga el repositorio.

2\. Abre el proyecto en NetBeans o tu IDE favorito.

3\. Ejecuta la clase `RegistroDeMascotas` ubicada en `src/registro/de/mascotas`.



\## 📦 Compilación por consola (opcional)



```bash

javac -d bin src/modelo/\*.java src/registro/de/mascotas/RegistroDeMascotas.java

java -cp bin registro.de.mascotas.RegistroDeMascotas

