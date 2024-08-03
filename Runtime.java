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

public class Runtime {
    // Method to display the work of an employee
    static void display(Emp e) {
        e.work();
    }

    public static void main(String[] args) {
        Developer dev = new Developer();
        Tester tester = new Tester();

        display(dev); // Output: Developing app
        display(tester); // Output: Testing app
    }
}
