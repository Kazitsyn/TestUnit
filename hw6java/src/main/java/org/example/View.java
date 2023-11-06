package org.example;

import java.util.List;

public class View {
    public void showList(List<Integer> listNum){
        System.out.println();
        for (int item: listNum) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void showMessage(String mes){
        System.out.print(mes);
    }

    public void showDouble(Double num){
        System.out.println(num);
    }

}
