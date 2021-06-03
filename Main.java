// import java.util.Scanner;

/**
 * public class Main { public static void main(String[] args) { Scanner jack =
 * new Scanner(System.in);
 * 
 * System.out.println("What is Your Name?"); String name = jack.nextLine();
 * 
 * System.out.println("What is Your Age?"); int age = jack.nextInt();
 * jack.nextLine();
 * 
 * System.out.println("What is Your favourate song"); String song =
 * jack.nextLine();
 * 
 * System.out.println("hello " + name); System.out.println("Your age is " + age
 * + " years old"); System.out.println("Your Fav Song is " + song); } }
 */

// EXPRESSION JAVA
/**
 * public class Main { public static void main(String[] args) {
 * 
 * // expression = operands and operators // operands = value, variables,
 * number, quantity // operators = * - / %
 * 
 * double a = 10; a = (double) a / 3; // a++; System.out.println(a);
 * 
 * } }
 */

// GUI IN JAVA
/**import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Your name");
        String lname = JOptionPane.showInputDialog("Enter Your Last name");
        JOptionPane.showMessageDialog(null, "Hello " + name + " " + lname);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null, "Your Age is " + age + " Years Old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null, "Your Height is " + height + " Cm");

    }
}*/

// MATH CALCULATION
/**import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ouble x = 3.14;
        // double y = -10;
        // double z = Math.min(x, y);
        // System.out.println(z);

        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X: ");
        x = scanner.nextDouble();
        System.out.println("Enter side Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The Hypotenuse is: " + z);

        scanner.close();
    }
}*/

// RANDOM NUMBER
/**import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random jackson = new Random();
        // int x = jackson.nextInt(6) + 1;
        // double y = jackson.nextDouble();
        boolean z = jackson.nextBoolean();
        System.out.println(z);
    }
}*/

// IF STATEMENTS
/**import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jane = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = jane.nextInt();

        if (age <= 18) {
            System.out.println("Your a Child");
        }

        else {
            System.out.println("Your Older");
        }
    }
}*/

// SWITCH STATEMENTS
/**import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jordan = new Scanner(System.in);
        System.out.println("Gues the Day?");
        String day = jordan.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("Yes today is Monday");
                break;
            case "Tuesday":
                System.out.println("Yes today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Yes today is Wednesday");
                break;
            default:System.out.println("That is not a Day");
        }

    }
}*/

// LOGICAL OPERATORS
/**import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jordan = new Scanner(System.in);
        System.out.println("Press Q or q to quit");
        String response = jordan.next();

        /**
         * int temp = jordan.nextInt(); if (temp < 20) { System.out.println("its hot
         * outside"); }
         * 
         * if (temp >= 20 && temp <= 30) { System.out.println("its cold out side"); }
         * 
         * else { System.out.println("its warm outside"); }
         */

/**
 * if (response.equals("q") || response.equals("Q")) { System.out.println("Your
 * quit the game"); } else { System.out.println("Your still playing the game");
 * }
 */

/*if (!response.equals("q") && !response.equals("Q")) {
    System.out.println("You still on the game");
} else {
    System.out.println("Your quit the game");
}
}
}*/

// WHILE LOOP
/**
 * import java.util.Scanner;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) { Scanner jordan = new
 * Scanner(System.in); String name = "";
 * 
 * while (name.isBlank()) { System.out.print("Enter your name: "); name =
 * jordan.nextLine(); } System.out.println("Yes Good Job " + name);
 * 
 * } }
 */

// FOR LOOP

/**
 * public class Main { public static void main(String[] args) { for (int i = 10;
 * i >= 0; i++) { System.out.println(i); } System.out.println("Happy new Year");
 * } }
 */

// NESTED LOOP
/** import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jay = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of Rows: ");
        rows = jay.nextInt();
        System.out.println("Enter number of Columns: ");
        columns = jay.nextInt();
        System.out.println("Enter the Symbol to use: ");
        symbol = jay.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }

}*/

// NESTED LOOP

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jay = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of Rows: ");
        rows = jay.nextInt();
        System.out.println("Enter number of Columnsss: ");
        columns = jay.nextInt();
        System.out.println("Enter the Symbol to usse: ");
        symbol = jay.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }

}