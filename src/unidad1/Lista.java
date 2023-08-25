package unidad1;


import java.util.*;

public class Lista {

    //comportamientos: acciones
    public static void InstanciasLugares(){

        System.out.println("\n");
        System.out.println("Lugares de fauna y flora");
        //instancias de objeto Lugares, el metodo constructor (new Lugares) tiene el nombre de la misma clase que inicializa
        Lugares lug1 = new Lugares("Cl. 73 #51d-14, Aranjuez, Medellín,", "9-18","jardin botanico", "0");
        Lugares lug2 = new Lugares("Cra. 52 #73-75, Aranjuez, Medellín", "8-17","parque explora", "37000");
        Lugares lug3 = new Lugares("Via a Piedras Blancas, Medellín, Antioquia", "7-17","Parque Arví", "0");
        Lugares lug4 = new Lugares(" Cl. 8 #84f-25, Medellín, Altavista, ", "libre","Cerro de las 3 Cruces", "0");

        ArrayList<Lugares> listl = new ArrayList<>();
        listl.add(lug1);
        listl.add(lug2);
        listl.add(lug3);
        listl.add(lug4);

        for (Lugares i: listl){
            System.out.println(i);
        }

    }


    public static void OrdenarPrecio(){

        System.out.println("--------------------------------------------------------");
        Lugares lug5 = new Lugares("Cl. 73 #51d-14, Aranjuez, Medellín,",null,"jardin botanico", "0");
        Lugares lug6 = new Lugares("Cra. 52 #73-75, Aranjuez, Medellín",null,"parque explora", "37000");
        Lugares lug7 = new Lugares("Via a Piedras Blancas, Medellín, Antioquia",null,"Parque Arví", "0");
        Lugares lug8 = new Lugares(" Cl. 8 #84f-25, Medellín, Altavista, ",null,"Cerro de las 3 Cruces", "0");

        ArrayList<Lugares> listl2 = new ArrayList<>();
        listl2.add(lug5);
        listl2.add(lug6);
        listl2.add(lug7);
        listl2.add(lug8);
        listl2.sort(Comparator.comparing(Lugares::getPrecio));

        for (Lugares o: listl2){
            System.out.println(o);
        }

    }

    public static void OrdenarNombre() {
        System.out.println("--------------------------------------------------------");
        Lugares lug9 = new Lugares("Cl. 73 #51d-14, Aranjuez, Medellín,",null,"jardin botanico", "0");
        Lugares lug10 = new Lugares("Cra. 52 #73-75, Aranjuez, Medellín",null,"parque explora", "37000");
        Lugares lug11= new Lugares("Via a Piedras Blancas, Medellín, Antioquia",null,"Parque Arví", "0");
        Lugares lug12= new Lugares(" Cl. 8 #84f-25, Medellín, Altavista, ",null,"Cerro de las 3 Cruces", "0");

        ArrayList<Lugares> listl3 = new ArrayList<>();
        listl3.add(lug9);
        listl3.add(lug10);
        listl3.add(lug11);
        listl3.add(lug12);
        listl3.sort(Comparator.comparing(Lugares::getNombre));

        for (Lugares p: listl3){
            System.out.println(p);
        }
    }

    public static void EliminarLugar() {
        System.out.println("--------------------------------------------------------");
        Lugares lug9 = new Lugares("Cl. 73 #51d-14, Aranjuez, Medellín,",null,"jardin botanico", "0");
        Lugares lug10 = new Lugares("Cra. 52 #73-75, Aranjuez, Medellín",null,"parque explora", "37000");
        Lugares lug11= new Lugares("Via a Piedras Blancas, Medellín, Antioquia",null,"Parque Arví", "0");
        Lugares lug12= new Lugares(" Cl. 8 #84f-25, Medellín, Altavista, ",null,"Cerro de las 3 Cruces", "0");

        ArrayList<Lugares> listl3 = new ArrayList<>();
        listl3.add(lug9);
        listl3.add(lug10);
        listl3.add(lug11);
        listl3.add(lug12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("lista de lugares" + listl3);
        System.out.println("Por favor ingresa el lugar que deseas eliminar, 0. jardin, 1. parque explora, 2. parque arvi, 3. cerro de las 3 cruces: ");
        int indice = scanner.nextInt();
        listl3.remove(indice);

        for (Lugares p: listl3){
            System.out.println(p);
        }

    }

    public static void AgregarLugar() {
        ArrayList<String> Lugares= new ArrayList<>();

        Lugares lug13 = new Lugares("Cl. 73 #51d-14, Aranjuez, Medellín,",null,"jardin botanico", "0");
        Lugares lug14 = new Lugares("Cra. 52 #73-75, Aranjuez, Medellín",null,"parque explora", "37000");
        Lugares lug15= new Lugares("Via a Piedras Blancas, Medellín, Antioquia",null,"Parque Arví", "0");
        Lugares lug16= new Lugares(" Cl. 8 #84f-25, Medellín, Altavista, ",null,"Cerro de las 3 Cruces", "0");

        Lugares.add(String.valueOf(lug13));
        Lugares.add(String.valueOf(lug14));
        Lugares.add(String.valueOf(lug15));
        Lugares.add(String.valueOf(lug16));


        //System.out.println("por favor ingresa un lugar siguiente el siguiente orden: UBICACION:________, HorarioDeAtencion: _____, Nombre:____, Precio:____");
        //String nuevoLugar = scanner.nextLine();
        //Lugares.add(nuevoLugar);

        System.out.println("____________________________________________-");

        //System.out.println("lista original\n" + Lugares);
        System.out.println("-->-->-->-->--> <--<--<--<--<--");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los detalles de la nueva instancia del lugar " +
                "separados por coma (ubicacion, horario, nombre, precio): ");
        String input = entrada.nextLine();
        String []inputs = input.split(",");
        String newUbicacion = inputs[0].trim();
        String newHorarioAtencion = inputs[1].trim();
        String newNombre = inputs[2].trim();
        String newPrecio = inputs[3].trim();
        Lugares newLugar = new Lugares(newUbicacion,newHorarioAtencion,newNombre,newPrecio);
        Lugares.add(String.valueOf(newLugar));
        System.out.println("Lista actualizada de lugares");
        System.out.println(Lugares);

        // for (String lugares: Lugares){
        //            System.out.println(Lugares.toString());
        //        }


    }
}
