import java.util.*;
class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team: " + mean);
    }
}
