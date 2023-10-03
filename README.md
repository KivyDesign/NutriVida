# NutriVida

## INSTRUCTIVO: El proyecto será una aplicación en Java / MySQL. Se debe crear las tablas de la base de datos, y las correspondientes clases. Utilice una clase para la conexión y confeccione la interfaz gráfica (GUI). El grupo deberá presentar el proyecto en 3 etapas.

1- Entrega de:

A. Script de la base de datos completa, y captura de pantalla de vista diseñador.
B. Proyecto en Netbean con todas las entidades del modelo.
C. Clase de conexión, ABM de la clase Paciente (PacienteData) y pruebas desde el main.

2- Desarrollo de todas las clases principales del dominio (ABM), consultas SQL embebidas. pruebas desde el main.

3- Implementación de todos los métodos necesarios, listados, ABM de clases relacionadas, interfaces gráficas y aplicación terminada.

Todas las entregas se realizarán usando un repositorio GitHub y compartiendo el link publico.

# NUTRICIONISTA

## Relaciones

• La nutricionista al planificar la dieta para un paciente, y considera un conjunto de comidas.
• Una comida puede ser considerada para diferentes pacientes que realizan dieta.
• Una dieta se planifica para cada paciente y considera una lista de comidas.

## Clases

• Una nutricionista tiene pacientes con diferentes perfiles de dieta. Interesa saber su nombre completo, DNI, domicilio y celular. Realizar el ABM paciente.
• Una comida tiene un nombre, un detalle y una cantidad de calorías. Realizar el ABM comida.
• Una dieta cuenta de una variedad de comidas, además tiene un paciente, una fecha de inicio, fecha de fin, un peso inicial y un peso buscado. ABM dieta.

## Comportamientos

• Se necesita listar los pacientes que a la fecha de fin no han llegado al peso buscado.
• Se necesita saber las comidas incluidas en una dieta específica y agregar o borrar comidas a una Dieta.
• Se necesita consultar la búsqueda de comidas que tengan una cantidad menor de un determinado número de calorías.

