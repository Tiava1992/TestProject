package by.tyav.Part2.Glava1.computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer1=new Computer(1,11);
        Computer computer2= new Computer();
        computer2.ram=2;
        computer2.ssd=22;


        computer1.load();
        computer1.getInfo();
        computer2.getInfo();
    }
}
