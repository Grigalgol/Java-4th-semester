package task3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySet implements Set<String> {
    private Set<String> hashSet =  new HashSet<>();
    private Semaphore sem = new Semaphore(1);

    @Override
    public boolean remove(Object o) {
        try {
            sem.acquire();
            return hashSet.remove(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try {
            sem.acquire();
            return hashSet.containsAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        try {
            sem.acquire();
            return hashSet.addAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try {
            sem.acquire();
            return hashSet.retainAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            sem.acquire();
            return hashSet.removeAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            hashSet.clear();
            sem.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        try {
            sem.acquire();
            return hashSet.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return hashSet.size();
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            sem.acquire();
            return hashSet.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        try {
            sem.acquire();
            return hashSet.contains(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public Iterator<String> iterator() {
        try {
            sem.acquire();
            return hashSet.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        try {
            sem.acquire();
            return hashSet.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return null;
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        try {
            sem.acquire();
            return hashSet.toArray(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return null;
        }
    }

    @Override
    public boolean add(String s) {
        try {
            sem.acquire();
            return hashSet.add(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            sem.release();
            return false;
        }
    }

    @Override
    public String toString() {
        return "MySet{" +
                "hashSet=" + hashSet.toString() +
                '}';
    }
}
