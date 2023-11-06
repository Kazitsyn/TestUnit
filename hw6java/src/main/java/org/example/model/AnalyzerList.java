package org.example.model;

public class AnalyzerList {
    private ListNumber listNumber1;
    private ListNumber listNumber2;

    public AnalyzerList(ListNumber listNumber1, ListNumber listNumber2) {
        this.listNumber1 = listNumber1;
        this.listNumber2 = listNumber2;
    }

    private boolean list1Max(){
        return this.listNumber1.getAverageList() > this.listNumber2.getAverageList();
    }

    public ListNumber getMax(){
        if (list1Max()){
            return listNumber1;
        }
        return listNumber2;
    }



}
