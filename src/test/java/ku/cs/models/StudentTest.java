package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    //Init Every time test runs
    @BeforeEach
    void init() {
        s1 = new Student("6610450951", "PP");
    }

    @Test
    @DisplayName("Test Addscore")
    void testAddScore(){
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("Test calculate grade")
    void testCalculateGrade(){
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }

    @Test
    @DisplayName("Test Changing name")
    void testChangeName() {
        s1.changeName("KAKA");
        assertEquals("KAKA", s1.getName());
    }

    @Test
    @DisplayName("Test Equal of ID")
    void testIsID() {
        assertTrue(s1.isId("6610450951"));
    }

}