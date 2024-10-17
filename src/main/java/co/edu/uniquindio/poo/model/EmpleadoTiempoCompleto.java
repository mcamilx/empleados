package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion){
        super(nombre, identificacion);
        this.salarioMensual = 2500000;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        double salario = 2500000;
        mostrarMensaje(salario);
        return salario;
    }




    

}
