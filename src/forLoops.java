import java.util.Scanner;

public class forLoops {
    public static void main(String[] arg) throws InterruptedException {

//
//        for (int i = 1; i < 11 ; i+=2  ) {
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for (int i = 1;i < max;i++) {
//            System.out.println(i);
//        }
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int start;

        System.out.print("How many seconds to count up from: ");
        start = scanner.nextInt();

        for (int i = start;i > 0;i++) {

            if (i == 20) {
                continue;
            }

            System.out.print(i + " ");
            //threads

            Thread.sleep(1000);
        }

        System.out.println("Happy new year!");

        scanner.close();

    }
}
