package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;


public class Aplicacion {
   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Persona carp = new Persona();
        Date fec = new Date();
        fec.setYear(2003);
        fec.setMonth(11);
        fec.setDate(19);
        Persona p1 = new Persona("1727721335", "David", "Alejandro", "Carpi", "Campoverde", fec, "Quito", "alejodavid70@gmail.com");
        System.out.println("Fecha de nacimiento: " + p1.getFechaNacimiento().getYear()+ "/" + p1.getFechaNacimiento().getMonth() + "/" +p1.getFechaNacimiento().getDate());
    }
   
}
