package es.neesis.annotations;

import es.neesis.annotations.applications.CalculatorApplication;
import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.console.ConsoleMenu;
import es.neesis.annotations.services.CalculadoraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculatorApplication calculator = new CalculatorApplication(new ConsoleMenu(new CalculadoraService()));
        calculator.run();
        System.out.println("--------------------");

    }
}
