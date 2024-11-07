import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        int jumlahMahasiswa = 10;
        Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i< nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir ke-" + (i + 0) +" : ");
        nilaiAkhir[i] = scanner.nextInt();
    }
        System.out.println("\nDaftar Mahasiswa yang lulus:");
    for (int i = 0; i< nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + (i + 0) + " lulus dengan nilai: " + nilaiAkhir[i]);
        } else {
            System.out.println("Mahasiswa ke-" + (i + 0) + " tidak lulus dengan nilai: " + nilaiAkhir[i]);
        }
    }
    scanner.close();
    }
}
