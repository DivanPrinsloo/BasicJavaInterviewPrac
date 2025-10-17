public class variableScope {

    static int x = 3; //CLASS

    public static void main(String[] arg) {

        int x = 1; /// Local


        System.out.println(x);


    }
    static void doSomething() {
        int x = 2; ///LOCAL


    }
}
