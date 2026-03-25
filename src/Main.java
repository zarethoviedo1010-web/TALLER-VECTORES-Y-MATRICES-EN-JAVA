import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidadEstudiantes,aprobados,reprobados;
        double[] notas;
        double suma,promedio,notaMayor,notaMenor,nota;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        aprobados = 0;
        reprobados = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = teclado.nextInt();

        notas = new double[cantidadEstudiantes];
        for (int i = 0; i < cantidadEstudiantes; i++) {
            do {
                System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0 a 5): ");
                nota =teclado.nextDouble();
                if (nota < 0 || nota > 5) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 5.");
                }
            } while (nota < 0 || nota > 5);
            notas[i] = nota;
            suma += nota;
            if (nota >= 3.0) {
                aprobados++;
                System.out.println("El estudiante " + (i + 1) + " APROBÓ.");
            } else {
                reprobados++;
                System.out.println("El estudiante " + (i + 1) + " REPROBÓ.");
            }
        }
        promedio = suma / cantidadEstudiantes;
        notaMayor = notas[0];
        notaMenor = notas[0];
        for (int i = 1; i < cantidadEstudiantes; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        System.out.println("Notas registradas:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        teclado.close();
    }
}
