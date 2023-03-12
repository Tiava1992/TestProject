package by.tyav.Part1;

public class Les6a2 {
    public static void main(String[] args) {
        int value=10;

        extracted(value);

    }

    private static void extracted(int value) {
        for(int i=0; i<value; i++){
            System.out.println(i);
            if(i==2){
                continue;
            }
        }
    }
}
