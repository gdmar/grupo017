package ar.edu.unju.fi.ejercicio19.model.domain;

import java.time.LocalDate;

public class Empleado {
    private String Nombre;
    private LocalDate fechaIngreso;
    private int legajo;
    private String email;
    private int horasTrabajo;

    public Empleado(String nombre, LocalDate fechaIngreso, int legajo, String email, int horasTrabajo) {
        Nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.legajo = legajo;
        this.email = email;
        this.horasTrabajo = horasTrabajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    /**
     * Método que devuelve el  cálculo del sueldo.
     * si horas trabajadas es menor o igual que 160, entonces se paga $1000 la hora.
     * si horas trabajadas es mayor a 160, entoces a partir de la hora 161 se paga $1300 la hora.
     * @return double 
     */
    public double calcularSueldo() {
        if (this.horasTrabajo <= 160) {
            return this.horasTrabajo * 1000;
        } else {
            return 160 * 1000 + (this.horasTrabajo - 160) * 1300;
        }
    }

    
    @Override    
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
               "Fecha de Ingreso: " + getFechaIngreso() + "\n" +
               "Legajo: " + getLegajo() + "\n" +
               "Email: " + getEmail() + "\n" +
               "HorasTrabajo: " + getHorasTrabajo() + "\n" +
               "Sueldo:" + this.calcularSueldo() + "\n";
    }

}
