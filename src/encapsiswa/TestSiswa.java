
package encapsiswa;

public class TestSiswa {
    public static void main(String[] args) {
        // TODO code application logic here
    Encapsiswa siswa = new Encapsiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");

}
}
