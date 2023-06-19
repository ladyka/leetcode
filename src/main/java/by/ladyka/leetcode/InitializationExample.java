package by.ladyka.leetcode;

public class InitializationExample {
    static {
        System.out.println("{2}");
    }

    static {
        System.out.println("{4}");
    }

    {
        System.out.println("{1}");
    }

    {
        System.out.println("{3}");
    }
    // NO !!! private static final InitializationExample = new InitializationExample();

    public static void main(String[] args) {
        System.out.println("main()");
        new InitializationExample();
    }
}
