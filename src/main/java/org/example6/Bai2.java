package org.example6;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        lietKeSo();
        lietKeSo2();
        arr();
        phanTuThuHai();
        trungBinhCong();
        doiXung();
        maTran();
        thuanNghichSauChuSo();
        soChinhPhuong();
        minMaxMaTran();
        tongCheo();
        mangKhongTrung();
    }


    //bài 1. Liệt kê số từ 7 chữ số đến 9 chữ só

    // lệnh gọi hàm bài 1
    public static void lietKeSo() {
        for (int i = 1000000; i <= 999999999; i++) {
            if (kiemTraThuanNghich(i)) {
                System.out.println(i);
            }
            if (kiemTra(i)) {
                System.out.println(i);
            }
            if(tinhTongChuSo(i) % 10 == 0){
                System.out.println(i);
            }

        }
    }
    // Bài 1 câu a: in toàn bộ số thuận nghích
    public static boolean kiemTraThuanNghich(int n) {
        String str = Integer.toString(n);
        String str2 = daoChuoi(str);
        return str.equals(str2);
    }

    public static String daoChuoi(String a) {
        StringBuilder dc = new StringBuilder(a);
        dc.reverse();
        return dc.toString();
    }

    //Bài 1.b In số chỉ chứa 0, 6, 8

    public static boolean kiemTra(int n) {
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '6' && str.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }
    // Bài 1.c Tổng chữ số chia hết cho 10

    public static int tinhTongChuSo(int n) {
        String str = Integer.toString(n);
        int tong = 0;
        for (int i = 0; i < str.length(); i++) {
            int chuSo = Character.getNumericValue(str.charAt(i));
            tong += chuSo;
        }
        return tong;
    }


    //Bài 2. chương trình xử lý số có 7 chữ số.

    public static void lietKeSo2() {
        for (int i = 1000000; i <= 9999999; i++){
            if(kiemTraSoNguyenTo(i)){
                System.out.println(i);
            }
            if(kiemTraTungKiTuLaSoNguyenTo(i)){
                System.out.println(i);
            }
            if(daoSoNguyenTo(i)){
                System.out.println(i);
            }
        }
    }
    //Bài 2a. kiểm tra số nguyên tố
    public static boolean kiemTraSoNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Bài 2b. Từng chữ số là số nguyên tố
    public static boolean kiemTraTungKiTuLaSoNguyenTo(int n) {
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int a = Character.getNumericValue(c);
            if (!kiemTraSoNguyenTo(a)) {
                return false;
            }
        }
        return true;
    }

    //Bài 2c. Đảo số đó cũng là số nguyên tố
    public static boolean daoSoNguyenTo(int n) {
        String str = Integer.toString(n);
        int a = Integer.parseInt(daoChuoi(str));
        if (kiemTraSoNguyenTo(a)) {
            System.out.println(a);
            return true;
        } else {
            return false;
        }
    }



    //Bài 3 . xử lý mảng.
    public static void arr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng mạng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        //duyệt mảng
        int count = 0;
        int b = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] == b) {
                count++;
            } else {
                if (count > 0) {
                    System.out.printf("Giá trị %d trùng lặp liên tiếp %d lần.\n", b, count + 1);
                    count = 0;
                }
                b = a[i];
            }
        }

        if (count > 0) {
            System.out.printf("Giá trị %d trùng lặp liên tiếp %d lần.\n", b, count + 1);
        } else {
            System.out.println("Không có giá trị trùng lặp liên tiếp.");
        }
    }

    //Bài 4. lấy phần tử lớn thứ 2
    public static void phanTuThuHai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng mạng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){
                if(a[i] < a[j]){
                    max = a[i];
                    a[i] = a[j];
                    a[j]= max;
                }
            }
        }
        int count = 1;
        for(int i = 1; i < n; i++){
            if(a[i] == a[0]){
                count+=1;
            }
        }

        int max1= a[0];
        if(count == n){
            System.out.println("Toàn bộ mảng bị trùng giá trị");
        }else{
            for(int i = 0; i < n; i++){
                if(a[i] != a[0]){
                    max1 = a[i];
                    break;
                }
            }
            System.out.println("Gia trị lớn thứ 2 trong mảng: " + max1);
        }

    }


    //Bài 5.
    public static void trungBinhCong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng mạng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        System.out.println("Nhập khoảng để xử lý: ");
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c =sc.nextInt();
        float sum = 0;
        for(int i = b; i <=c; i++){
            sum += a[i];
        }
        System.out.printf("Trung binh cộng đoạn trong mảng từ %d đến %d là %f", b, c, (sum / (c- b +1)));
    }

//bài 6. check mảng đối xứng

    public static void doiXung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng mạng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Mảng đối xứng.");
        } else {
            System.out.println("Mảng không đối xứng.");
        }
    }

    //Bài 7. Nhập lại khi nhập trùng
    public static void mangKhongTrung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        do {
            for (int i = 0; i < n; i++) {
                System.out.printf("arr[%d] = ", i);
                arr[i] = sc.nextInt();
            }
        } while (!kiemTraTrung(arr, n));
    }

    public static boolean kiemTraTrung(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //Bài 8. tính tích ma trận
    public static void maTran() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ma trận m1 = ");
        int m1 = sc.nextInt();
        System.out.print("Nhập ma trận n1 = ");
        int n1 = sc.nextInt();
        int[][] arr1 = new int[m1][n1];

        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }
        //in ma trận;
        for(int i = 0; i < m1; i++){
            for(int j = 0; j <n1; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.print("Nhập ma trận m2 = ");
        int m2 = sc.nextInt();
        System.out.print("Nhập ma trận n2 = ");
        int n2 = sc.nextInt();
        int[][] arr2 = new int[m2][n2];

        for(int i = 0; i < m2; i++){
            for(int j = 0; j < n2; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m2; i++){
            for(int j = 0; j <n2; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        //Nhân 2 ma trận
        int[][] arr3 = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        //Hiển thị ma trận.
        System.out.println("Ma trận tích C: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

    //Bài 9. E sử dụng các hàm kiểm tra thuân nghịch, nếu đúng thì
    //  sử dụng thêm tính tổng các chữ số đã viết tại Bài 1.
    public static void thuanNghichSauChuSo() {
        for(int i = 100000; i <= 9999999; i++){
            if(kiemTraThuanNghich(i)){
                if(tinhTongChuSo(i) % 10 ==0){
                    System.out.println(i);
                }
            }
        }
    }


    //Bài 10. Số chính phương.
    public static void soChinhPhuong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số bắt đầu: ");
        int a = sc.nextInt();
        System.out.print("Nhập số kết thúc: ");
        int b = sc.nextInt();
        for(int i = a; i <=b; i++){
            if(kiemTraChinhPhuong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean kiemTraChinhPhuong(int n) {
        if(Math.sqrt(n) != (int) Math.sqrt(n)){
            return false;
        }
        return true;
    }


    //Bài 11. tìm max min trong ma trận
    public static void minMaxMaTran() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j] ;
                }
            }
        }

        System.out.println("Giá trị lớn nhất trong ma tran: " + max);
        System.out.println("Giá trị nhỏ nhất trong ma tran: " + min);


    }


    //Bài 12. tổng đường chéo ma trận
    public static void tongCheo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("tổng chéo: " + sum);



    }
}
