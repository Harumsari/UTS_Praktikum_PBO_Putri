package data;

public class Sistem_Operasi {
    private String sistemoperasi;
    private static int jumlahsistemoperasi;

    //overloading constructor
    //opsi 1:
    Sistem_Operasi(String sistemoperasi){
        Sistem_Operasi.jumlahsistemoperasi++;
        this.sistemoperasi = sistemoperasi;
    }

    //opsi 2:
    Sistem_Operasi(){
        Sistem_Operasi.jumlahsistemoperasi++;
        this.sistemoperasi = "Sistem Operasi" + Sistem_Operasi.jumlahsistemoperasi;
    }
    void show(){
        System.out.println("Sistem Operasi : "+this.sistemoperasi);
    }
}
