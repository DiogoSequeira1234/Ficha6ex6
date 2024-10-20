import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private Main numero;

    @BeforeEach
    public void setUp() {
        numero = new Main(); // Inicializa a instância de Numero antes de cada teste
    }

    @Test
    public void testMediaDigitosNumeroPositivo() {
        int num = 12345; // O número tem 5 dígitos: 1, 2, 3, 4, 5
        double mediaEsperada = 3.0; // (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3.0
        double resultado = numero.calcularMediaDigitos(num);
        assertEquals(mediaEsperada, resultado, 0.001); // Verifica a média com precisão de 3 casas decimais
    }
}

