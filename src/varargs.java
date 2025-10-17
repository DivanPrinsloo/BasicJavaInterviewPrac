public class varargs {
    public static void main(String[] arg) {

            ///  varArgs = allow a method to accept a varying # of arguments
            ///         Makes methods more flexible, no need for overloaded methods
            ///         Java will pack the arguments into an array
            ///  .... (ellipsis)


     //   System.out.println(add(1,2,3,4,5,6));

        System.out.println( average(1,2,3,4,5,6,7,8));

    }
//    static int add (int... numbers) {
//
//        int sum = 0;
//
//        for (int number : numbers) {
//            sum += number;
//        }
//
//        return sum;
//
//    }

    static double average (double... numbers) {

        double avg = 0;
        int i = 0;
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double nums : numbers) {

            sum += nums;
            i = i + 1;
        }

        avg = sum / i;

        return avg;

    }
}
