public class VicePresident extends Manager {
    String name;

    VicePresident(String name, String company){
    super(name, null);
    
    }

    VicePresident(){
        super(null);
    }
    public void sayHello(String name) throws Exception{
        System.out.println("Hello "+ name+" My VicePresident name is "+this.name);
    }
    int getSalary(){
        return 200000;
    }
    int getParentSalary (){
        return super.getSalary();
    }
}

