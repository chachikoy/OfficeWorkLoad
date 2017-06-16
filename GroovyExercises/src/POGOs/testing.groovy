package POGOs

import groovy.transform.*

/**
 * Created by cnapoles on 6/13/17.
 */

import org.junit.Test
@Canonical
class TaskTest {
    Date now = new Date()
    Task t = new Task(name:'name', priority:3,
            startDate:now, endDate: now + 1, completed: true);

    @Test
    void testToString() {
        assert t.toString() ==
                "Task [name=${t.name}, priority=${t.priority}, " +
                "startDate=$now, endDate=${now+1}, completed=${t.completed}]"
    }

    @Test
    void testGetAndSetName() {
        assert t.name == 'name'
        t.name = 'other'
        assert t.name == 'other'
    }

    @Test
    void testGetAndSetPriority() {
        assert t.priority == 3
        t.priority = 4
        assert t.priority == 4
    }

    @Test
    void testGetAndSetStartDate() {
        assert (t.startDate - new Date()).abs() < 1
        t.startDate = new Date() + 1
        assert (t.startDate - (new Date() + 1)) < 1
    }

    @Test
    void testGetAndSetEndDate() {
        assert (t.endDate - (new Date() + 1)).abs() < 1
        t.endDate = new Date() + 2
        assert (t.endDate - (new Date() + 2)).abs() < 1
    }

    @Test
    void testIsAndSetCompleted() {
        assert t.completed
        t.completed = false
        assert !t.completed
    }
    @Test
    void testEqualTasks() {
        Task t1 = new Task(name:'cha', priority:4,
                startDate:now, endDate: now + 1, completed: true)
        assert t == t1  // THIS SHOULD FAIL
    }
    @Test
    void testTupleConstructor(){
        Task t2 = new Task('charlotte', 3, now, now+1, true)
        assert t == t2
    }
}