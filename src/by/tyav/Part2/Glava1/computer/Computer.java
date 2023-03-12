package by.tyav.Part2.Glava1.computer;

public class Computer {

    int ssd=1024;
    int ram= 16;

    public Computer() {
    }

    public Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load(){
        System.out.println("I am load");
    }

    public  void getInfo(){
        System.out.println("SSD " + ssd+ " Ram "+ ram);
    }
}
