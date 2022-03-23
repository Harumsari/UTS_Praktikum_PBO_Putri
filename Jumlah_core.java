package data;

public class Jumlah_core {
    private String core;
    private static int jumlahcore;

    //overloading constructor
    //opsi 1:
    Jumlah_core(String core){
        Jumlah_core.jumlahcore++;
        this.core = core;
    }

    //opsi 2:
    Jumlah_core(){
        Jumlah_core.jumlahcore++;
        this.core = "core" + Jumlah_core.jumlahcore;
    }
    void show(){
        System.out.println("Jumlah core : "+this.core);
    }
}
