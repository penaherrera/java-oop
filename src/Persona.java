public class Persona {
    //private instance variables
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //getter for nombre
    public String getNombre(){
        return nombre;
    }

    //setter for nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setanoiNac(int anioNac){
        this.edad = anioNac - 2024;
    }

    public int getEdad(){
        return edad;
    }

}
