public class prac_thread extends Thread{

    public void run(){
        while (true) {
            System.out.println("This is the thread << End");
        }
    }

    public static void main(String[] args) {

        prac_thread myThread = new prac_thread();

        myThread.start();
    }
}


