package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    GradeService gradeService;
    GradeSystem mockGradeSystem;

    @BeforeEach
    void setUp(){
        mockGradeSystem = mock(GradeSystem.class);
        when(mockGradeSystem.gradesFor(isA(Long.class))).thenReturn(Arrays.asList(90.0, 95.0, 85.0));
        gradeService = new GradeService(mockGradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        double result = gradeService.calculateAverageGrades(10L);
        assertEquals(90.0,result);
    }
}
