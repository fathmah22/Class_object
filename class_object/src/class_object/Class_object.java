package class_object;

//membuat class digunakan sebagai template
class biodata{
    String Nama;
    String TTL;
    int Umur;
    String Alamat;
    String Sekolah;
    String Keahlian;
    String Kelas;
}

public class Class_object {
    
   public static void main(String[] args) throws Exception{
       
       //instansiasi / membuat object
       biodata bio = new biodata();
       bio.Nama = "Fathmah Fadhilatus Sholikhatul Qoyyimah";
       bio.TTL = "PAsuruan, 22 Maret 2005";
       bio.Umur = 16;
       bio.Alamat = "Tejowangi, Purwosari";
       bio.Sekolah = "SMK Negeri 1 PURWOSARI";
       bio.Keahlian = "Rekayasa Perangkat Lunak (RPL)";
       bio.Kelas = "XI";
       
       //keluaran
       System.out.println("BIODATA SISWA");
       System.out.println("Nama : " +(bio.Nama));
       System.out.println("Tempat Tanggal Lahir : " +(bio.TTL));
       System.out.println("Umur : " +(bio.Umur));
       System.out.println("Alamat : " +(bio.Alamat));
       System.out.println("Sekolah : " +(bio.Sekolah));
       System.out.println("Keahlian : " +(bio.Keahlian));
       System.out.println("Kelas : " +(bio.Kelas));
   }
}