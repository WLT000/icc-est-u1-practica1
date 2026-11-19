import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicios{


    //Código ascendente.
    public  void c1(List<Estudiante> original){
    List<Estudiante> lista = new ArrayList<>(original);
        lista.sort(null);

        System.out.println("Codigo acendente: ");
        for (Estudiante e: lista){
            System.out.println(e);
        }
    }


    //Nombre ascendente; código ascendente.
    public void c2(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = (a,b)->{
            int aux = a.getNombre().compareTo(b.getNombre());
            if(aux != 0){
                return aux;
            }
            return a.getCodigo().compareTo(b.getCodigo());
        };

        System.out.println("Nombre acendente, codigo acendente: ");
        lista.sort(comparator);
        for(Estudiante e : lista){
            System.out.println(e);
        }
    }

        //Nota ascendente, sin desempate.
    public void c3(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        System.out.println("Nota ascendente: ");
        for(Estudiante e : lista){
            System.out.println(e);
        }
    }

    //Nota descendente; nombre ascendente.
    public void c4(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota)
            .reversed().thenComparing(Estudiante :: getNombre);
        lista.sort(comparator);
        System.out.println("Nota descendente; nombre ascendente.");
        for(Estudiante e : lista){
            System.out.println(e);
        }
    }

    //Edad ascendente; nombre descendente.
    public void c5(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = Comparator.comparingInt(Estudiante :: getEdad)
        .thenComparing(Estudiante::getNombre, Comparator.reverseOrder());
        lista.sort(comparator);
        System.out.println("Edad ascendente; nombre descendente.");
        for(Estudiante e : lista){
            System.out.println(e);
        }
    }

    //Carrera ascendente; nota descendente; nombre ascendente; código ascendente.
    public void c6(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante::getCarrera).
            thenComparing(Comparator.comparingDouble(Estudiante::getNota).reversed())
            .thenComparing(Estudiante::getNombre)
            .thenComparing(Estudiante::getCodigo);
        
        lista.sort(comparator);
        System.out.println("Carrera ascendente; nota descendente; nombre ascendente; código ascendente.");
        for(Estudiante e : lista){
            System.out.println(e);
        }

    }

    //Nota ajustada descendente; nombre ascendente; código ascendente.
    public void c7(List<Estudiante> original){
        List<Estudiante> lista = new ArrayList<>(original);
        Comparator<Estudiante> comparator = Comparator.<Estudiante>comparingDouble(e ->notaAjusta(e))
        .reversed()
        .thenComparing(Estudiante::getNombre)
        .thenComparing(Estudiante::getCodigo);
        lista.sort(comparator);
        System.out.println("Nota ajustada descendente; nombre ascendente; código ascendente.");
        for(Estudiante e : lista){
            System.out.println(e+"|Nota ajustada="+notaAjusta(e));
        }
    }


    private double notaAjusta(Estudiante e){
        if(e.getCarrera().equals("Computacion")){
            return Math.min(10.0,e.getNota()+0.5);
        }
        return e.getNota();
    }


}
