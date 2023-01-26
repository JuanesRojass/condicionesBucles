import java.util.Scanner;



public class Ejercicio {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(System.in);
        System.out.println("EJERCICIO IF - ELIF - ELSE");
        System.out.println("--------------------------");
        System.out.println("Ingrese un numero:\n");
        int numeroIf = r.nextInt();

        if(numeroIf > 0){
            System.out.println("El numero ingresado es positivo");
        }else if (numeroIf < 0){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es 0");
        }
    
        System.out.println("-----------------------------");
        System.out.println("-------EJERCICIO WHILE-------");
        System.out.println("-----------------------------");

        int numeroWhile = -5;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("-----------------------------");
        System.out.println("-----EJERCICIO DO WHILE-----");
        System.out.println("-----------------------------");

        int numeroDoWhile = 3;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <3);

        System.out.println("-----------------------------");
        System.out.println("-----EJERCICIO BUCLE FOR-----");
        System.out.println("-----------------------------");

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("----------------------------");
        System.out.println("------EJERCICIO SWITCH------");
        System.out.println("----------------------------");

        System.out.println("Ingresa una estacion del año: \n");
        String estacion = r.next().toUpperCase();

        switch(estacion){
            case "VERANO":
            System.out.println("VERANO es una estación");
            break;
            case "INVIERNO":
            System.out.println("INVIERNO es una estación");
            break;
            case "PRIMAVERA":
            System.out.println("PRIMAVERA es una estación");
            break;
            case "OTOÑO":
            System.out.println("OTOÑO es una estación");
            break;

            default:
            System.out.println("Lo que ingresaste no es una estacion del año");
            break;
        }


    }
}
