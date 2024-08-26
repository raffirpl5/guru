package guru;
import java.util.Scanner;
public class GuruTester {
    //constructor
    public static void main(String[] args) {
        //String-->int-->double
        Scanner input = new Scanner (System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String id = input.nextLine();
        System.out.println("Status: ");
        String Status = input.nextLine();
        System.out.println("NIP: ");
        int nip = input.nextInt();
        input.close();

        KelasGuru guru = new KelasGuru(nip, nama, nama, Status);

       KelasGuru buPasha = new KelasGuru(2024, "Pasha", "erpeel", "tetap");
       KelasGuru pakT = new KelasGuru(1945, " T", "Olahraga", "tetap");
       KelasGuru  buAul = new KelasGuru(2025, "Aul", "erpeel", "tetap");
       KelasGuru pakFirman = new KelasGuru(2232, "Firman", "BK", "tetap");
       KelasGuru pakTulus = new KelasGuru(2222, "Tulus", "IPAS", "tetap");;

        System.out.println("------------");
        guru.print();
        System.out.println("------------");
        buPasha.print();
        System.out.println("------------");
        pakT.print();
        System.out.println("------------");
        buAul.print();
        System.out.println("------------");
        pakFirman.print();

      

    }
}
