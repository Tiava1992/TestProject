package by.tyav.Part2.Glava1.Test1;

public class Runner {
    public static void main(String[] args) {

        TimeInterval timeInterval=new TimeInterval(1,0,1);
        System.out.println(timeInterval.totalSeconds());
        timeInterval.getInfo();

        TimeInterval timeInterval2=new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());

        TimeInterval sumIntervals=timeInterval.sumTime(timeInterval2);
        sumIntervals.getInfo();
    }
}
