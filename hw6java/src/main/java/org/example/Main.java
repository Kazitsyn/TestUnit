package org.example;

import org.example.model.AnalyzerList;
import org.example.model.ListNumber;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ListNumber listNumber1 = new ListNumber();
        ListNumber listNumber2 = new ListNumber();
        AnalyzerList analyzerList = new AnalyzerList(listNumber1,listNumber2);
        Processor processor = new Processor(view,analyzerList,listNumber1,listNumber2);

        processor.run();
    }

}