package org.example;

import org.example.model.AnalyzerList;
import org.example.model.ListNumber;

public class Processor {
    private View view;
    private AnalyzerList analyzerList;
    private ListNumber listNumber1;
    private ListNumber listNumber2;


    public Processor(View view, AnalyzerList analyzerList, ListNumber listNumber1, ListNumber listNumber2) {
        this.view = view;
        this.analyzerList = analyzerList;
        this.listNumber1 = listNumber1;
        this.listNumber2 = listNumber2;
    }

    public void run(){
        view.showMessage("Первый список");
        view.showList(listNumber1.getListNum());
        view.showMessage("среднее значение: ");
        view.showDouble(listNumber1.getAverageList());
        view.showMessage("Второй список");
        view.showList(listNumber2.getListNum());
        view.showMessage("среднее значение: ");
        view.showDouble(listNumber2.getAverageList());
        view.showMessage("Список с наибольшим среднем значением");
        view.showList(analyzerList.getMax().getListNum());
    }
}
