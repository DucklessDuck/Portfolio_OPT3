package timer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TaskSchoolTest {

    TaskList taskList;
    Task task1;
    Task task2;

    @BeforeEach
    void setUp(){
        taskList = new TaskList();
        task1 = new TaskSchool("Test1", "TestVak1", taskList.getUniqueTaskNumber());
        task2 = new TaskWork("Test2",  taskList.getUniqueTaskNumber());
    }

    @Test
    void prepareGetNameTaskTest(){
        assertEquals(" (School)", task1.prepareGetNameTask());
        assertNotEquals(" (School)", task2.prepareGetNameTask());
    }
}
