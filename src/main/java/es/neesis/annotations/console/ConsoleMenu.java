package es.neesis.annotations.console;

import es.neesis.annotations.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleMenu {
    private CalculadoraService calculadoraService;
    // Las inicializaciones deberíamos hacerlas en el constructor, no en la declaración.
    private Scanner scanner;

    // Igual que en el CalculatorApplication, no es necesario hacer autowired porque estamos inyectando el bean mediante constructor.
    public ConsoleMenu(CalculadoraService calculatorService) {
        this.calculadoraService = calculatorService;
        this.scanner = new Scanner(System.in);
    }

    public void startMenu() {
        // Hacer bucles sin condicion de salida es peligroso, ya que si no se sale del bucle, el programa se quedará colgado.
        // Mucho cuidado con esto, es mejor añadir líneas extra de código que no correr el riesgo de que el programa se quede colgado.
        Boolean salida = false;
        while (!salida) {
            System.out.println("Bienvenido a la calculadora, selecciona una operación: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Saliendo de la aplicación.");
                salida = true;
            }
            if(choice >= 1 && choice <= 4)
                performOperation(choice);
        }
    }

    private void performOperation(int choice) {
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Resultado: " + calculadoraService.realizarSuma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + calculadoraService.realizarResta(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calculadoraService.realizarMultiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + calculadoraService.realizarDivision(num1, num2));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}