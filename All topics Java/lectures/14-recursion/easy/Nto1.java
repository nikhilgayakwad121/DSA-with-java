public class Nto1 {
    public static void main(String[] args) {
        concept (5);
    }

    // concept
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);  // it will always pass n value then subtract
          concept(--n);    //  it will reduce the value then pass
//        n-- vs --n
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
