package testsiswa;

/**
 *
 * @author Yuliana
 */
public class EncapSiswa {
    //mendeklarasikan variable dengan akses modifier private
    private String name;
    private String address;
    private int absen;
    
    //method nonvoid getAbsen
    public int getAbsen(){
        return absen;
    }
    
    //method nonvoid getName
    public String getName(){
        return name;
    }
    
    //method nonvoid getAddres
    public String getAddress(){
        return address;
    }
    
    //method void setAbsen
    public void setAbsen(int newAbsen){
        absen = newAbsen;
    }
    
    //method void setName
    public void setName(String newName){
        name = newName;
    }
    
    //method void getAddress
    public void setAddress(String newAddress){
        address = newAddress;
    }
}