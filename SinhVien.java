import com.sun.tools.javac.Main;

public class SinhVien{
    private String name ;
    private String age;
    private String address;
    private String lop;
    private float Diem;
    public SinhVien(){}
    public SinhVien( String name, String age,String addess, String lop, float Diem){
        this.name = name;
        this.age= age;
        this.address= addess;
        this.lop=lop;
        this.Diem= Diem;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddess(){
        return address;
    }
    public String getLop(){
        return lop;
    }
    public float getDiem(){
        return Diem;
    }
    public void setName(String name){
        this.name= name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddess(String addess) {
        this.address = addess;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Age : "+age+" Addess : "+address+" Lop : "+ lop +" Diem :"+Diem;
    }
}

