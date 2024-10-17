package co.edu.uniquindio.poo.model;

public abstract class Empleado {

    public String nombre;
    public String identificacion;

    public Empleado(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }    

    public abstract double calcularSalario();

    public void mostrarMensaje(double salario){
        System.out.println("El salario total es: " + salario);
    }

}
