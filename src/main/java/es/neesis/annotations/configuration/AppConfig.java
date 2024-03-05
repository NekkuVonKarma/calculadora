package es.neesis.annotations.configuration;

import es.neesis.annotations.console.ConsoleMenu;
import es.neesis.annotations.services.CalculadoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.neesis.annotations")
public class AppConfig {

    @Bean
    public ConsoleMenu consoleMenu(CalculadoraService calculadoraService) {
        return new ConsoleMenu(calculadoraService);
    }
}
