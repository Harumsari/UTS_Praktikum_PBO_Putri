package data;

public class RAM {
    private String ram;
    private static int jumlahram;

    //overloading constructor
    //opsi 1:
    RAM(String ram){
        RAM.jumlahram++;
        this.ram = ram;
    }

    //opsi 2:
    RAM(){
        RAM.jumlahram++;
        this.ram = "RAM" + RAM.jumlahram;
    }
    void show(){
        System.out.println("RAM : "+this.ram);
    }
}
