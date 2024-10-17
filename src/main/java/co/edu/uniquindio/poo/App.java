package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EmpleadoFreelance empleado1 = new EmpleadoFreelance("Camila", "1091203555", 2, 800000);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Santiago", "109076544", 6, 20000);
        EmpleadoTiempoCompleto empleado3 = new EmpleadoTiempoCompleto("Angela", "41963111");

        empleado1.calcularSalario();
        empleado2.calcularSalario();
        empleado3.calcularSalario();
    }

}
