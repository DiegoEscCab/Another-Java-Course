public class MathExample {
    public static void main(String[] args) {

        int abs = Math.abs(-3);
        System.out.println("abs = " + abs);

        abs = Math.abs(3);
        System.out.println("abs = " + abs);

        double max = Math.max(3.5, 1.5);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.5);
        System.out.println("min = " + min);

        double top = Math.ceil(3.5);
        System.out.println("top = " + top);

        double bot = Math.floor(3.5);
        System.out.println("bot = " + bot);

        double round = Math.round(3.4);
        System.out.println("round = " + round);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double pow = Math.pow(10, 3);
        System.out.println("pow = " + pow);

        double sqrt = Math.sqrt(10);
        System.out.println("sqrt = " + sqrt);

        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("radians to degrees = " + degrees);

        double radian = Math.toRadians(90);
        System.out.println("radian = " + radian);
        System.out.println("Math.sin(90) = " + Math.sin(radian));
        System.out.println("Math.cos(90) = " + Math.cos(radian));

        radian = Math.toRadians(180);
        System.out.println("Math.sin(180) = " + Math.sin(radian));
        System.out.println("Math.cos(180) = " + Math.cos(radian));

        radian = Math.toRadians(0);
        System.out.println("Math.sin(0) = " + Math.sin(radian));
        System.out.println("Math.cos(0) = " + Math.cos(radian));
    }
}
