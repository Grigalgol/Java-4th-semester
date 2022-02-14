package task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MySet mySet = new MySet();
        mySet.add("Danya");
        mySet.add("Grisha");
        mySet.add("Vovan");
        System.out.println(mySet);
        System.out.println(mySet.size());
        mySet.clear();
        System.out.println(mySet.size());

        System.out.println("=========================================");

        MyList myList = new MyList();
        myList.add("Vk");
        myList.add("YouTube");
        myList.add("Twitter");
        System.out.println(myList);

        myList.remove("YouTube");
        System.out.println(myList);
        System.out.println(myList.size());
    }
}
