package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
    }

    @Test
    @DisplayName("Adding student in the list")
    void testAddNewStudent() {
        students.addNewStudent("111", "AAA");
        students.addNewStudent("112", "AAB");
        students.addNewStudent("113", "AAC");

        assertEquals(3, students.getStudents().size());
    }

    @Test
    @DisplayName("Adding student in the list with score")
    void testAddNewStudent2() {
        students.addNewStudent("111", "AAA", 55.5);
        students.addNewStudent("112", "AAB", 61.25);

        assertEquals(2, students.getStudents().size());
    }

    @Test
    @DisplayName("Test finding student by input ID")
    void testFindStudentById() {
        students.addNewStudent("111", "AAA");

        Student s1 = students.findStudentById("111");
        assertEquals("AAA", s1.getName());
    }

    @Test
    @DisplayName("Test Giving score to ID")
    void testGiveScoreToId(){
        students.addNewStudent("777", "Seraphis");
        students.giveScoreToId("777", 50.5);

        Student s1 = students.findStudentById("777");
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("View grade of Student")
    void testViewGradeOfId(){
        students.addNewStudent("222", "Luna", 76.6);
        String grade = students.viewGradeOfId("222");
        assertEquals("B", grade);
    }

}