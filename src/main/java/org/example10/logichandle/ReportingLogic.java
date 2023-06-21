package org.example10.logichandle;

import org.example10.entity.Posts;
import org.example10.entity.Reporter;
import org.example10.entity.Reporting;
import org.example10.entity.ReportingDetail;

import java.util.Scanner;

public class ReportingLogic {
    private final Reporting[] reportings = new Reporting[100];
    private ReporterLogic reporterLogic;
    private PostsLogic postsLogic;

    public ReportingLogic(ReporterLogic reporterLogic, PostsLogic postsLogic) {
        this.reporterLogic = reporterLogic;
        this.postsLogic = postsLogic;
    }
    public void inputNewReporter(){
        if(!reporterLogic.reporterIsNotEmpty() || !postsLogic.postsIsNotEmpty()){
            System.out.println("Không có dữ liệu vui lòng tạo thông tin");
            return;
        }
        System.out.println("Nhập số lượng phóng viên cần xử lý: ");
        int reporterNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < reporterNumber ; i++) {
            System.out.println("Nhập thông tin phóng viên " +(i + 1));
            System.out.println("Nhập id phóng viên: ");
            int reporterId;
            Reporter reporter = null;
            do {
                reporterId = new Scanner(System.in).nextInt();
                for (int j = 0; j < reporterLogic.getReporters().length; j++){
                    if(reporterLogic.getReporters()[j] != null && reporterLogic.getReporters()[j].getId() == reporterId){
                        reporter = reporterLogic.getReporters()[j];
                        break;
                    }
                }
                if(reporter != null){
                    break;
                }
                System.out.println("Không tồn tại id phóng viên, vui lòng xác nhân lại");
            }while (true);
            System.out.println("Phóng viên có bao nhiêu bài: ");
            int postNumber = new Scanner(System.in).nextInt();
            ReportingDetail[] details = new ReportingDetail[postNumber] ;
            int count = 0;
            for(int j = 0; j < postNumber; j++){
                System.out.println("Bài" + (j+1));
                int maId;
                Posts posts = null;
                do {
                    System.out.println("Nhập mã bài: ");
                    maId = new Scanner(System.in).nextInt();
                    for (int k = 0; k < postsLogic.getPosts().length; k++){
                        if(postsLogic.getPosts()[k]!=null && postsLogic.getPosts()[k].getMaBaiViet() == maId){
                            posts = postsLogic.getPosts()[k];
                            break;
                        }
                    }
                    if(posts != null){
                        break;
                    }
                    System.out.println("Không tồn tại mã bài viết, vui lòng thử lại");
                }while (true);

                System.out.println("Bài này gồm bao nhiêu kiểu: ");
                int postsNumber;
                do {
                    postsNumber = new Scanner(System.in).nextInt();
                    if (postsNumber < 1 || postsNumber > 5){
                        System.out.println("Số dương và nhỏ hơn 5 nhé, tham là đuổi đó");
                        continue;
                    }
                    break;
                }while (true);
                ReportingDetail reportingDetail = new ReportingDetail(posts, postsNumber);
                details[count] = reportingDetail;
                count++;
            }
            Reporting reporting = new Reporting(reporter, details);
            saveReporting(reporting);
        }
    }

    public void saveReporting(Reporting reporting){
        for(int i = 0; i < reportings.length; i++){
            if(reportings[i] == null){
                reportings[i] = reporting;
                break;
            }
        }
    }

    public void showReporting() {
        for (int i = 0; i < reportings.length; i++) {
            if (reportings[i] != null) {
                System.out.println(reportings[i]);
            }
        }
    }

    public void showReportingByName() {
        Reporting[] sortedReportings = reportings.clone();
        int n = sortedReportings.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sortedReportings[i] == null || sortedReportings[j] == null) {
                    continue;
                }
                String name1 = sortedReportings[i].getReporter().getName();
                String name2 = sortedReportings[j].getReporter().getName();
                if (name1.compareTo(name2) > 0) {
                    Reporting temp = sortedReportings[i];
                    sortedReportings[i] = sortedReportings[j];
                    sortedReportings[j] = temp;
                }
            }
        }
        for (int i = 0; i < sortedReportings.length; i++) {
            if (sortedReportings[i] != null) {
                System.out.println(sortedReportings[i]);
            }
        }
    }



    public void calculateSalary() {
        for(int i = 0; i < reportings.length; i++){
            Reporting reporting = reportings[i];
            if(reporting == null){
                continue;
            }
            Reporter reporter = reporting.getReporter();
            double salary = 0;
            ReportingDetail[] details = reporting.getDetails();
            for(int j = 0; j < details.length; j++){
                Posts posts = details[i].getPosts();
                salary += posts.getPrice() * details[i].getPostsNumber();
            }
            System.out.println("Tổng tiền của phóng viên : "+ reporter.getName() + " là "+salary);
        }
    }
}
