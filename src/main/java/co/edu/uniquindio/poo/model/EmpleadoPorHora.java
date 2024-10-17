package co.edu.uniquindio.poo.model;

public class EmpleadoPorHora extends Empleado{

    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        super(nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        double salario = horasTrabajadas * salarioPorHora;
        mostrarMensaje(salario);
        return salario;
    }

    

}
