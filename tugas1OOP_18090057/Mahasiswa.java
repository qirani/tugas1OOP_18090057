public class Mahasiswa{
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(final String nama, final String nim, final String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;

    }
    
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public String info(){
        return "Nama : "+nama + "\n"+
        "Nim : "+nim +"\n"+
        "Kelas : "+kelas +"\n"; 
    }
}