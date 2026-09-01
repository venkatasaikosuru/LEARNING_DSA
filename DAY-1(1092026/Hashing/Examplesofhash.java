import java.util.*;

class Examplesofhash{

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 1, 4, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Print frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(
                entry.getKey() + " -- " + entry.getValue()
            );
        }

        // Fetch frequency
        System.out.println("Frequency of 1: " +
                map.getOrDefault(1, 0));

        System.out.println("Frequency of 10: " +
                map.getOrDefault(10, 0));
    }
}