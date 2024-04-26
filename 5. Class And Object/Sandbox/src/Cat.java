public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("МЯУ МЯУ");
    }
}
