package task3;

import java.util.HashSet;
import java.util.concurrent.Semaphore;

public class MySet {
    private HashSet<String> hashSet;
    private Semaphore sem = new Semaphore(1);


    public MySet() {
        hashSet = new HashSet<>();
    }

    public void add(String s) throws InterruptedException {
        sem.acquire();
        hashSet.add(s);
        sem.release();
    }

    public int size() throws InterruptedException {
        sem.acquire();
        int size = hashSet.size();
        sem.release();
        return size;
    }

    public void clear() throws InterruptedException {
        sem.acquire();
        hashSet.clear();
        sem.release();
    }

    @Override
    public String toString() {
        return "MySet{" +
                "hashSet=" + hashSet.toString() +
                '}';
    }
}
