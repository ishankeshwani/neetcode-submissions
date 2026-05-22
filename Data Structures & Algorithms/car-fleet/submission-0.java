class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
          int n = position.length;

        int[][] cars = new int[n][2];

        // store position and speed

        for (int i = 0; i < n; i++) {

            cars[i][0] = position[i];

            cars[i][1] = speed[i];

        }

        // sort by position descending

        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Stack<Double> stack = new Stack<>();

        for (int[] car : cars) {

            double time =

                    (double)(target - car[0]) / car[1];

            // new fleet

            if (stack.isEmpty() || time > stack.peek()) {

                stack.push(time);

            }

        }

        return stack.size();
    }
}
