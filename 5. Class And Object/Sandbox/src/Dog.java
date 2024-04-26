public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("ГАВ ГАВ ГАВ");
    }
}
