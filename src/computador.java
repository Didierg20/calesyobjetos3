public class computador {
    String nombre;
    String color;
    String textura;
    public static void main(String[] args) {

        computador computador1 = new computador();

        computador1.nombre = "portatil";
        computador1.color = "negro";
        computador1.textura = "pasta";

        System.out.println("el nombre del computador1 es: "+computador1.nombre);
        System.out.println("el color del computador1 es: "+computador1.color);
        System.out.println("la textura del computador1 es: "+computador1.textura);


        computador computador2 = new computador();

        computador2.nombre = "de mesa";
        computador2.color = "gris";
        computador2.textura = "pasta";

        System.out.println("\nel nombre del computador2 es: "+computador2.nombre);
        System.out.println("el color del computador2 es: "+computador2.color);
        System.out.println("la textura del computador2 es: "+computador2.textura);


        computador computador3 = new computador();

        computador3.nombre = "tactil";
        computador3.color = "blanco";
        computador3.textura = "pasta";

        System.out.println("\nel nombre del computador3 es: "+computador3.nombre);
        System.out.println("el color del computador3 es: "+computador3.color);
        System.out.println("la textura del computador3 es: "+computador3.textura);



    }
}