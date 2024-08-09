import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pods following by:");
        System.out.println("the number of peas in a pod:");
        int numberOfPods = scanner.nextInt();
        int peasPerPods = scanner.nextInt();

        int totalNumberOfPeas = numberOfPods * peasPerPods;

        System.out.print(numberOfPods + " pods and ");
        System.out.println(peasPerPods + " peas per pod.");
        System.out.println("The total number of peas " + totalNumberOfPeas);
        scanner.close();
    }
}
