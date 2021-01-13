package kap6.a3;

public class TimeTest {

    public static void main(String[] args)
    {
        Time time1 = new Time(23,58,56);
        Time time2 = new Time(time1);
        Time time3 = new Time();


        System.out.println("Time1: " + time1.toString());
        System.out.println("Time2: " + time2.toString());
        System.out.println("Time3: " + time3.toString());

        while (true){
            time1.tick();
            System.out.println(time1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

