public class Manager {
    String name;
    String company;

    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    Manager(String name){
        this(name, null);
    }

    Manager(){
        this(null);
    }

    public void sayHello(String name) throws Exception{
        System.out.println("Hello "+ name+" My Manager name is "+this.name);
    }
    int getSalary(){
        return 100000;
    }
}    
