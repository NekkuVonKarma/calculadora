package es.neesis.annotations.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "es.neesis.annotations")
public class AppConfig {
    // No es necesario añadir ningún bean aquí, ya que el componentScan se encarga de buscarlos y añadirlos al container.
}
