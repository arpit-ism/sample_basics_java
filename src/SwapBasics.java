import java.util.Scanner;



public class SwapBasics {
    public static class IntHolder{
        int integer;
    }

    public static class StrHolder{
        String string;
    }

    public static void main(String[] str){
        IntHolder int1 = new IntHolder();
        IntHolder int2 = new IntHolder();
        StrHolder str1 = new StrHolder();
        StrHolder str2 = new StrHolder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two strings one by one:\n");
        str1.string = scan.nextLine();
        str2.string = scan.nextLine();
        swap(str1,str2);
        System.out.println("The two strings are:\n"+str1.string+"\n"+str2.string);
        System.out.println("Enter the two integers one by one:");
        int1.integer = scan.nextInt();
        int2.integer = scan.nextInt();
        swap(int1,int2);
        System.out.println("The two integers are:\n"+int1.integer+"\n"+int2.integer);

    }

    public static void swap(IntHolder i1,IntHolder i2){
        i1.integer = i1.integer + i2.integer;
        i2.integer = i1.integer - i2.integer;
        i1.integer = i1.integer - i2.integer;
    }

    public static void swap(StrHolder s1,StrHolder s2){
        StrHolder sTemp =  new StrHolder();
        sTemp.string = s1.string;
        s1.string = s2.string;
        s2.string = sTemp.string;
    }
}
