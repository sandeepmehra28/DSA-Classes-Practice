package Exam_Prep;
class employees{
    private int id;
    private  String name;

    public void setId(int id){
        this.id  = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
public class encapsulation_oops {
    static void main() {
        employees e = new employees();
        e.setId(001);
        e.setName("sandeep");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
