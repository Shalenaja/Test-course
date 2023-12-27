package lesson_6;

import java.util.ArrayList;

public class ListNumberService {

    ListNumber list = new ListNumber(new ArrayList<>());

    public Double AverageInList(ListNumber listnumber) {
        return listnumber.AverageNumberInList();
    }

    public String compareAverageInList(ListNumber one, ListNumber two) {
        String result = "";
        if (one.getAverage().equals(two.getAverage())) {
            result = "Средние значения равны";
        } else if (one.getAverage() > two.getAverage()) {
            result = "Первый список имеет большее среднее значение";
        } else {
            result = "Второй список имеет большее среднее значение";
        }
        return result;
    }

}
