public class RWbasic {
    protected  int data = 0; // the "database"

    public void read(){
        System.out.println("read: " + data);
    }

    public void write(){
        data++;
        System.out.println("wrote: " + data);
    }
}
