package task3;

import java.util.*;

public class MyList implements List<String> {
    List<String> myList = new ArrayList<>();

    @Override
    public synchronized String toString() {
        return "MyList{" +
                "myList=" + myList.toString() +
                '}';
    }

    @Override
    public synchronized int size() {
        return myList.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return myList.contains(o);
    }

    @Override
    public synchronized Iterator<String> iterator() {
        return myList.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return myList.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return myList.toArray(a);
    }

    @Override
    public synchronized boolean add(String s) {
        return myList.add(s);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return myList.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return myList.contains(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends String> c) {
        return myList.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends String> c) {
        return myList.addAll(index, c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        myList.clear();
    }

    @Override
    public synchronized String get(int index) {
        return myList.get(index);
    }

    @Override
    public synchronized String set(int index, String element) {
        return myList.set(index, element);
    }

    @Override
    public synchronized void add(int index, String element) {
        myList.add(index, element);
    }

    @Override
    public synchronized String remove(int index) {
        return myList.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return myList.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return myList.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<String> listIterator() {
        return myList.listIterator();
    }

    @Override
    public synchronized ListIterator<String> listIterator(int index) {
        return myList.listIterator(index);
    }

    @Override
    public synchronized List<String> subList(int fromIndex, int toIndex) {
        return myList.subList(fromIndex, toIndex);
    }
}
