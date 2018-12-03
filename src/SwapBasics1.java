import java.util.Scanner;

public class SwapBasics1 {
    public static int int1,int2;
    public static String str1,str2;
    public static void main(String[] args){
        System.out.println("Please enter the two integers to be swapped:");
        Scanner sc = new Scanner(System.in);
        int1 = sc.nextInt();
        int2 = sc.nextInt();
        swap(int1,int2);
        System.out.println(int1+"  "+int2);
    }

    public static void swap(int int1,int int2){
        int intTemp = int1;
        int1 = int2;
        int2 = intTemp;
    }

}
