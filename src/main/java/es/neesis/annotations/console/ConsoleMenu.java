package es.neesis.annotations.console;

import es.neesis.annotations.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleMenu {
    private CalculadoraService calculadoraService;
    private Scanner scanner = new Scanner(System.in);

    @Autowired
    public ConsoleMenu(CalculadoraService calculatorService) {
        this.calculadoraService = calculatorService;
    }

    public void startMenu() {
        while (true) {
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
                break;
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