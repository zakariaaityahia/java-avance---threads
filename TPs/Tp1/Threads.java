package Tp1;

public class Threads extends Thread{

    int number;

    public Threads(int number) {
    this.number = number;
    }

    @Override
    public void run() {
        for(int k = 0; k <= 100; k++) {
            System.out.println(this.number + " " + number);
        }
    }
}
