import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i< 10; i++) {
        System.out.println("Masukkan akhir nilai ke-" + (i + 1) +": ");
        nilaiAkhir[i] = scanner.nextInt();
    }
        System.out.println("Nilai yang dimasukkan:");
    for (int i = 0; i< 10; i++) {
        System.out.println("Nilai ke-" + (i + 1) + ": "+nilaiAkhir[i]);
    }
    scanner.close();
    }
}
