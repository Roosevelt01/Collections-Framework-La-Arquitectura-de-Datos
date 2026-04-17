package Collections_Framework.Box.Ejercicio_4_MultiBox;

import java.util.ArrayList;
import java.util.List;

public class MultiBox<T>{
    List<T> multiBoxs = new ArrayList<>();

    public void add(T elemento){
        this.multiBoxs.add(elemento);
    }

    public List<T> getAll(){
        return this.multiBoxs;
    }

    public boolean contain(T elemento){
        for(T multibox : multiBoxs){
           if(multibox.equals(elemento)){
               return true;
           }
        }
        return false;
    }
}
