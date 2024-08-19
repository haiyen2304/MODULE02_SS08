package ThucHanh01;

public class main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Pig");
        Dog dog1=new Dog("Becgie","black");
        Dog dog2=new Dog("Pug","White");
        Cat cat=new Cat("Dora");

        System.out.println("Animal1 : "+ animal1.getName());
        animal1.setName("CHIken");
        System.out.println("sau khi thay ten : "+ animal1.getName());

        dog1.setName("aaaaaaaaaa");
        System.out.println("name : "+ dog1.getName());
        System.out.println("sound : "+dog1.makeSound());

    }
}
