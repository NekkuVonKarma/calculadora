package es.neesis.annotations;

import es.neesis.annotations.applications.CalculatorApplication;
import es.neesis.annotations.configuration.AppConfig;
import es.neesis.annotations.console.ConsoleMenu;
import es.neesis.annotations.services.CalculadoraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Recuperamos el bean de CalculatorApplication desde el contexto
        CalculatorApplication calculator = context.getBean(CalculatorApplication.class);
        calculator.run();
        System.out.println("--------------------");

    }
}
