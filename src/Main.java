import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int cantidadEstudiantes,aprobados,reprobados;
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

        teclado.close();*/
        Scanner sc = new Scanner(System.in);

        // Inicialización de variables
        int numEstudiantes = 0;
        int  numMaterias = 0;
        int sumaEstudiante, sumaMateria, sumaGeneral = 0;
        float nota;

        // Solicitar número de estudiantes y materias
        System.out.print("Ingrese el número de estudiantes: ");
        numEstudiantes = sc.nextInt();

        System.out.print("Ingrese el número de materias: ");
        numMaterias = sc.nextInt();

        int [][] notas = new int[numEstudiantes][numMaterias];

        // Registrar notas con validación
        for (int i = 0; i < numEstudiantes; i++) {
            for (int j = 0; j < numMaterias; j++) {
                do {
                    System.out.print("Ingrese la nota del estudiante " + (i + 1) +
                            " en la materia " + (j + 1) + " (0 a 5): ");
                    nota = sc.nextInt();
                } while (nota < 0 || nota > 5);
                notas[i][j] = nota;
            }
        }

        // Mostrar matriz en forma de tabla
        System.out.println("\nMatriz de notas:");
        for (double i = 0; i < numEstudiantes; i++) {
            for (int j = 0; j < numMaterias; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular promedio por estudiante
        System.out.println("\nPromedio por estudiante:");
        for (double i = 0; i < numEstudiantes; i++) {
            sumaEstudiante = 0;
            for (int j = 0; j < numMaterias; j++) {
                sumaEstudiante += notas[i][j];
            }
            System.out.println("Estudiante " + (i + 1) + ": " +
                    (sumaEstudiante / numMaterias));
        }

        // Calcular promedio por materia
        System.out.println("\nPromedio por materia:");
        for (double j = 0; j < numMaterias; j++) {
            sumaMateria = 0;
            for (double i = 0; i < numEstudiantes; i++) {
                sumaMateria += notas[i][j];
            }
            System.out.println("Materia " + (j + 1) + ": " +
                    (sumaMateria / numEstudiantes));
        }
        // Calcular promedio general
        for (double i = 0; i < numEstudiantes; i++) {
            for (int j = 0; j < numMaterias; j++) {
                sumaGeneral += notas[i][j];
            }
        }
        System.out.println("|Promedio general: " +
                (sumaGeneral / (numEstudiantes * numMaterias)));

        sc.close();


    }
}
