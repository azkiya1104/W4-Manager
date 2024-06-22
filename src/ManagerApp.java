  public class ManagerApp {
    public static void main (String[] args) throws Exception {
        Manager manager = new Manager("Azkiya", "google");
        manager.sayHello("Azkiya");
       
        System.out.println(manager.getSalary());

        VicePresident vp = new VicePresident("Azkiya", "google");
        vp.sayHello("Azkiya");

        System.out.println(vp.getSalary());
         System.out.println(vp.getParentSalary());
    }
    
}
