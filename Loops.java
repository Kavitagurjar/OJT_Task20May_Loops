public class Loops {
    public static void main(String[] args) {

        // CONDITION & LOOPS 
        int marks = 75;
        String output = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(output);

        if (marks >= 75 && marks <= 100) {
            System.out.println("Distinction");
        } else if (marks >= 60 && marks < 75) {
            System.out.println("First class");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("second class");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("pass class");
        } else if (marks > 0 && marks < 40) {
            System.out.println("fail");
        }

            for (int a = 2; a <= 100; a*=2) {
        System.out.println("Thank you");
                System.out.println(a);
        }

        // WHILE LOOP

        int a = 2;
        while (a <= 20) {
            // System.out.println("Kavita Gurjar");
            System.out.println(a);
            a++;
        }

        // DO WHILE LOOP

        int b = 1;
        do {
            System.out.println(b);
            b++;
        } 
        while (b < 5);

        // FOR LOOP

        for (int i = 0; i < 6; i++) {
            System.out.println("Kavita Gurjar");
        }

    }
    
}