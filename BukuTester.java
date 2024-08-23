//Driver Class
import java.util.Scanner;

public class BukuTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan judul Buku: ");
        String judul = in.nextLine();
        System.out.println("Inputkan Pengarang Buku: ");
        String pengarang = in.nextLine();
        System.out.println("Inputkan ID Buku: ");
        int id = in.nextInt();
        System.out.println("Inputkan tahunTerbit Buku: ");
        int tahunTerbit = in.nextInt();  
        Buku Fahri = new Buku(judul, id, pengarang, tahunTerbit);
        System.out.println("Fahri buku : ");
        System.out.println("Judul = "+Fahri.Judul);
        System.out.println("id = "+Fahri.id);
        System.out.println("Pengarang = "+Fahri.Pengarang);
        System.out.println("Tahun Terbit = "+Fahri.TahunTerbit);


        //object 
        Buku Calista = new Buku("cinta 5", 456, "misyel", 2009);
        System.out.println("Calista buku : ");
        System.out.println("Judul = "+Calista.Judul);
        System.out.println("id = "+Calista.id);
        System.out.println("Pengarang = "+Calista.Pengarang);
        System.out.println("Tahun Terbit = "+Calista.TahunTerbit);
        Buku Aline = new Buku("hujan", 7689, "liye", 2008);
        System.out.println("Aline buku : ");
        System.out.println("Judul = "+Aline.Judul);
        System.out.println("id = "+Aline.id);
        System.out.println("Pengarang = "+Aline.Pengarang);
        System.out.println("Tahun Terbit = "+Aline.TahunTerbit);
        Buku Chriss = new Buku("skibidi", 555, "caca", 2007);
        System.out.println("Chriss buku : ");
        System.out.println("Judul = "+Chriss.Judul);
        System.out.println("id = "+Chriss.id);
        System.out.println("Pengarang = "+Chriss.Pengarang);
        System.out.println("Tahun Terbit = "+Chriss.TahunTerbit);
        Buku Abi = new Buku("sigma", 200, "lisa", 2001);
        System.out.println("Abi buku : ");
        System.out.println("Judul = "+Abi.Judul);
        System.out.println("id = "+Abi.id);
        System.out.println("Pengarang = "+Abi.Pengarang);
        System.out.println("Tahun Terbit = "+Abi.TahunTerbit);
        Buku Andi = new Buku("jatuh", 779, "bella", 2030);
        System.out.println("Andi buku : ");
        System.out.println("Judul = "+Andi.Judul);  
        System.out.println("id = "+Andi.id);
        System.out.println("Pengarang = "+Andi.Pengarang);
        System.out.println("Tahun Terbit = "+Andi.TahunTerbit);
       
        
    }

    
}
