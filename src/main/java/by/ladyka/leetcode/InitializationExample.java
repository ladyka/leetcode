package by.ladyka.leetcode;

public class InitializationExample {
    static {
        System.out.println("{2}");
    }

    private String indicator = "Original {7}";
    private static final InitializationExample initializationExample = new InitializationExample(" field {5}");

    {
        System.out.println("{1} " + indicator);
    }

    static {
        System.out.println("{4}" + initializationExample.indicator);
    }


    {
        System.out.println("{3} " + indicator);
    }

    public InitializationExample(String indicator) {
        System.out.println("InitializationExample.constructor " + indicator);
        this.indicator = indicator;
    }

    public static void main(String[] args) {
        System.out.println("main()");
        new InitializationExample(" psvm {6}");
    }
}
