package day13;

class count{
    int count=0;
    public synchronized void count(){
        count++;
    }
    public int getcount(){
        return count;
    }
}
class A implements Runnable{
    count c;
    public void run(){
        for(int i=0;i<1000;i++){
            c.count();
        }
    }
    A(count c){
        this.c=c;
    }
}
class B implements Runnable{
    count c;
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.count();
        }
    }
    B(count c) {
        this.c = c;

    }
}

public class OwnThread {
    static void main() throws InterruptedException {
        count c=new count();
        Runnable r1=new A(c);
        Runnable r2=new B(c);
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.getcount());

    }
}
