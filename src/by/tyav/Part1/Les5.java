package by.tyav.Part1;

public class Les5 {
    public static void main(String[] args) {
    int value=2000;
    isLeapYear(value);
    }

    public static boolean isLeapYear(int year){
        if (year%400==0 || (year % 4==0 && year % 100 != 0)) {
           return true;
        } else {
            return false;
        }
    }
}
