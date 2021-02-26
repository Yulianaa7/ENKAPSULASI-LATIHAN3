package testsiswa;

/**
 *
 * @author Yuliana
 */
public class TestSiswa {

    public static void main(String[] args) {
        //membuat object siswa dari class EncapSiswa
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian"); 
        siswa.setAbsen(23); 
        siswa.setAddress("Malang");
        
        //untuk menampilkan output
        System.out.print("Name : "+siswa.getName() + " Absen : " + siswa.getAbsen() + " Address : " + siswa.getAddress());
    }
    
}
