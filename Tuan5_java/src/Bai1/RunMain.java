package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n : ");
        n = sc.nextInt();
        ArrayList<DieuHoa> dieuHoaArrayList = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin dieu hoa thu " + (i+1) +" : ");
            DieuHoa dieuHoa = new DieuHoa();
            dieuHoa.Nhap();
            dieuHoaArrayList.add(dieuHoa);
        }
        System.out.println("Danh sach thong tin cac dieu hoa vua nhap :");
        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Thong tin dieu hoa thu " + (i+1) +" : ");
            System.out.println();
            dieuHoaArrayList.get(i).Xuat();
        }
        System.out.println("ten cac mat hang cua hang san xuat Elextrolux la : ");
        for (int i=0;i<n;i++){
            if(dieuHoaArrayList.get(i).getTenHSX().compareToIgnoreCase("Elextrolux")==0){
                dieuHoaArrayList.get(i).Xuat();
            }
        }

        DieuHoa dieuHoaMin = dieuHoaArrayList.get(0);
        for (int i=0;i<n;i++){
            if(dieuHoaMin.getGiaban()> dieuHoaArrayList.get(i).getGiaban()){
                dieuHoaMin = dieuHoaArrayList.get(i);
            }
        }
        System.out.println("Cac san pham co gia thap nhat la : ");
        for (int i=0;i<n;i++){
            if (dieuHoaMin.getGiaban() == dieuHoaArrayList.get(i).getGiaban()){
                System.out.println();
                System.out.println("Dieu hoa thu " + (i+1) +" : ");
                System.out.println();
                dieuHoaArrayList.get(i).Xuat();
            }
        }
    }
}
