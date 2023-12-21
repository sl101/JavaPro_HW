package de.telran.module3.lesson_2023_12_20.hw;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    String firstName, lastName, jobTitle, department;
    int salary;

    @Override
    public String toString() {
        return  "\n" + firstName + " " + lastName + ":\n" +
                "jobTitle: " + jobTitle + "\n"+
                "department: " + department + "\n"+
                "salary: " + salary + "\n"+ "=====";}
}
