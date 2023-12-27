package lesson_6;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ListNumberServiceTest {
    ListNumberService serviceTesting = new ListNumberService();
    ListNumber expectedList1 = new ListNumber(new ArrayList<>(Arrays.asList(10, 90)));
    ListNumber expectedList2 = new ListNumber(new ArrayList<>(Arrays.asList(90, 10, 2)));
    ListNumber expectedList3 = new ListNumber(new ArrayList<>(Arrays.asList(10, 90, 2)));
    Double expectedAverage = 50.0;

    @BeforeAll
    static void init() {
        System.out.println("tested 2 methods");
    }

    @AfterAll
    static void end() {
        System.out.println("testing completed");
    }

    @Test
    @DisplayName("testAverageInLis - correctness of finding the average value in List")
    void testAverageInList() {
        Double factAverage = serviceTesting.AverageInList(expectedList1);
        assertEquals("expected 50.0", expectedAverage, factAverage);
    }

    @Test
    @DisplayName("testCompareAverageInList - if the first one is greater")
    void testCompareAverageInList1() {
        serviceTesting.AverageInList(expectedList1);
        serviceTesting.AverageInList(expectedList2);
        String factResult = serviceTesting.compareAverageInList(expectedList1, expectedList2);
        assertSame(factResult,"Первый список имеет большее среднее значение");
    }

    @Test
    @DisplayName("testCompareAverageInList - if the second one is greater")
    void testCompareAverageInList2() {
        serviceTesting.AverageInList(expectedList2);
        serviceTesting.AverageInList(expectedList1);
        String factResult = serviceTesting.compareAverageInList(expectedList2, expectedList1);
        assertSame(factResult,"Второй список имеет большее среднее значение");
    }

    @Test
    @DisplayName("testCompareAverageInList - if equal")
    void testCompareAverageInList3() {
        serviceTesting.AverageInList(expectedList2);
        serviceTesting.AverageInList(expectedList3);
        String factResult = serviceTesting.compareAverageInList(expectedList2, expectedList3);
        assertSame(factResult,"Средние значения равны");
    }
}