/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author Janeth
 */
import java.util.Scanner;
public class EjerciciosJavaJanethChuy {
    // Ejercicio 1: Determinar si un número es positivo, negativo o cero
    public void determinarSigno(int numero) {
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }
    }

    // Ejercicio 2: Verificar si un número es par o impar
    public void verificarParidad(int numero) {
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }

    // Ejercicio 3: Mostrar el mayor de tres números
    public void mostrarMayorDeTres(int num1, int num2, int num3) {
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }

    // Ejercicio 4: Determinar si un año es bisiesto
    public void determinarBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año ingresado es bisiesto.");
        } else {
            System.out.println("El año ingresado no es bisiesto.");
        }
    }

    // Ejercicio 5: Imprimir los números del 1 al 20 en orden ascendente
    public void imprimirNumerosDel1Al20() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Ejercicio 6: Imprimir números desde 1 hasta el número ingresado
    public void imprimirNumerosHasta(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Ejercicio 7: Sumar números positivos hasta ingresar un número negativo
    public void sumarNumerosPositivos() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num;
        do {
            System.out.print("Ingrese un número positivo (o un negativo para detenerse): ");
            num = scanner.nextInt();
            if (num >= 0) {
                suma += num;
            }
        } while (num >= 0);
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }

    // Ejercicio 8: Generar la secuencia de Fibonacci hasta un número ingresado
      public void generarFibonacciHasta(int limite) {
        int previo = 0;
        int actual = 1;
        System.out.print(previo + " " + actual + " ");
        int siguiente = previo + actual;
        while (siguiente <= limite) {
            System.out.print(siguiente + " ");
            previo = actual;
            actual = siguiente;
            siguiente = previo + actual;
        }
        System.out.println();
    } 
       // Ejercicio 9: Imprimir números pares del 2 al 20
    public void imprimirNumerosParesDel2Al20() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Ejercicio 10: Mostrar la tabla de multiplicar de un número del 1 al 10
    public void mostrarTablaDeMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Ejercicio 11: Sumar números pares desde 1 hasta n
    public void sumarNumerosParesHasta(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares desde 1 hasta " + n + " es: " + suma);
    }

    // Ejercicio 12: Calcular el factorial de un número
    public void calcularFactorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
