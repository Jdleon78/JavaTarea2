/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Janeth
 */
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EjerciciosJavaJanethChuy ejercicios = new EjerciciosJavaJanethChuy();

        // Ejercicio 1: Determinar si un número es positivo, negativo o cero
        System.out.print("Ingrese un número para determinar si es positivo, negativo o cero: ");
        int numero = scanner.nextInt();
        ejercicios.determinarSigno(numero);

        // Ejercicio 2: Verificar si un número es par o impar
        System.out.print("Ingrese un número para verificar si es par o impar: ");
        numero = scanner.nextInt();
        ejercicios.verificarParidad(numero);

        // Ejercicio 3: Mostrar el mayor de tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        ejercicios.mostrarMayorDeTres(num1, num2, num3);

        // Ejercicio 4: Determinar si un año es bisiesto
        System.out.print("Ingrese un año para determinar si es bisiesto: ");
        int año = scanner.nextInt();
        ejercicios.determinarBisiesto(año);

        // Ejercicio 5: Imprimir los números del 1 al 20 en orden ascendente
        System.out.println("Números del 1 al 20:");
        ejercicios.imprimirNumerosDel1Al20();

        // Ejercicio 6: Imprimir números desde 1 hasta el número ingresado
        System.out.print("Ingrese un número para imprimir los números desde 1 hasta ese número: ");
        numero = scanner.nextInt();
        ejercicios.imprimirNumerosHasta(numero);

        // Ejercicio 7: Sumar números positivos hasta ingresar un número negativo
        System.out.println("Ingrese números positivos para sumar (un número negativo para detenerse):");
        ejercicios.sumarNumerosPositivos();

        // Ejercicio 8: Generar la secuencia de Fibonacci hasta un número ingresado
        System.out.print("Ingrese un número para generar la secuencia de Fibonacci hasta ese número: ");
        numero = scanner.nextInt();
        ejercicios.generarFibonacciHasta(numero);

        // Ejercicio 9: Imprimir números pares del 2 al 20
        System.out.println("Números pares del 2 al 20:");
        ejercicios.imprimirNumerosParesDel2Al20();

        // Ejercicio 10: Mostrar la tabla de multiplicar de un número del 1 al 10
        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        numero = scanner.nextInt();
        ejercicios.mostrarTablaDeMultiplicar(numero);

        // Ejercicio 11: Sumar números pares desde 1 hasta n
        System.out.print("Ingrese un número para sumar los números pares desde 1 hasta ese número: ");
        numero = scanner.nextInt();
        ejercicios.sumarNumerosParesHasta(numero);

        // Ejercicio 12: Calcular el factorial de un número
        System.out.print("Ingrese un número para calcular su factorial: ");
        numero = scanner.nextInt();
        ejercicios.calcularFactorial(numero);
    }
}
