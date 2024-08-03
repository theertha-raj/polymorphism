package polymorphism;

class Emp {
    void work() {
        System.out.println("working");
    }
}

class Developer extends Emp {
    @Override
    void work() {
        System.out.println("Developing app");
    }
}

class Tester extends Emp {
    @Override
    void work() {
        System.out.println("Testing app");
    }
}

public class spempy {
    public static void main(String[] args) {
        Emp e = new Developer();
        e.work();
        Emp e1 = new Tester();
        e1.work();
    }
}
