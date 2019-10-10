package HashMapTest;

public class Boris extends Cat {

    @Override
    void meow(){
        System.out.println("Boris Meow");
    }

    @Override
    public int hashCode() {
        return 12345;
    }
}
