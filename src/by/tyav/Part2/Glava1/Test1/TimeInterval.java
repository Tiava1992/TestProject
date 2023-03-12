package by.tyav.Part2.Glava1.Test1;

public class TimeInterval {

    private int seconds;
    private int minutes;
    private int hour;

    public TimeInterval(int seconds, int minutes, int hour) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hour = hour;
    }

    public TimeInterval (int totalSecond){
        this.seconds=totalSecond%3600%60;
        this.minutes=totalSecond%3600/60;
        this.hour=totalSecond/3600;

    }

    public int totalSeconds(){
        return seconds+minutes*60+hour*60*60;
    }

    public TimeInterval sumTime(TimeInterval second){
        return new TimeInterval(second.totalSeconds()+this.totalSeconds());
    }
    public void getInfo(){
        System.out.println("h "+ hour+" min "+ minutes+ " s "+seconds);
    }
}
