package studentdatabaseapp;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student firstname ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student lastname ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter class level: ");
        this.gradeYear = scanner.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + " " + gradeYear + " " + studentID);

    }

    public void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else
            {
            break;}
        } while (1 != 0);

        //System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUITION BALANCE " + tuitionBalance);
    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment for $" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: $ " + tuitionBalance;
    }

}
