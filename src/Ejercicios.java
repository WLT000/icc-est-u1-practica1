import java.util.List;

public class Ejercicios {
    List<Estudiante> list0;
    
    public Ejercicios(List<Estudiante> list0){
        this.list0 = list0;
    }
    public void c1(){
        List<Estudiante> list = list0.clone();
        list.sort();
        return list;
        
    }
}
