package Strivers_Basic_Recursion_Sheet;
//Iterative way

class Iterative_way {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}

class  By_formula{
    public static void main(String[] args) {
            int n = 5;
            int sum = (n*(n+1))/2;
            System.out.println(sum);
    }
}

class _5_Sum_First_n_natural_Number_By_parametrized {

    static void func(int i ,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }

        func(i-1, sum+i);

    }

    public static void main(String[] args) {

        int n =3;
        func(n, 0);


    }
}

class Funtional_way{

    static int func(int n){

        if(n==0){
            return 0;
        }
        // Problem broken down into 2 parts and then combined.

        return n + func(n-1);
    }


    public static void main(String[] args) {

        int n = 3;

        System.out.println(func(n));
    }
}