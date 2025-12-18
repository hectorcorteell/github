import java.util.Scanner;

public class Saludo {
    public void saludar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola"+nombre);
        sc.close();
    }

    public void saludarConEdad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        if(edad<18){
            System.out.println("Hola "+nombre+" eres bastante joven.");

        }else{
            System.out.println("Hola "+nombre+" espero que tengas un gran día.");
        }
    }
}
