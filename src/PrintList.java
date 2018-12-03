import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrintList {
    /*public static void PrintArray(int[] toPrint){
        int sz = toPrint.length;
        for(int i=0;i<sz;i++){
            System.out.println(toPrint[i]+"\n");
        }
        //System.out.println(sz);
    }

    public static void PrintArray(String[] toPrint){
        int sz = toPrint.length;
        for(int i=0;i<sz;i++){
            System.out.println(toPrint[i]+"\n");
        }
        //System.out.println(sz);
    }*/

    static public <T> void PrintArray(T... ts) {
        for (T t : ts) {
            System.out.print(t + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Integer[] arrInt = {1,2,3,4};
        PrintArray(arrInt);
        String[] arrStr = {"adfad","fdv","vsdvds"};
        PrintArray(arrStr);
        Double[] arrDbl = {1.243,3.325,6.3564};
        PrintArray(arrDbl);
    }
}
