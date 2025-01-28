import java.util.*;
class ChocolateDivision {
    public static int[] calculateChocolatesDistribution(int totalChocolates, int totalChildren) {
        int chocolatesPerChild = totalChocolates / totalChildren;
        int remainingChocolates = totalChocolates % totalChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int totalChocolates = input.nextInt();
        System.out.print("Enter the total number of children: ");
        int totalChildren = input.nextInt();
        int[] distribution = calculateChocolatesDistribution(totalChocolates, totalChildren);
        System.out.println("Chocolates each child gets: " + distribution[0]);
        System.out.println("Remaining chocolates: " + distribution[1]);
    }
}

