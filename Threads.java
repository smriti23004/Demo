class myThread implements Runnable{
    @Override
    public void run(){
        System.out.println("hello inside the thread!");
    }

}
public class Threads{
    public static void main(String[] args){
        myThread t1 = new myThread();
        Thread thread = new Thread(t1);
        thread.start();
    }
}