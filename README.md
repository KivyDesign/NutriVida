# Guía VI - FINAL - “Proyecto Transversal: NutriVida”

## Vistas del Form principal Menú y los Frames de Gestión

Vistas finales de las pantallas que componen todo el Proyecto Transversal de Integración realizado durante la Etapa 6, desarrollado completamente por el Grupo 22

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/00.png)

<p align="center">Pantalla de Menú Principal</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/01.png)

<p align="center">Formulario: Gestión de Pacientes</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/02.png)

<p align="center">Formulario: Dieta Personal</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/03.png)

<p align="center">Formulario: Detalles de la Dieta</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/04.png)

<p align="center">Historial del Paciente</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/05.png)

<p align="center">Formulario: Gestión de Comidas</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/06.png)

<p align="center">Formulario: Gestión de Calorías</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/07.png)

<p align="center">Formulario: Gestión de Comidas</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/08.png)

<p align="center">Formulario: Gestión de Alimentos</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/09.png)

<p align="center">Formulario: Gestión de Alimentos filtrados por calorías</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/10.png)

<p align="center">Formulario: Control de Dietas</p>

![image](https://github.com/KivyDesign/NutriVida/blob/main/IMGs/11.png)

<p align="center">Pantalla de agradecimiento por todo el esfuerzo y la buena predisposición de los integrantes del equipo para salir adelante y completar el Proyecto Transversal de Integración. Gracias !TOTALES¡</p>

## INSTRUCTIVO:

> El proyecto será una aplicación en Java/MySQL. Se debe crear las tablas de la base de datos, y las correspondientes clases. Utilice una clase para la conexión y confeccione la interfaz gráfica (GUI). El grupo deberá presentar el proyecto en 3 etapas.

1. Entrega de:
   - Script de la base de datos completa, y captura de pantalla de vista diseñador.
   - Proyecto en NetBeans con todas las entidades del modelo.
   - Clase de conexión, ABM de la clase Paciente (PacienteData) y pruebas desde el main.
1. Desarrollo de todas las clases principales del dominio (ABM), consultas SQL embebidas. pruebas desde el main.
1. Implementación de todos los métodos necesarios, listados, ABM de clases relacionadas, interfaces gráficas y aplicación terminada.

> Se deben presentar las clases con atributos y métodos necesarios (abstracción). Setters y Getters (encapsulamiento). Constructor.

> Se evaluará el aporte de todos los miembros al proyecto, en la construcción de las clases. Se subirán los commit al repositorio público (GitHub).

# NUTRICIONISTA

La nutricionista al planificar la dieta para un paciente, y considera un conjunto de comidas.

* Una comida puede ser considerada para diferentes pacientes que realizan dieta.
* Una dieta se planifica para cada paciente y considera una lista de comidas.

## Clases y Relaciones

* Una nutricionista tiene pacientes con diferentes perfiles de dieta. Interesa saber su nombre completo, DNI, domicilio y celular. Peso actual (modificable) y peso deseado. Realizar el ABM paciente.
* Una comida tiene un nombre, un detalle y una cantidad de calorías por gramo. Realizar el ABM comida.
* Una dieta cuenta de una variedad de comidas, además tiene un paciente, una fecha de inicio, fecha de fin (finalizar dieta), un peso inicial y un peso buscado. ABM dieta.
* Una Dieta, se conforma (o compone de) por varios consumos diarios (le llamaremos DietaComida), y en cada consumo se vincula un alimento o comida en particular, en una porción. Ej. 250 gr. o 300 gr. Además se puede elegir en qué horario se asigna, esto es (enum) {“Desayuno”, “Almuerzo”, ”Merienda”, ”Cena”, “Snack”}

## Comportamientos

## Listar:

* Todos los pacientes cuya dieta esté terminada o vigente, y cuando es la fecha de culminación.
* Se necesita listar los pacientes que a la fecha de culminación, no han llegado al peso buscado.
* Se necesita saber las comidas incluidas en una dieta específica
* Se necesita agregar o quitar comidas, o bien modificar las porciones de comida, a una dieta en particular.
* Se necesita registrar un historial de cuánto pesa un paciente. El mismo podría registrar cambios en su peso.
* Consultar la búsqueda de comidas que tengan una cantidad menor de un determinado número de calorías.

![image](https://github.com/KivyDesign/NutriVida/blob/main/VistaDeDise%C3%B1ador.png)

<p align="center">Vista de Diseñador</p>

# Miembros del Equipo 22

<p align="center">© 2023 Creative Guido, all rights reserved. Made with ❤️ for a better web.</p>
<p align="center">@https://github.com/germanesalvatierra</p>
<p align="center">@https://github.com/KivyDesign</p>
<p align="center">@https://github.com/arielMilton</p>
<p align="center">@https://github.com/EnzoRey</p>

