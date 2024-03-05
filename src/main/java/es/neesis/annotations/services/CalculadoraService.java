package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    // Aunque no es necesario, vamos a intentar seguir el principio de inyección de dependencias añadiendo el constructor vacío.
    public CalculadoraService() {
    }

    public int realizarSuma(int operando1, int operando2){
        return operando1 + operando2;
    }

    public int realizarResta(int operando1, int operando2){
        return operando1 - operando2;
    }

    public int realizarMultiplicacion(int operando1, int operando2){
        return operando1 * operando2;
    }

    public float realizarDivision(int operando1, int operando2){
        return (float) operando1 / operando2;
    }
}
