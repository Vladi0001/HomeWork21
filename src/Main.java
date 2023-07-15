import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("last","hallo","hi","by","hi","hallo","by"));

    public static void main(String[] args) {
        task1(nums);
        task2(nums);
        task3(words);
        task4(words);

    }

    private static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    private static void task3(List<String> words) {
        Set<String> word2 = new HashSet<>(words);
        System.out.println(word2);
    }
    private static void task4 (List <String> words) {
        Map<String, Integer> word3 = new HashMap<>();
        for (String word : words) {
            if (word3.containsKey(word)) {
                word3.put(word, word3.get(word) + 1);
            } else {
                word3.put(word, 1);
            }
        }
        System.out.println(word3);
    }


}