public class Main
{
    static ReadersWriters RW = new ReadersWriters();

    public static void main(String[] args)
    {
        int rounds = Integer.parseInt(args[0], 10);
        new Reader(rounds, RW).start();
        new Writer(rounds, RW).start();
        new Reader(rounds, RW).start();
    }
}
