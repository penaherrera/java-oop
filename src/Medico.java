import javax.swing.*;
import java.util.ArrayList;

public class Medico extends Persona{
    String especialidad;
    ArrayList <Paciente> pacientes;

    public Medico(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setEspecialidad(String titulo){
        this.especialidad = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void registratPaciente(){
        String nombre = JOptionPane.showInputDialog("Enter the name:");
        String edadString = JOptionPane.showInputDialog("Enter the age:");
        int edad = Integer.parseInt(edadString);
        String diagnostico = JOptionPane.showInputDialog("Enter the diagnosis:");

        Paciente paciente = new Paciente(nombre,edad,diagnostico);
        pacientes.add(paciente);
    }

    public void verExpediente(Paciente paciente){
        System.out.println("Paciente registrado");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Diagnostico: " + paciente.getDiagnostico());
    }
}
