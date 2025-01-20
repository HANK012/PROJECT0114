package com.HANK;

import com.hank.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StudentsTest {
    @Test
    public void highestScoreTest()
    {
        Student student=new Student("Hank",60,80);
        Assertions.assertEquals(80,student.highest());

    }
@Test
    void averageTest()
    {
        Student student=new Student("Hank",80,90);
        Assertions.assertEquals(85,student.getaverage());

    }
}
