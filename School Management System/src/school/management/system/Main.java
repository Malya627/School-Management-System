package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Jayashree = new Teacher(1,"Jayashree",500);
        Teacher Samhitha = new Teacher(2,"Samhitha",700);
        Teacher Pallavi = new Teacher(3,"Pallavi",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Jayashree);
        teacherList.add(Samhitha);
        teacherList.add(Pallavi);


        Student Niranjan = new Student(1,"Niranjan Malya",4);
        Student Sandhya = new Student(2,"Sandhya M Bhagavath",12);
        Student Vicky = new Student(3,"Vikhyath Bangera",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Niranjan);
        studentList.add(Sandhya);
        studentList.add(Vicky);

        School ghs = new School(teacherList,studentList);

        Teacher Sagar = new Teacher(6,"Sagar", 900);

        ghs.addTeacher(Sagar);

        Niranjan.payFees(5000);
        Sandhya.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Jayashree.receiveSalary(Jayashree.getSalary());
        System.out.println("GHS has spent for salary to " + Jayashree.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        Samhitha.receiveSalary(Samhitha.getSalary());
        System.out.println("GHS has spent for salary to " + Samhitha.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(Samhitha);
        Jayashree.receiveSalary(Jayashree.getSalary());
        System.out.println(Jayashree);
    }
}
