public class prac_runnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("This is a Runnable thread");
        }
    }

    public static void main(String[] args) {
        prac_runnable myRunnable = new prac_runnable();

        new Thread(myRunnable).start();
    }
}
