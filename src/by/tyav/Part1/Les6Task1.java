package by.tyav.Part1;

public class Les6Task1 {
    public static void main(String[] args) {
    int value=10;
        System.out.println(sum(value));
    }

    public static int sum (int value){
        int result=0;
        int currentValue=value;
        while (currentValue!=0){
            result+= currentValue%10;
            currentValue=currentValue/10;
        }

        return result;
    }
}
