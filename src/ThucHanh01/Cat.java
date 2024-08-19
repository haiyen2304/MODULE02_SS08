package ThucHanh01;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public String makeSound() {
        return super.makeSound()+"meo meo";
    }
}
