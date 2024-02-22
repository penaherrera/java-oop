import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String inputEdad = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(inputEdad);
        String especialidad = JOptionPane.showInputDialog("Inregese su especialidad:");

        Medico DrHouse = new Medico(nombre, edad, especialidad);
        String mensajeIdentificacion = "Usuario identificado como:\n" + "Nombre: " + nombre
                + "\n" + "Edad: " + edad + "\n" + "Especialidad: " + especialidad;

        JOptionPane.showMessageDialog(null, mensajeIdentificacion);

        JOptionPane.showMessageDialog(null,"Por favor ingrese los datos de el " +
                "paciente que desea registrar");

        String nombrePaciente = JOptionPane.showInputDialog("Ingrese su nombre:");
        String inputEdadPaciente = JOptionPane.showInputDialog("Ingrese su edad:");
        int edadPaciente = Integer.parseInt(inputEdad);
        String especialidadPaciente = JOptionPane.showInputDialog("Inregese su diagnostico:");

        Paciente paciente1 = new Paciente(nombrePaciente, edadPaciente, especialidadPaciente);
        Paciente paciente2 = new Paciente("Ejemplo", 40, "Exceso de programacion");
        DrHouse.pacientes.add(paciente2);
        DrHouse.pacientes.add(paciente1);

        JOptionPane.showMessageDialog(null,"Paciente registrado con exito! \n" +
                "A continuacion su listado de pacientes:");

        DrHouse.verExpediente(paciente1);
        DrHouse.verExpediente(paciente2);
    }
}
