package dsa_algo.algoritms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueProb {
    public static void main(String[] args) {

        int[] a = new int[]{14, 10, 78, 56, 46};
        int n = a.length;
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while (i < n) {
            if (i < k) {
                pq.add(a[i]);
                i++;
            } else {
                if (pq.peek() < a[i]) {
                    pq.poll();
                    pq.add(a[i]);
                    i++;
                }
            }

        }
        ArrayList<Integer> arrayList = new ArrayList<>(pq);
        Collections.sort(arrayList, Collections.reverseOrder());

        for (int p : arrayList) {
            System.out.print(p + " ");
        }

    }

}
