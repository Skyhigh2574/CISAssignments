class Animal {
    String species;
    String sound;

    public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public void makesound() {
        System.out.println(" the " + species + " makes a sound " + sound);
    }
}
class Car{
        String make;
        int year;
        public Car(String make,int year){
            this.make=make;
            this.year=year;
        }
        public void engine(){
            System.out.println(" belongs to "+make+" year "+year);
        }

}
class person{
        String name;
        int age;
        public person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void details(){
            System.out.println(" name "+name+" age "+age);
        }
}
class employee{
    String role;
    int salary;
    public employee(String role,int salary)

    {
        this.role = role;
        this.salary = salary;
    }
    public void detail(){
        System.out.println(" role "+role+" salary "+salary);
    }
        }
public class Assign8 {
    public static void main(String[] args){

        Animal a =new Animal("dog","bow");
        a.makesound();
        Car b=new Car("ford",2021);
        b.engine();
        person c=new person("mike",20);
        c.details();
        employee d = new employee("manage",1000);
        d.detail();
    }
}