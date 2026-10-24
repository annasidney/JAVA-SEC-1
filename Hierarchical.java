
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish is swimming");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Fish f = new Fish();

        d.eat();
        d.bark();

        c.eat();
        c.meow();

        f.eat();
        f.swim();
    }
}
