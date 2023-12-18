package de.telran.module3.lesson_2023_12_18_FunkInt.hw.task_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Worker {
    String name;
    String role;

    @Override
    public String toString() {
        return role + " " + name;
    }
}
