import java.util.*;
public class EmergencyTravelPlan {

    public static int findMinimumDays(int numCities, List<int[]> aerialRoutes) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCities; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < numCities - 1; i++) {
            graph.get(i).add(i + 1);
            graph.get(i + 1).add(i);
        }

        for (int[] route : aerialRoutes) {
            graph.get(route[0]).add(route[1]);
            graph.get(route[1]).add(route[0]);
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[numCities];
        queue.add(new int[]{0, 0});
        visited[0] = true;


        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int city = current[0];
            int days = current[1];


            if (city == numCities - 1) {
                return days + 1;
            }


            for (int i = 1; i <= 6; i++) {
                int nextCity = city + i;
                if (nextCity < numCities && !visited[nextCity]) {
                    visited[nextCity] = true;
                    queue.add(new int[]{nextCity, days + 1});
                }
            }


            for (int nextCity : graph.get(city)) {
                if (!visited[nextCity]) {
                    visited[nextCity] = true;
                    queue.add(new int[]{nextCity, days + 1});
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of test cases");
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            System.out.println("enter number of cities");
            int numCities = sc.nextInt();
            System.out.println("enter number of aerial routes");
            int numAerialRoutes = sc.nextInt();
            List<int[]> aerialRoutes = new ArrayList<>();

            System.out.println("enter all aerial routes");
            for (int i = 0; i < numAerialRoutes; i++) {
                int src = sc.nextInt();
                int dest = sc.nextInt();
                aerialRoutes.add(new int[]{src, dest});
            }

int result=findMinimumDays(numCities,aerialRoutes);
            System.out.println("the minimum days to travel from city 1 to city "+numCities+"is "+result);

        }
    }
}
