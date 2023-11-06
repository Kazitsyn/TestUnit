package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListNumber {
    private List<Integer> listNum;
    private Random rnd = new Random();
    public ListNumber() {
        this.listNum = new ArrayList<>();
        generator();
    }
    private void generator(){
        for (int i = 0; i < 10; i++){
            this.listNum.add(rnd.nextInt(0, 100));
        }
    }

    public double getAverageList(){
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += this.listNum.get(i);
        }
        return result/10;
    }
    public List<Integer> getListNum() {
        return listNum;
    }

}
