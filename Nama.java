package data;

public class Nama {
    private String nama;
    private static int jumlahnama;

    //overloading constructor
    //opsi 1:
    Nama(String nama){
        Nama.jumlahnama++;
        this.nama = nama;
    }

    //opsi 2:
    Nama(){
        Nama.jumlahnama++;
        this.nama = "Nama" + Nama.jumlahnama;
    }
    void show(){
        System.out.println("Nama : "+this.nama);
    }
}
