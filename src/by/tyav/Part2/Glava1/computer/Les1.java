package by.tyav.Part2.Glava1.computer;

public class Les1 {
    public static void main(String[] args) {
        int x=10;
        int[] values= {x, 3,2,3};
        printValues(values);
    }

    private static void printValues(int[] values) {
        for (int value : values) {
            System.out.printf(value+ ", ");
        }
    }
}
