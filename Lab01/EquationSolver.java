import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEquation Solver:");
            System.out.println("1. Solve first-degree equation (ax + b = 0)");
            System.out.println("2. Solve system of two first-degree equations");
            System.out.println("3. Solve second-degree equation (ax^2 + bx + c = 0)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Solve first-degree equation: ax + b = 0
    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("\nSolving first-degree equation (ax + b = 0)");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0 for a valid first-degree equation.");
        } else {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        }
    }

    // Solve system of two first-degree equations
    // a11 * x1 + a12 * x2 = b1
    // a21 * x1 + a22 * x2 = b2
    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("\nSolving system of two first-degree equations:");
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        // Calculate determinants
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Solve second-degree equation: ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("\nSolving second-degree equation (ax^2 + bx + c = 0)");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0 for a valid second-degree equation.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two real roots: root1 = " + root1 + ", root2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has one double root: root = " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }
}
