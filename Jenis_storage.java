package data;

public class Jenis_storage {
    private String storage;
    private static int jumlahstorage;

    //overloading constructor
    //opsi 1:
    Jenis_storage(String storage){
        Jenis_storage.jumlahstorage++;
        this.storage = storage;
    }

    //opsi 2:
    Jenis_storage(){
        Jenis_storage.jumlahstorage++;
        this.storage = "Storage" + Jenis_storage.jumlahstorage;
    }
    void show(){
        System.out.println("Jenis Storage : "+this.storage);
    }
}
