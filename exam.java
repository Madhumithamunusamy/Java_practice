import java.util.Scanner;

class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean login = true;
        int mark = 0;
        while (login) {
            System.out.print("Enter the username: ");
            String username = sc.next();

            System.out.print("Enter the Password: ");
            int password = sc.nextInt();

            if (username.equals("Student123") && password == 9999) {
                System.out.println("Login Successfully\n");

                boolean exit = true;

            
                while (exit) {
                    System.out.println("\n1. Start Exam");
                    System.out.println("2. View Result");
                    System.out.println("3. Exit");
                    System.out.print("Choose an option: ");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            mark = 0;
                            System.out.println("\nExam Started\n");

                            for (int i = 0; i < 3; i++) {
                                char answer;
                                if (i == 0) {
                                    System.out.println("1. What is the size of an int variable in Java?");
                                    System.out.println("A) 8 bits\nB) 16 bits\nC) 32 bits\nD) 64 bits");
                                    System.out.print("Enter your answer: ");
                                    answer = sc.next().charAt(0);
                                    if (answer == 'C') mark++;
                                } else if (i == 1) {
                                    System.out.println("2. What is the default value of a boolean variable in Java?");
                                    System.out.println("A) true\nB) 1\nC) 0\nD) false");
                                    System.out.print("Enter your answer: ");
                                    answer = sc.next().charAt(0);
                                    if (answer == 'D') mark++;
                                } else if (i == 2) {
                                    System.out.println("3. Which operator is used for comparison in Java?");
                                    System.out.println("A) ==\nB) =\nC) !=\nD) :=");
                                    System.out.print("Enter your answer: ");
                                    answer = sc.next().charAt(0);
                                    if (answer == 'A') mark++;
                                }
                            }

                            System.out.println("Exam Finished!\n");
                            break;

                        case 2:
                            System.out.println("Your Score is: " + mark + " out of 3\n");
                            break;

                        case 3:
                            System.out.println("Thank you for attending the exam!");
                            exit = false;
                            login = false;
                            break;

                        default:
                            System.out.println("Please enter a valid option!");
                    }
                }

            } else {
                System.out.println("Invalid username or password. Please try again.\n");
            }
        }

        sc.close();
    }
}