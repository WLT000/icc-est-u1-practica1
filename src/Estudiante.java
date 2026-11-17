import java.util.Comparator;

public class Estudiante implements Comparable<Estudiante>{
    private String codigo;
    private String nombre;
    private int edad;
    private double nota;
    private String carrerra;


    public Estudiante(){

    }

    public Estudiante(String codigo, String nombre, int edad, double nota, String carrerra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.carrerra = carrerra;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getCarrerra() {
        return carrerra;
    }
    public void setCarrerra(String carrerra) {
        this.carrerra = carrerra;
    }

    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota
                + ", carrerra=" + carrerra + "]";
    }

    @Override
    public int compareTo(Estudiante e) {
        int compNota = Double.compare(this.getNota(), e2.getNota());
        if ( compNota != 0)
            return compNota;

        };
        
    }


}
