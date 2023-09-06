public class OperadoreIncrementales {
    public static void main(String[] args) {
        // Pre incremento
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        System.out.println("i = " + i);

        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        int k = 3;
        int l = --i; // i = i - 1 = 2
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        //Post decremento
        int m = 4;
        int n = i--;
        System.out.println("m = " + m);
        System.out.println("n = " + n);


    }
}
