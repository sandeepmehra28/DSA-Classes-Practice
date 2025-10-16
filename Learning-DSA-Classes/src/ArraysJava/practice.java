package ArraysJava;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return new Pair<>(arr[0],arr[n-1]);
    }
}
