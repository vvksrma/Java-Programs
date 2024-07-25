import java.util.Scanner;

class average_finder{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num 1 - ");
        int A = scanner.nextInt();

        System.out.print("Enter num 2 - ");
        int B = scanner.nextInt();

        System.out.print("Enter num 3 - ");
        int C = scanner.nextInt();

        double avg = (A + B + C) / 3.0;
        System.out.println("The Avegarge is - " + avg);

        scanner.close();
    }

}