import java.util.Scanner;
public class GajiDanLembur {
    public static void main(String[] args) {
        Scanner aril = new Scanner(System.in);
        
        System.out.println("MASUKKAN GAJI POKOK:");
        double gajiPokok = aril.nextDouble();
        
        System.out.println("MASUKKAN JAM LEMBUR:");
        int jamLembur = aril.nextInt();
        
        int upahLemburPerjam = (int)(gajiPokok / 173);
        double totalGaji = gajiPokok;
        
        if (jamLembur > 4){
            int jamKelebihan = jamLembur - 4;
            totalGaji += (4 * upahLemburPerjam) + (jamKelebihan * 2 * upahLemburPerjam);
            } else {
                totalGaji += (jamLembur * upahLemburPerjam);
            }   
          System.out.println("TOTAL GAJI:" + (int) totalGaji);
        
        aril.close();
    }
}

    

