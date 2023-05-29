import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class TaskTest extends TestCase {
    @Test
    public void testMatchesForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
        //Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("бабушке");
        boolean expected = true;

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesForEpicWhenTrue() {
        Epic epic = new Epic(0, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForEpicWhenFalse() {
        Epic epic = new Epic(0, new String[]{"Молоко", "Яйца", "Хлеб"});

        boolean actual = epic.matches("Колбаса");
        boolean expected = true;

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesForMeetingTopicWhenTrue() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("приложения");
        boolean expected = true;

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForMeetingTopicWhenFalse() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("4й");
        boolean expected = true;

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesForMeetingProjectWhenTrue() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForMeetingProjectWhenFalse() {
        Meeting meeting = new Meeting(
                0,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                null
        );

        boolean actual = meeting.matches("Альфабанка");
        boolean expected = true;

        Assertions.assertFalse(actual);
    }
}