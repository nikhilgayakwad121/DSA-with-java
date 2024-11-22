package Own_Sheet;

public class _16_swap_two_var {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("Before "+ "a = "+ a + "  &  b = "+ b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After "+ "a = "+ a + "  &  b = "+ b);

    }


}
