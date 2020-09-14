public class ReadersWriters extends RWbasic
{
    private int nr = 0;
    private int nw = 0;

//    private synchronized void startRead(){
//        while (nw>0)
//            try{wait();}
//                catch (InterruptedException ex){return;}
//        nr++;
//    }

//    private synchronized void endRead(){
//        nr--;
//        if(nr==0) {
//            notify();
//        }
//    }

    @Override
    public synchronized void read() {
        while (nw>0)
            try{wait();}
            catch (InterruptedException ex){return;}
        nr++;
        System.out.println(Thread.currentThread().getId()+ " read: " + data);
        nr--;
        if(nr==0) {
            notify();
        }
    }

    public synchronized void write(){
        while (nr>0) // delay if any active Readers
            try { wait();}
                catch (InterruptedException ex) {return;}
        nw++;
        data++;
        System.out.println(Thread.currentThread().getId() + " write: " + data);
        nw--;
        if(nw == 0) notify();
    }
}
