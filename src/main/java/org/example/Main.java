package org.example;

import org.example.model.Bus;
import org.example.model.Student;
import org.example.model.User;
import org.example.service.sorter.ext.BusSorter;
import org.example.service.sorter.ext.StudentSorter;
import org.example.service.sorter.ext.UserSorter;
import org.example.service.strategy.bus.impl.SortBusByMileage;
import org.example.service.strategy.bus.impl.SortBusByModel;
import org.example.service.strategy.bus.impl.SortBusByNumber;
import org.example.service.strategy.student.impl.SortStudentByAverageGrade;
import org.example.service.strategy.student.impl.SortStudentByGroupNumber;
import org.example.service.strategy.student.impl.SortStudentByRecordBookNumber;
import org.example.service.strategy.user.impl.SortUserByEmail;
import org.example.service.strategy.user.impl.SortUserByName;
import org.example.service.strategy.user.impl.SortUserByPassword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus.BusBuilder("3B111US777", "Liaz-677M").setMileage(10000).build();
        Bus bus2 = new Bus.BusBuilder("1B111US777", "PAZ-672").setMileage(1500).build();
        Bus bus3 = new Bus.BusBuilder("2B111US777", "ZIL-158A").setMileage(200).build();

        Bus[] buses = {bus1, bus2, bus3};
        BusSorter busSorter = new BusSorter();

        busSorter.setStrategy(new SortBusByMileage());
        busSorter.sort(buses);
        System.out.println(Arrays.toString(buses));

        busSorter.setStrategy(new SortBusByModel());
        busSorter.sort(buses);
        System.out.println(Arrays.toString(buses));

        busSorter.setStrategy(new SortBusByNumber());
        busSorter.sort(buses);
        System.out.println(Arrays.toString(buses));

        Student student1 =
                new Student.StudentBuilder("25F111", "1.0").setRecordBookNumber("17A").build();
        Student student2 =
                new Student.StudentBuilder("25F222", "2.0").setRecordBookNumber("17B").build();
        Student student3 =
                new Student.StudentBuilder("25F333", "3.0").setRecordBookNumber("17C").build();

        Student[] students = {student1, student2, student3};
        StudentSorter studentSorter = new StudentSorter();

        studentSorter.setStrategy(new SortStudentByAverageGrade());
        studentSorter.sort(students);
        System.out.println(Arrays.toString(students));

        studentSorter.setStrategy(new SortStudentByGroupNumber());
        studentSorter.sort(students);
        System.out.println(Arrays.toString(students));

        studentSorter.setStrategy(new SortStudentByRecordBookNumber());
        studentSorter.sort(students);
        System.out.println(Arrays.toString(students));

        User user1 = new User.UserBuilder("user1@gmail.com","123123").setName("Kleo").build();
        User user2 = new User.UserBuilder("user2@gmail.com","123124").setName("Sven").build();
        User user3 = new User.UserBuilder("user3@gmail.com","123125").setName("Andi").build();

        User[] users = {user1,user2, user3};
        UserSorter userSorter = new UserSorter();

        userSorter.setStrategy(new SortUserByEmail());
        userSorter.sort(users);
        System.out.println(Arrays.toString(users));

        userSorter.setStrategy(new SortUserByName());
        userSorter.sort(users);
        System.out.println(Arrays.toString(users));

        userSorter.setStrategy(new SortUserByPassword());
        userSorter.sort(users);
        System.out.println(Arrays.toString(users));
    }

}