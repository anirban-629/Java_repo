class employee{
    private int id;
    private String name;
    private String code;

    public void setId(int n) {this.id=n;}
    public void setName(String n) {this.name=n;}
    public void setCode(String n){this.code=n;}

    public int getId(){return id;}
    public String getName(){return name;}
    public String getCode(){return code;}

    // Constructor
    public employee(){
        this.id=1000;
        this.name="ABCDEFGH";
        this.code="123456";
    }
    
    // Constructor overloading
    public employee(int id, String name, String code){
        this.id=id;
        this.name=name;
        this.code=code;
    }
}
public class _02Constructur {
    public static void main(String[] args) {

        // employee e1=new employee();

        employee e1=new employee(100,"ANIRBAN MISHRA","A!B@C#D$");

        // e1.setId(100213);
        // e1.setName("Anirban Mishra");
        // e1.setCode("asd123");

        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getCode());
    }
}
