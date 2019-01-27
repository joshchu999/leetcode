package idv.joshchu999.exercise.leetcode.alg815;

import java.util.*;

/**
 * Created by joshchu999 on 4/4/17.
 */
public class Solution {

    // Too much space
    public int numBusesToDestination(int[][] routes, int S, int T) {

        HashMap<Integer,HashSet<Integer>> edges = new HashMap<Integer,HashSet<Integer>>();
        for (int i = 0 ; i < routes.length ; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                int jStop = routes[i][j];
                if (!edges.containsKey(jStop)) {
                    edges.put(jStop, new HashSet<Integer>());
                }
                HashSet<Integer> jEdges = edges.get(jStop);
                for (int k = j + 1; k < routes[i].length; k++) {
                    int kStop = routes[i][k];
                    if (!edges.containsKey(kStop)) {
                        edges.put(kStop, new HashSet<Integer>());
                    }
                    HashSet<Integer> kEdges = edges.get(kStop);

                    if (!jEdges.contains(kStop)) {
                        jEdges.add(kStop);
                    }

                    if (!kEdges.contains(jStop)) {
                        kEdges.add(jStop);
                    }
                }
            }
        }
        HashMap<Integer,Integer> buses = new HashMap<Integer,Integer>();
        Queue<Integer> expendStops = new LinkedList<Integer>();

        // initialize
        buses.put(S, 0);
        expendStops.offer(S);

        while (expendStops.peek() != null) {
            int expendStop = expendStops.poll();

            HashSet<Integer> expendEdges = edges.get(expendStop);

            Iterator it = expendEdges.iterator();

            while (it.hasNext()) {
                int nextStop = (int) it.next();
                if (!buses.containsKey(nextStop)) {
                    buses.put(nextStop, buses.get(expendStop) + 1);
                    expendStops.offer(nextStop);
                }
            }

            if (buses.containsKey(T)) {
                break;
            }
        }

        return buses.containsKey(T) ? buses.get(T) : -1;
    }

    // Too much time
    public int numBusesToDestination1(int[][] routes, int S, int T) {

        int maxStop = -1;
        for (int i = 0 ; i < routes.length ; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if (maxStop < routes[i][j]) { maxStop = routes[i][j]; }
            }
        }

        int[] buses = new int[maxStop + 1];
        for (int i = 0 ; i <= maxStop ; i++) {
            buses[i] = -1;
        }
        Queue<Integer> expendStops = new LinkedList<Integer>();

        // initialize
        buses[S] = 0;
        expendStops.offer(S);

        while (expendStops.peek() != null) {
            int expendStop = expendStops.poll();

            for (int i = 0 ; i < routes.length ; i++) {

                boolean found = false;

                for (int j = 0 ; j < routes[i].length ; j++) {
                    if (routes[i][j] == expendStop) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    for (int j = 0 ; j < routes[i].length ; j++) {
                        if (buses[routes[i][j]] == -1) {
                            buses[routes[i][j]] = buses[expendStop] + 1;
                            expendStops.offer(routes[i][j]);
                        }
                    }
                }
            }

            if (buses[T] != -1) {
                break;
            }
        }

        return buses[T];
    }
}
