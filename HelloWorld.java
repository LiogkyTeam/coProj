public class HelloWorld {
    private int field;

    public int getField() {
        return field;
    }

    public HelloWorld(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "field=" + field +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int a = Integer.parseInt("123");
        HelloWorld hell = new HelloWorld(3);
        System.out.println(hell);
    }
}
