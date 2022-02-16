package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Set<String> hashSet = new HashSet<>();
        MySet mySet = new MySet();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i<5000; i++) {
                hashSet.add("i = " + i);
                mySet.add("i = " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 5000; i<10000; i++) {
                hashSet.add("i = " + i);
                mySet.add("i = " + i);
            }
        });

        thread1.start();
        thread2.start();
        Thread.sleep(3000);

        System.out.println("Set count - " + hashSet.size());
        System.out.println("MySet count - " + mySet.size());


        List<String> arrayList = new ArrayList<>();
        MyList myList = new MyList();

        Thread thread11 = new Thread(() -> {
           for (int i = 0; i<5000; i++) {
               arrayList.add("i + " + i);
               myList.add("i + " + i);
           }
        });

        Thread thread12 = new Thread(() -> {
            for (int i = 5000; i<10000; i++) {
                arrayList.add("i + " + i);
                myList.add("i + " + i);
            }
        });

        thread11.start();
        thread12.start();
        Thread.sleep(3000);
        System.out.println();
        System.out.println("List count - " + arrayList.size());
        System.out.println("MyList count - " + myList.size());

    }
}
