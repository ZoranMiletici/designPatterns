package designPatterns.singleton;

public class ThreadsMain {
    public static void main(String[] args) throws InterruptedException {
        int nrOfThreads = 5_000;

        Thread[] threads = new Thread[nrOfThreads];
        Runnable task = () -> {
        Singleton singleton = Singleton.getInstance();
    };
    for(int i=0; i< nrOfThreads; i++) {
        threads[i] = new Thread(task);
    }

    for(int i=0; i< nrOfThreads; i++) {
        threads[i].start();
    }

    for(int i=0; i< nrOfThreads; i++) {
        threads[i].join();
    }

    System.out.println(Singleton.nrOfInstance);
    }
}
