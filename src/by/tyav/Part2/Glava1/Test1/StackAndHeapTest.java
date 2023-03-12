package by.tyav.Part2.Glava1.Test1;

public class StackAndHeapTest {
    public static void main(String[] args) {
        TimeInterval timeInterval=creatTimeInterval();

    }

    private static TimeInterval creatTimeInterval() {
        TimeInterval timeInterval=new TimeInterval(1,0,1);
        System.out.println(timeInterval.totalSeconds());
        return timeInterval;
    }
}
