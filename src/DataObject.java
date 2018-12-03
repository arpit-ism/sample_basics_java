import java.util.Scanner;

public class DataObject {
    int intVal;
    String strVal;

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public String getStrVal() {
        return strVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "intVal=" + intVal +
                ", strVal='" + strVal + '\'' +
                '}';
    }

    public void swap(DataObject dataObj){
        DataObject dataObjectTemp = new DataObject();
        dataObjectTemp.setIntVal(this.getIntVal());
        dataObjectTemp.setStrVal(this.getStrVal());
        this.setIntVal(dataObj.getIntVal());
        this.setStrVal(dataObj.getStrVal());
        dataObj.setStrVal(dataObjectTemp.getStrVal());
        dataObj.setIntVal(dataObjectTemp.getIntVal());
    }

    public static void main(String[] args){
        DataObject dataObj = new DataObject();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer and string values for the 1st dataObject:");
        dataObj.setIntVal(sc.nextInt());
        dataObj.setStrVal(sc.nextLine());
        System.out.println("Following is the 1st data object created:\n");
        System.out.println(dataObj.getIntVal());
        System.out.println(dataObj.getStrVal());
        System.out.println(dataObj.toString());
        DataObject dataObjAnother = new DataObject();
        System.out.println("Enter the integer and string values for the 2nd dataObject:");
        dataObjAnother.setIntVal(sc.nextInt());
        dataObjAnother.setStrVal(sc.nextLine());
        System.out.println("Following is the second data object created:\n");
        System.out.println(dataObjAnother.getIntVal());
        System.out.println(dataObjAnother.getStrVal());
        dataObj.swap(dataObjAnother);
        System.out.println("After swapping these are the new data object in the same order as they were fed");
        System.out.println(dataObj.toString());
        System.out.println(dataObjAnother.toString());

    }
}
