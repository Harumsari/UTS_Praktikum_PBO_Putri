package data;

public class Brand {
    private String brand;
    private static int nama_brand;

    //overloading constructor
    //opsi 1:
    Brand(String brand){
        Brand.nama_brand++;
        this.brand = brand;
    }

    //opsi 2:
    Brand(){
        Brand.nama_brand++;
        this.brand = "Brand" + Brand.nama_brand;
    }
    void show(){
        System.out.println("Brand : "+this.brand);
    }
}
