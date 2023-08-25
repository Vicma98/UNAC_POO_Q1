package unidad1;

import java.util.Scanner;

public class InicioConsola {
    private static final int MAXIMA_OPCION_MENU = 8;

    public static void menuPrincipal() {
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        do {
            InicioConsola.saludo();
            System.out.println("\nPor favor digite una opcion:");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. mostrar lista de lugares");
            System.out.println("2. ORDENAR POR PRECIO");
            System.out.println("3. ORDENAR POR NOMBRE");
            System.out.println("4. ELIMINAR LUGAR");
            System.out.println("5. AGREGAR LUGAR");
            System.out.println("-----------------------------------------------------");
            System.out.println("6. LEER ARCHIVO");
            System.out.println("7. ESCRIBIR ARCHIVO");


            System.out.println(MAXIMA_OPCION_MENU + ". Salir de la aplicacion");
            opcionMenu = scanner.nextInt();
            scanner.nextLine(); //Se agrega para procesar el enter
            // despues de digitar un numero
            switch (opcionMenu) {
                case 1 -> Lista.InstanciasLugares();
                case 2 -> Lista.OrdenarPrecio();
                case 3 -> Lista.OrdenarNombre();
                case 4 -> Lista.EliminarLugar();
                case 5 -> Lista.AgregarLugar();
                //case 6 -> LeerArchivo.leerArchivo();
                //case 7 -> EscribirArchivo.escribirArchivo();

                case MAXIMA_OPCION_MENU -> System.out.println("Hasta pronto");
                default -> System.err.println("ERROR: Opcion invalida");
            }

        } while (opcionMenu != MAXIMA_OPCION_MENU);
    }

    public static void saludo() {
        System.out.print("Bienvenidos ");

    }

}
