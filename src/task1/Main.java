package task1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String str1 = "1gkfkg3";
        String str2 = "2dffddf01";

        Comparator<String> comparator = (o1, o2)->getSum(o1) - getSum(o2);

        System.out.println(comparator.compare(str1, str2));
    }

    private static int getSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
