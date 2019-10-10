package HashMapTest;

public class Murka extends Cat {

    @Override
    void meow(){
        System.out.println("Murka Meow");
    }

    @Override
    public int hashCode() {
        return 12345;
    }
}
