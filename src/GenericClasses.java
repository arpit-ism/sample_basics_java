import java.util.ArrayList;
import java.util.List;

class CustomClass1{
    private Integer ccInt;
    private String ccStr;
    CustomClass1(Integer a,String s){
        this.ccInt = a;
        this.ccStr = s;
    }

}



public class GenericClasses<T> {

    List<T> t = new ArrayList<T>(100);
    public void PrintList(){
        System.out.println(t);
    }
    public void AddElement(T newEle){
        t.add(newEle);
    }

    public void DeleteElement(T delEle){
        t.remove(delEle);
    }

    public void DeleteElement(int indx){
        t.remove(indx);
    }

    public void GetElement(int indx){
        System.out.println(t.get(indx));
    }

    public static void main(String[] args){
        GenericClasses<String> inc = new GenericClasses<String>();
        Integer i = 0;
        inc.AddElement("sdvsd");
        inc.AddElement("sdvsdsfdvs");
        inc.DeleteElement("sdvsdsfdvs");

        inc.AddElement("sdvsdsfdvs");
        inc.DeleteElement(0);
        inc.GetElement(0);
        inc.PrintList();
        GenericClasses<CustomClass1> inc1 = new GenericClasses<CustomClass1>();
        CustomClass1 cc1 = new CustomClass1(1,"sfsdfsd");
        CustomClass1 cc2 = new CustomClass1(2,"sfsdfsd");
        inc1.AddElement(cc1);
        inc1.AddElement(cc2);
        inc1.PrintList();
        inc1.GetElement(0);
    }

}
