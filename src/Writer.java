public class Writer extends Thread
{
    int rounds;
    ReadersWriters RW;

    public Writer(int rounds, ReadersWriters RW)
    {
        this.rounds = rounds;
        this.RW = RW;
    }

    public void run()
    {
        for(int i=0;i<rounds;i++){
            RW.write();
        }
    }
}
