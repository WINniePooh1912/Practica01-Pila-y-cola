# Practica 01 - Pila y Cola - Estructuras de Datos y Algoritmia

## Descripción

Este proyecto es una implementación básica de las estructuras de datos **Pila (Stack)** y **Cola (Queue)** en Java. Utilizando nodos enlazados, las operaciones básicas de ambas estructuras se implementan mediante clases que permiten al usuario agregar, eliminar y visualizar elementos de cada una de ellas.

El programa ofrece una interfaz de consola que permite al usuario interactuar con ambas estructuras mediante un menú, realizando operaciones como agregar un elemento, eliminar un elemento y visualizar la lista de elementos.

## Estructuras Implementadas

1. **Pila (Stack)**: LIFO (Last In, First Out). La pila permite agregar elementos al final de la lista y eliminarlos del principio (último agregado es el primero en salir).
2. **Cola (Queue)**: FIFO (First In, First Out). La cola permite agregar elementos al final de la lista y eliminarlos del principio (el primer agregado es el primero en salir).

## Funcionalidades

- **Pila**:
  - **Agregar Elemento**: Inserta un valor al inicio de la pila.
  - **Eliminar Elemento**: Elimina el primer elemento de la pila.
  - **Mostrar Elementos**: Muestra todos los elementos de la pila.

- **Cola**:
  - **Agregar Elemento**: Inserta un valor al final de la cola.
  - **Eliminar Elemento**: Elimina el primer elemento de la cola.
  - **Mostrar Elementos**: Muestra todos los elementos de la cola.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:

1. **Main.java**: Contiene la lógica principal del programa con el menú de opciones y la interacción con el usuario.
2. **Node.java**: Representa un nodo de la lista enlazada, con un valor entero y una referencia al siguiente nodo.
3. **Queue.java**: Implementa la estructura de datos **Cola** utilizando nodos enlazados.
4. **Stack.java**: Implementa la estructura de datos **Pila** utilizando nodos enlazados.

## Instrucciones de Uso

1. **Clonar o descargar el repositorio**:
   - Clona este repositorio en tu máquina local o descarga los archivos.

2. **Compilar el proyecto**:
   - Abre una terminal o un IDE (como IntelliJ IDEA o Eclipse).
   - Asegúrate de que los archivos estén en el mismo directorio o paquete.
   - Compila el proyecto ejecutando el siguiente comando:
     ```bash
     javac *.java
     ```

3. **Ejecutar el programa**:
   - Ejecuta el archivo `Main.java` para iniciar el programa:
     ```bash
     java Main
     ```

4. **Interactuar con el programa**:
   - El programa te presentará un menú de opciones. Puedes seleccionar entre las opciones de la **Pila** o **Cola**, agregar o eliminar elementos y ver el estado de la lista.
