package ClassesandObjects;

public class CreatingObjects {
    public static void main(String[] args){
    }
    public void test() {
        System.out.println("Hi");
    }
}

class B {
    public static void main(String args[ ]) {
        CreatingObjects  obj = new CreatingObjects();
        obj.test();
    }

}
