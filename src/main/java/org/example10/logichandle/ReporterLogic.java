package org.example10.logichandle;

import org.example10.entity.Reporter;

import java.util.Scanner;

public class ReporterLogic {
    private Reporter[] reporters = new Reporter[100];

    public Reporter[] getReporters() {
        return reporters;
    }

    public void inputReporter(){
        System.out.print("Bạn muốn thêm mới bao nhiêu phóng viên: ");
        int reporterNumber = new Scanner(System.in).nextInt();
        for(int i = 0; i < reporterNumber; i++){
            System.out.println("Phóng viên thứ " + (i + 1));
            Reporter reporter = new Reporter();
            reporter.inputInfo();
            saveReporter(reporter);
        }
    }

    public void saveReporter(Reporter reporter){
        for(int i = 0; i < reporters.length; i++){
            if(reporters[i] == null){
                reporters[i] = reporter;
                break;
            }
        }
    }
    public void showReporter() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                System.out.println(reporters[i]);
            }
        }
    }

    public boolean reporterIsNotEmpty() {
        for (int i = 0; i < reporters.length; i++) {
            if (reporters[i] != null) {
                return true;
            }
        }
        return false;
    }
}
