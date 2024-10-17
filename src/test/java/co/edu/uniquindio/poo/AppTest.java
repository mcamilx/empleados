/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());


    @DisplayName("Test empleado tiempo completo")
    @Test
    public void testeEmpleadoCompleto() {
        LOG.info("Iniciado testeEmpleadoCompleto");
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Angela", "41963111");
        double salario = empleado.calcularSalario();
        double esperado = 2500000;
        assertEquals(esperado, salario);
        LOG.info("Finalizando testeEmpleadoCompleto");
    }

    @DisplayName("Test empleado por hora")
    @Test
    public void testEmpleadoPorHora() {
        LOG.info("Iniciado testEmpleadoPorHora");
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Santiago", "109076544", 6, 20000);
        double salario = empleado2.calcularSalario();
        double esperado = 120000;
        assertEquals(esperado, salario);
        LOG.info("Finalizando testEmpleadoPorHora");
    }

    @DisplayName("Test empleado freelance")
    @Test
    public void testEmpleadoFreelance() {
        LOG.info("Iniciado testEmpleadoFreelance");
        EmpleadoFreelance empleado3 = new EmpleadoFreelance("Camila", "1091203555", 2, 800000);
        double salario = empleado3.calcularSalario();
        double esperado = 1600000;
        assertEquals(esperado, salario);
        LOG.info("Finalizando testEmpleadoFreelance");
    }

}
