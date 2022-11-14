import java.util.Random;
import java.util.Scanner;

public class jawabanUTS {
    int JumMahasiswaBaruPoltek = 3; //TI,DKV,TK
    static int totalJumlahPenerimaanMahasiswaBaruPoltek = 1050;
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TK = new String[250];

    public static void PrintInfoPenerimaanMahasisawaBaru(){
        int totalTI=0;
        int totalSisaKursi=0;
        for(int index=0;index<TI.length;index++){
            if(TI[index] !=null){
                totalTI++;
            }
        }
        int totalDKV=0;
        for(int index=0;index<DKV.length;index++){
            if(DKV[index] !=null){
                totalDKV++;
            }
        }
        int totalTK=0;
        for(int index=0;index<TK.length;index++){
            if(TK[index] !=null){
                totalTK++;
            }
        }
        totalSisaKursi = totalJumlahPenerimaanMahasiswaBaruPoltek - totalTI - totalDKV - totalTK;
        System.out.println("Total PenerimaanMahasiswaBaruPoltek TI: " + totalTI + " | Total PenerimaanMahasiswaBaruPoltek DKV: " + totalDKV + " | Total PenerimaanMahasiswaBaruPoltek TK: " + totalTK);
        System.out.println("Jumlah Seluruh Pe:"+ totalJumlahPenerimaanMahasiswaBaruPoltek +" | Total sisa kursi:"+totalSisaKursi);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String PenerimaanMahasiswaBaruPoltek){
        int indexNow = 0;
        for(int index=0; index<myArray.length;index++){
            if(myArray[index] !=null){
                indexNow = index+1;
            }
        }

        if(indexNow < myArray.length){
            myArray[indexNow] = PenerimaanMahasiswaBaruPoltek;
        }
    }
    public static void simpanPenerimaanMahasiswaBaruPoltek(int angkaRandom, String PenerimaanMahasiswaBaruPoltek){
        switch (angkaRandom){
            case 1:
                CheckIndexArray(TI,PenerimaanMahasiswaBaruPoltek);
                System.out.println("Anda berhasil menjadi mahasiswa baru TI");
                PrintInfoPenerimaanMahasisawaBaru();
                break;
            case 2:
                CheckIndexArray(DKV,PenerimaanMahasiswaBaruPoltek);
                System.out.println("Anda berhasil menjadi mahasiswa baru DKV");
                PrintInfoPenerimaanMahasisawaBaru();
                break;
            case 3:
                CheckIndexArray(TK,PenerimaanMahasiswaBaruPoltek);
                System.out.println("Anda berhasil menjadi mahasiswa baru TK");
                PrintInfoPenerimaanMahasisawaBaru();
                break;
        }
    }
    public static void inputPenerimaanMahasiswaBaruPoltek(){
        Scanner inputData = new Scanner(System.in);
        while(true){
            System.out.println("Nama PenerimaanMahasiswaBaruPoltek =");
            String namaPenerimaanMahasiswaBaruPoltek = inputData.nextLine();
            if(namaPenerimaanMahasiswaBaruPoltek.isBlank()){
                System.out.println("Nama PenerimaanMahasiswaBaruPoltek wajib diisi");
                inputPenerimaanMahasiswaBaruPoltek();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanPenerimaanMahasiswaBaruPoltek(JenisRandom,namaPenerimaanMahasiswaBaruPoltek);

            }
        }
    }
    public static void main(String[] args){
        inputPenerimaanMahasiswaBaruPoltek();
    }
}
