package data;

public class Nama_Processor {
    private String processor;
    private static int jumlah_processor;

    //overloading processor
    //opsi 1:
    Nama_Processor(String processor){
        Nama_Processor.jumlah_processor++;
        this.processor = processor;
    }

    //opsi 2:
    Nama_Processor(){
        Nama_Processor.jumlah_processor++;
        this.processor = "Processor" + Nama_Processor.jumlah_processor;
    }
    void show(){
        System.out.println("Nama Processor : "+this.processor);
    }
}
