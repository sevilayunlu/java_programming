package day39_collections.multiThreading;

public class TestMultiThreads {


    public static void main(String[] args) {
        ThreadHelloWorld thread1=new ThreadHelloWorld(1);//threads are executed at the same time
        ThreadHelloWorld thread2=new ThreadHelloWorld(2);
        ThreadHelloWorld thread3=new ThreadHelloWorld(3);
        ThreadHelloWorld thread4=new ThreadHelloWorld(4);







        thread1.start();//if we use the start method, threads get executed at the same time.
        // If we call the run method, threads do not get executed at the same time.
        // start() method implicitly calls run method() and all threads are executed at the same time concurrently which is known as "multi-threading"
        thread2.start();
        thread3.start();
        thread4.start();

 









    }
}
