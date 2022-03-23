package data;

class Laptop {

    String Nama, Brand, Nama_Processor, Sistem_Operasi, Jenis_storage;
    int Jumlah_core, RAM, Stok;

    public Laptop (String Nama, String Brand, String Nama_Processor, String Sistem_Operasi, String Jenis_storage, int Jumlah_core, int RAM, int Stok){
        this.Nama = Nama;
        this.Brand = Brand;
        this.Nama_Processor = Nama_Processor;
        this.Sistem_Operasi = Sistem_Operasi;
        this.Jenis_storage = Jenis_storage;
        this.Jumlah_core = Jumlah_core;
        this.RAM = RAM;
        this.Stok = Stok;
    }

    public void info(){
        System.out.println("Nama : "+Nama);
        System.out.println("Nama Brand: "+Brand);
        System.out.println("Nama Processor: "+Nama_Processor);
        System.out.println("Sistem Operasi: "+Sistem_Operasi);
        System.out.println("Jenis Storage: "+Jenis_storage);
        System.out.println("Jumlah Core: "+Jumlah_core);
        System.out.println("RAM: "+RAM);
        System.out.println("Stok: "+Stok);

        //overloading pada constructor nama
        Nama nama1 = new Nama("Putri");
        Nama nama2 = new Nama();

        nama1.show();
        nama2.show();

        Brand brand1 = new Brand("Acceer");
        Brand brand2 = new Brand();

        brand1.show();
        brand2.show();

        Nama_Processor processor1 = new Nama_Processor("yhjgj");
        Nama_Processor processor2 = new Nama_Processor();

        processor1.show();
        processor2.show();

        Sistem_Operasi sistem_operasi1 = new Sistem_Operasi("windows");
        Sistem_Operasi sistem_operasi2 = new Sistem_Operasi();

        sistem_operasi1.show();
        sistem_operasi2.show();

        Jenis_storage storage1 = new Jenis_storage("");
        Jenis_storage storage2 = new Jenis_storage("");

        storage1.show();
        storage2.show();

        Jumlah_core core1 = new Jumlah_core();
        Jumlah_core core2 = new Jumlah_core();

        core1.show();
        core2.show();

        RAM ram1 = new RAM();
        RAM ram2 = new RAM();

        ram1.show();
        ram2.show();

        
    }
}
