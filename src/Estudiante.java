

public class Estudiante implements Comparable<Estudiante>{
    private final String codigo;
    private final String nombre;
    private final int edad;
    private final double nota;
    private  final String carrera;


    public Estudiante(String codigo, String nombre, int edad, double nota, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.carrera = carrera;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public String getCarrera() {
        return carrera;
    }
        
    
    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota
                + ", carrerra=" + carrera + "]";
    }

    @Override
    public  int compareTo(Estudiante otro){
        return this.codigo.compareTo(otro.getCodigo());
    }
    


}
