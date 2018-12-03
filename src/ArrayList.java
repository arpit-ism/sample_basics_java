import java.util.Arrays;

public class ArrayList {

    private int position = 0;
    private int[] arr = new int[100];

    private void AddValue(int valIn){
        arr[position++] = valIn;
    }

    private void DeleteByIndex(int index){
        for(int i=index;i<position-1;i++){
            arr[i] = arr[i+1];
        }

    }

    /*private void DeleteByValue(int val){
        int ite = 0;
        while(arr[ite]!=val){
            ite++;
        }
        ite--;
        for(int i=ite;i<position-1;i++){
            arr[i] = arr[i+1];
        }
    }*/

    private Integer getValue(int index){
        return arr[index];
    }


    private void PrintList(){
        for (int i=0;i<position;i++){

            System.out.println(this.getValue(i)+"\t");
        }
    }

    public static void main(String[] args){
        ArrayList newList = new ArrayList();
        newList.toString();
        System.out.println("dhs");
        newList.AddValue(23);
        newList.AddValue(25);
        newList.AddValue(22);
        newList.AddValue(43);
        newList.AddValue(73);
        newList.AddValue(26);
        newList.AddValue(93);
        newList.arr[1]=newList.arr[0];
        newList.PrintList();
        newList.DeleteByIndex(3);
        //newList.DeleteByValue(23);
        newList.PrintList();
        System.out.println(newList.getValue(4));


    }
}
