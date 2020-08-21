import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int[] points = new int[2 + stops.length];

        points[0] = 0;
        for (int i = 1; i <= stops.length; i++) {
            points[i] = stops[i - 1];
        }
        points[points.length - 1] = dist;

        int counter = 0;
        int currentPoint = 0;
        int stationsInTheMiddle = 0;
        int i = 0;
        while (i < points.length - 1) {
            int nextDistance = points[i + 1] - points[currentPoint];

            if (nextDistance < tank) {
                stationsInTheMiddle++;
                i++;
            } else if (nextDistance == tank) {
                if (points[i + 1] == dist) {
                    break;
                }
                counter++;
                currentPoint = i + 1;
                stationsInTheMiddle = 0;

            } else {
                if (stationsInTheMiddle < 1) {
                    return -1;
                } else {
                    currentPoint = i;
                    counter++;
                    stationsInTheMiddle = 0;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
