import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ids = new int[5];
        String[] names = new String[5];
        int[] marks = new int[5];

        int count = 0;

        while (true) {

            System.out.println("\n===== STUDENT RESULT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Highest Mark");
            System.out.println("5. Average Mark");
            System.out.println("6. Update Student Mark");
            System.out.println("7. Delete Student");
            System.out.println("8. Lowest Mark");
            System.out.println("9. Pass/Fail Count");
            System.out.println("10. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count == names.length) {
                        System.out.println("Array Full!");
                        break;
                    }

                    ids[count] = count + 101;

                    System.out.print("Student Name : ");
                    names[count] = sc.nextLine();

                    System.out.print("Student Mark : ");
                    int mark = sc.nextInt();
                    sc.nextLine();

                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid Mark! Enter between 0 and 100");
                        break;
                    }

                    marks[count] = mark;
                    count++;

                    System.out.println("Student Added Successfully");
                    break;


                case 2:

                    if (count == 0) {
                        System.out.println("No Students Found");
                        break;
                    }

                    System.out.println("\n===== STUDENT DETAILS =====");

                    for (int i = 0; i < count; i++) {

                        System.out.println("----------------------------");
                        System.out.println("ID     : " + ids[i]);
                        System.out.println("Name   : " + names[i]);
                        System.out.println("Mark   : " + marks[i]);

                        if (marks[i] >= 35)
                            System.out.println("Result : PASS");
                        else
                            System.out.println("Result : FAIL");


                        if (marks[i] >= 90)
                            System.out.println("Grade  : A");
                        else if (marks[i] >= 75)
                            System.out.println("Grade  : B");
                        else if (marks[i] >= 60)
                            System.out.println("Grade  : C");
                        else if (marks[i] >= 35)
                            System.out.println("Grade  : D");
                        else
                            System.out.println("Grade  : F");
                    }

                    break;


                case 3:

                    if (count == 0) {
                        System.out.println("No Students Found");
                        break;
                    }

                    System.out.print("Enter Student Name : ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(search)) {

                            found = true;

                            System.out.println("\nStudent Found");
                            System.out.println("ID   : " + ids[i]);
                            System.out.println("Name : " + names[i]);
                            System.out.println("Mark : " + marks[i]);

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found");

                    break;


                case 4:

                    if (count == 0) {
                        System.out.println("No Data");
                        break;
                    }

                    int highest = marks[0];
                    String topper = names[0];

                    for (int i = 1; i < count; i++) {

                        if (marks[i] > highest) {

                            highest = marks[i];
                            topper = names[i];

                        }
                    }

                    System.out.println("Topper : " + topper);
                    System.out.println("Highest Mark : " + highest);

                    break;


                case 5:

                    if (count == 0) {
                        System.out.println("No Data");
                        break;
                    }

                    int total = 0;

                    for (int i = 0; i < count; i++) {
                        total += marks[i];
                    }

                    double average = (double) total / count;

                    System.out.println("Total Marks : " + total);
                    System.out.println("Average Mark : " + average);

                    break;


                case 6:

                    if (count == 0) {
                        System.out.println("No Students Found");
                        break;
                    }

                    System.out.print("Enter Student Name : ");
                    String update = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(update)) {

                            System.out.print("Enter New Mark : ");
                            int newMark = sc.nextInt();
                            sc.nextLine();


                            if (newMark >= 0 && newMark <= 100) {

                                marks[i] = newMark;
                                System.out.println("Student Mark Updated Successfully");

                            } else {

                                System.out.println("Invalid Mark!");

                            }

                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Student Not Found");

                    break;


                case 7:

                    if (count == 0) {
                        System.out.println("No Students Found");
                        break;
                    }

                    System.out.print("Enter Student Name : ");
                    String delete = sc.nextLine();

                    boolean deleted = false;


                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(delete)) {


                            for (int j = i; j < count - 1; j++) {

                                ids[j] = ids[j + 1];
                                names[j] = names[j + 1];
                                marks[j] = marks[j + 1];

                            }

                            count--;

                            deleted = true;

                            System.out.println("Student Deleted Successfully");
                            break;
                        }
                    }


                    if (!deleted)
                        System.out.println("Student Not Found");

                    break;



                case 8:

                    if (count == 0) {
                        System.out.println("No Data");
                        break;
                    }


                    int lowest = marks[0];
                    String lowStudent = names[0];


                    for (int i = 1; i < count; i++) {

                        if (marks[i] < lowest) {

                            lowest = marks[i];
                            lowStudent = names[i];

                        }
                    }


                    System.out.println("Student : " + lowStudent);
                    System.out.println("Lowest Mark : " + lowest);

                    break;



                case 9:

                    if (count == 0) {
                        System.out.println("No Data");
                        break;
                    }


                    int pass = 0;
                    int fail = 0;


                    for (int i = 0; i < count; i++) {

                        if (marks[i] >= 35)
                            pass++;
                        else
                            fail++;

                    }


                    System.out.println("Total Students : " + count);
                    System.out.println("Pass Students : " + pass);
                    System.out.println("Fail Students : " + fail);

                    break;



                case 10:

                    System.out.println("Thank You!");
                    sc.close();
                    return;



                default:

                    System.out.println("Invalid Choice!");

            }
        }
    }
}