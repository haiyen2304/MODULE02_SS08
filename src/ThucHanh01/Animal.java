package ThucHanh01;

public class Animal {
    private String name;
    public Animal(){
    }
    public  Animal(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String makeSound(){
        return "";
    }
}

