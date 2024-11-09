import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String namaMataKuliah;
    int sks;
    int nilai;
    int bobot;
    String hurufMutu;

    public MataKuliah(String namaMataKuliah, int sks, int nilai, int bobot) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilai = nilai;
        this.bobot = bobot;
        this.hurufMutu = tentukanHurufMutu(nilai);
    }
    private String tentukanHurufMutu(int nilai) {
        if (nilai > 100) {
            return "A+";
        } else if (nilai >= 90) {
            return "A";
        } else if (nilai >= 85) {
            return "A-";
        } else if (nilai >= 80) {
            return "B+";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 70) {
            return "B-";
        } else {
            return "C";
        }
    }
}

public class InputNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner aril = new Scanner(System.in);
        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMahasiswa = aril.nextLine();

        System.out.print("Masukkan Semester: ");
        String semester = aril.nextLine();

        String input;
        do {
            System.out.print("Masukkan Nama Mata Kuliah (atau ketik 'selesai' untuk mengakhiri): ");
            input = aril.nextLine();
            if (!input.equalsIgnoreCase("selesai")) {
                System.out.print("Masukkan SKS: ");
                int sks = aril.nextInt();
                System.out.print("Masukkan Nilai: ");
                int nilai = aril.nextInt();
                System.out.print("Masukkan Bobot: ");
                int bobot = aril.nextInt();
                aril.nextLine(); 
                mataKuliahList.add(new MataKuliah(input, sks, nilai, bobot));
            }
        } while (!input.equalsIgnoreCase("selesai"));

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("Semester: " + semester);
        System.out.println("Mata Kuliah yang diambil:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("No\tNama Mata Kuliah\tSKS\tNilai\tBobot\tHuruf Mutu");
        System.out.println("---------------------------------------------------------------------");
        
        for (int i = 0; i < mataKuliahList.size(); i++) {
            MataKuliah mk = mataKuliahList.get(i);
            System.out.printf("%-7d %-25s %-5d %-6d %-5d %10s\n", 
            i + 1, mk.namaMataKuliah, mk.sks, mk.nilai, mk.bobot, mk.hurufMutu);
    }
        aril.close();
    }
}