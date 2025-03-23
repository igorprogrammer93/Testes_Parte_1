import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testFiltrarSomenteMulheres() {
        List<String> entrada = Arrays.asList("Ana-F", "João-M", "Maria-F", "Pedro-M", "Carla-F");
        List<String> resultado = Main.filtrarMulheres(entrada);

        List<String> esperado = Arrays.asList("Ana", "Maria", "Carla");

        assertEquals(esperado, resultado);
        assertFalse(resultado.contains("João"));
        assertFalse(resultado.contains("Pedro"));
    }
}
