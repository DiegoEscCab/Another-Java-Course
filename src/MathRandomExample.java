import java.util.Random;

public class MathRandomExample {
    public static void main(String[] args) {
        /**Es un valor random entre 0 y 1, pero nunca toca el valor 1 del rango a generar aleatoriamente*/
        String[] colores = {"azul", "rojo", "negro", "blanco", "verde", "morado"};


        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);
                


    }
}
