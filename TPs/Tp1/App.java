package Tp1;

public class App {
    public static void main(String[] args) {
        Threads t1 = new Threads(1);
        Threads t2 = new Threads(2);
        Threads t3 = new Threads(3);
        Threads t4 = new Threads(4);
        Threads t5 = new Threads(5);
        Threads t6 = new Threads(6);
        Threads t7 = new Threads(7) ;
        Threads t8 = new Threads(8);
        Threads t9 = new Threads(9);
        Threads t10 = new Threads(10);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();
        new Thread(t5).start();
        new Thread(t6).start();
        new Thread(t7).start();
        new Thread(t8).start();
        new Thread(t9).start();
        new Thread(t10).start();



    }
}
