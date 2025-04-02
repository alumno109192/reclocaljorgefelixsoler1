import java.util.Scanner;

public class MediaTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();
        
        double media = calcularMedia(num1, num2, num3);
        System.out.println("La media de los tres números es: " + media);
        
        scanner.close();
    }

    // Función que calcula la media de tres números
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}