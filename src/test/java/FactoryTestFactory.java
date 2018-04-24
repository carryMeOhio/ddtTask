import org.testng.annotations.Factory;

public class FactoryTestFactory {

    @Factory
    public Object[] FactoryMethod() {
        return new Object[] {new FactoryTest(1, 2,3),
            new FactoryTest(5,6,11)};
    }
}
