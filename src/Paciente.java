
public class Paciente extends Persona{

    String diagnostico;
    public Paciente(String nombre, int edad, String diagnostico) {
        super(nombre, edad);
        this.diagnostico = diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
}
