package by.tyav.Part1;

public class Les5Task1 {
    public static void main(String[] args) {
    int value1=10;
    int value2=10;
    int value3=23;
    int result=getMax(value3, value2);

        System.out.println(result);
    }
        public static int getMax(int x, int y){
        if(x>y){
            return x;
        } else if (x<y){
            return y;
        } else return x;
        }

}
