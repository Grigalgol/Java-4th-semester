package task3;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    List<String> myList;

    public MyList(){
        myList = new ArrayList<>();
    }

    public synchronized void add(String s) {
        myList.add(s);
    }

    public synchronized boolean remove(String s) {
        return myList.remove(s);
    }

    public synchronized int size() {
        return myList.size();
    }

    @Override
    public String toString() {
        return "MyList{" +
                "myList=" + myList.toString() +
                '}';
    }
}
