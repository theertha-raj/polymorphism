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

public class generalization {
    public static void main(String[] args) {
        Emp e;
        e = new Developer();
        e.work();

        e = new Tester();
        e.work();
    }
}
