public class Reader extends Thread
{
    int rounds;
    ReadersWriters RW; // a reference to an RWbasic object

    public Reader(int rounds, ReadersWriters RW)
    {
        this.rounds = rounds;
        this.RW = RW;
    }

    public void run(){
        for (int i=0;i<rounds;i++){
            this.RW.read();
        }
    }
}
