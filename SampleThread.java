public class SampleThread {
    public static void main(String[] args) {
        Odd o1 = new Odd();
        Even e1 = new Even();
        o1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        e1.start();
    }

}

class Even extends Thread {
    public void run() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

class Odd extends Thread {
    public void run() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}
