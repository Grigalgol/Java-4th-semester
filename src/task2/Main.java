package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> arr = getArrayHuman();

        Stream<Human> stream1 = sortAge(arr.stream());
        Stream<Human> stream2 = filterA(arr.stream());
        Stream<Human> stream3 = sortDate(arr.stream());
        Optional<Human> res = arr.stream().reduce((a, b)-> new Human(0, null, null, null, a.getWeight() + b.getWeight()));
        float middleWeight = (float) res.get().getWeight()/arr.size();

        stream1.forEach(System.out::println);
        System.out.println();
        stream2.forEach(System.out::println);
        System.out.println();
        System.out.println(middleWeight);
        System.out.println();
        stream3.forEach(System.out::println);
    }

    public static Stream sortAge(Stream<Human> stream) {
        return stream.sorted((o1, o2)-> o2.getAge() - o1.getAge());
    }

    public static Stream sortDate(Stream<Human> stream) {
        return stream.sorted((o1, o2)-> o1.getBirthDate().compareTo(o2.getBirthDate()));
    }

    public static Stream filterA(Stream<Human> stream) {
        return stream.filter((str)->str.getFirstName().charAt(0) == 'A');
    }

    public static ArrayList<Human> getArrayHuman () {
        ArrayList<Human> arr = new ArrayList<>();
        arr.add(new Human(12, "Sergey", "Ivanov", LocalDate.of(2010, 2, 22), 40));
        arr.add(new Human(19, "Vasya", "Shishkin", LocalDate.of(2002, 7, 16), 70));
        arr.add(new Human(18, "Dasha", "Fox", LocalDate.of(2003, 8, 10), 53));
        arr.add(new Human(20, "Alena", "Lexus", LocalDate.of(2000, 1, 14), 57));
        return arr;
    }
}
