public class StringArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] array1 = trabalenguas.toCharArray();
        int length = array1.length;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.println("array1 = " + array1[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] array2 = trabalenguas.split("a");
        int l = array2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(array2[j]);
        }

        String archivo = "alguna.imagen.jpg";
        String[] archivoArr = archivo.split("[.]");
        l = archivoArr.length;
        for (int j = 0; j < l; j++) {
            System.out.println(archivoArr[j]);
        }
    }
}
