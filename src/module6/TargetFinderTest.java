package module6;

import java.util.Arrays;

public class TargetFinderTest {

    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 21},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] result = targets[0];
        double minDestination =
                Math.sqrt(Math.pow((targets[0][0] - aiCoords[0]), 2) + Math.pow((targets[0][1] - aiCoords[1]), 2));
        for (int i = 1; i < targets.length; i++) {
            double destination =
                    Math.sqrt(Math.pow((targets[i][0] - aiCoords[0]), 2) + Math.pow((targets[i][1] - aiCoords[1]), 2));

            if (minDestination > destination) {
                minDestination = destination;
                result = targets[i];

            }
        }
        return result;
    }
}
