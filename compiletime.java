package polymorphism;

class Student1 {
    public void display() {
        String name = "Vidya";
        System.out.println("Name:" + name);
    }
}

class Student2 extends Student1 {
    public void display() {
        String name = "MS";
        System.out.println("Name:" + name);
    }
}

public class compiletime {
    public static void main(String[] args) {
        Student1 stus = new Student1();
        stus.display();
        Student2 stu = new Student2();
        stu.display();
    }
}
