// mutually exclusive read and write methods
public class RWexclusive extends RWbasic
{
    public synchronized void read()
    {
        System.out.println("read: " + data);
    }

    public synchronized void write()
    {
        data++;
        System.out.println("wrote: " + data);
    }
}
