package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TasksTest {

    @Test
    public void epicMatchesTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void epicMatchesTest2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Мясо");

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void simpleTaskMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(11, "Покупки");

        boolean expected = true;
        boolean actual = simpleTask.matches("Покупки");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void simpleTaskMatchesTest2() {
        SimpleTask simpleTask = new SimpleTask(11, "Покупки");

        boolean expected = false;
        boolean actual = simpleTask.matches("Уроки");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesTest() {
        Meeting meeting = new Meeting(11, "Покупки", "Экономия денег", "11-00");

        boolean expected = true;
        boolean actual = meeting.matches("Покупки");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesTest2() {
        Meeting meeting = new Meeting(11, "Покупки", "Экономия денег", "11-00");

        boolean expected = true;
        boolean actual = meeting.matches("Экономия денег");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesTest3() {
        Meeting meeting = new Meeting(11, "Покупки", "Экономия денег", "11-00");

        boolean expected = false;
        boolean actual = meeting.matches("Продажи");

        Assertions.assertEquals(expected, actual);

    }
}