package de.telran.module3.lesson_2023_12_18_FunkInt.hw.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleWork {
    public static void main(String[] args) {
        createSchedule();
    }

    public static void createSchedule(){
        DoWork<Worker, WorkTask> work = (worker, task)-> worker + " have to "+ task.getTask() + " at " + task.getTime();

        List<String> workList = new ArrayList<String>();
        workList.add(work.doWork(new Worker("John", "student"), new WorkTask(9, "clean")));
        workList.add(work.doWork(new Worker("Sam", "laborer"), new WorkTask(10, "bring in a brick")));
        workList.add(work.doWork(new Worker("Samuel", "student"), new WorkTask(12, "take out bricks")));

        for (String task: workList){
            System.out.println(task);
        }
    }

}
