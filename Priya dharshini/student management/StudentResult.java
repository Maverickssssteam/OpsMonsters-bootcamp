import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ids = new int[5];
        String[] names = new String[5];
        int[] marks = new int[5];

        int count = 0;

        while (true) {

            System.out.println("\n===== STUDENT RESULT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Highest Mark");
            System.out.println("5. Average Mark");
            System.out.println("6. Update Mark");
            System.out.println("7. Delete Student");
            System.out.println("8. Lowest Mark");
            System.out.println("9. Pass/Fail Count");
            System.out.println("10. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                case 1:

                    if (count == 5) {
                        System.out.println("Student limit reached");
                        break;
                    }

                    ids[count] = 101 + count;

                    System.out.print("Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Mark: ");
                    marks[count] = sc.nextInt();
                    sc.nextLine();

                    count++;

                    System.out.println("Student Added");
                    break;


                case 2:

                    if (count == 0) {
                        System.out.println("No Students");
                        break;
                    }

                    for (int i = 0; i < count; i++) {

                        System.out.println("\nID : " + ids[i]);
                        System.out.println("Name : " + names[i]);
                        System.out.println("Mark : " + marks[i]);

                        System.out.println(
                                marks[i] >= 35 ? "PASS" : "FAIL"
                        );
                    }

                    break;


                case 3:

                    System.out.print("Search Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(search)) {

                            System.out.println("ID : " + ids[i]);
                            System.out.println("Mark : " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found");

                    break;


                case 4:

                    int max = marks[0];
                    String topper = names[0];

                    for (int i = 1; i < count; i++) {

                        if (marks[i] > max) {

                            max = marks[i];
                            topper = names[i];

                        }
                    }

                    System.out.println("Topper : " + topper);
                    System.out.println("Mark : " + max);

                    break;


                case 5:

                    int total = 0;

                    for (int i = 0; i < count; i++) {

                        total += marks[i];

                    }

                    System.out.println("Average : " + 
                    (double) total / count);

                    break;


                case 6:

                    System.out.print("Student Name: ");
                    String name = sc.nextLine();

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(name)) {

                            System.out.print("New Mark: ");
                            marks[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Updated");
                            break;
                        }
                    }

                    break;


                case 7:

                    System.out.print("Delete Name: ");
                    String del = sc.nextLine();


                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(del)) {


                            for (int j = i; j < count - 1; j++) {

                                ids[j] = ids[j+1];
                                names[j] = names[j+1];
                                marks[j] = marks[j+1];

                            }

                            count--;

                            System.out.println("Deleted");
                            break;
                        }
                    }

                    break;


                case 8:

                    int min = marks[0];
                    String low = names[0];


                    for (int i = 1; i < count; i++) {

                        if (marks[i] < min) {

                            min = marks[i];
                            low = names[i];

                        }
                    }

                    System.out.println("Lowest : " + low);
                    System.out.println("Mark : " + min);

                    break;


                case 9:

                    int pass = 0;
                    int fail = 0;


                    for (int i = 0; i < count; i++) {

                        if (marks[i] >= 35)
                            pass++;
                        else
                            fail++;
                    }

                    System.out.println("Pass : " + pass);
                    System.out.println("Fail : " + fail);

                    break;


                case 10:

                    System.out.println("Thank You");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}