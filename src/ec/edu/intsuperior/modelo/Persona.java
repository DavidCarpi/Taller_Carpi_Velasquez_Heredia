
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
    String ci;
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    Date fechaNacimiento;
    String direccion;
    String correo;

    public Persona() {
    }

    public Persona(String ci, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento, String direccion, String correo) {
        this.ci = ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }
    

}
