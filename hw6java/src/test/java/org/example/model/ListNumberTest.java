package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNumberTest {

    @Test
    void getAverageList() {
        ListNumber listNumber = new ListNumber();
        int sum = 0;
        for (int item:
                listNumber.getListNum()) {
            sum += item;
        }
        double avg = sum / listNumber.getListNum().size();
        assertTrue(listNumber.getAverageList() == avg);
    }

    @Test
    void getListNum() {
        ListNumber listNumber = new ListNumber();
        assertTrue(listNumber.getListNum() == listNumber.getListNum());

    }

    @Test
    public void sizeListTest(){
        ListNumber listNumber = new ListNumber();
        assertTrue(listNumber.getListNum().size() == 10);
    }
}