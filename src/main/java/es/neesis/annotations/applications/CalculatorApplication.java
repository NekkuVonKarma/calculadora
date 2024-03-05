package es.neesis.annotations.applications;

import es.neesis.annotations.console.ConsoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApplication {

    private ConsoleMenu consola;

    // Inyectamos el bean de ConsoleMenu mediante constructor, no es necesario ponerle autowired. Si lo hiciesemos
    // mediante autowired, lo pondríamos directamente sobre private ConsoleMenu consola y nos olvidamos del constructor.
    public CalculatorApplication(ConsoleMenu consola) {
        this.consola = consola;
    }

    public void run(){
        consola.startMenu();
    }
}
