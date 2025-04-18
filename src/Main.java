import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computadora compu = hacerComputadora();
        //Se crea el objeto y sus caracteristicas vienen de la función hacerComputadora.
        System.out.println("Los datos de la computadora son estos" + compu.mostrarDatos());
        System.out.println("el precio de la computadora es " + compu.calcularPrecio());
        compu.setTipo(1);
        System.out.println("el precio de la computadora es " + compu.calcularPrecio());

    }

    public static Computadora hacerComputadora() {  //Funcion que utilizo para crear un objeto
                                                    // de tipo Computadora.
        Scanner imput = new Scanner(System.in);
        int idIngresado = imput.nextInt(); imput.nextLine();
        String marcaIngresada = "Exo";
        String modeloIng = "modelo";
        int precioIng = 1500;
        int tipoIng = 2;
        String procesadorIng = "Intel";
        String memRamIng = "Intel";
        int almacenamientoIng = 512;
        /*Estas variables ya tienen definidas valores, pero dichos datos se pueden ingresar primero
        por consola. Por ejemplo en la linea 18.
         */

        Computadora compu = new Computadora(idIngresado, marcaIngresada, modeloIng, precioIng,
                tipoIng, procesadorIng, memRamIng, almacenamientoIng);
        // se crea el objeto y se envia afuera de la funcion a traves del return.
        return compu;
    }
}