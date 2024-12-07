

class middleValuebetweenthreeValue{
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 11;
        int n3 = 31;
        if(n1>n2&&n1<n3||n1<n2&&n1>n3){
            System.out.println(n1+" is middle");
        }
        else if(n2>n1&&n2<n3||n2<n1&&n2>n3) {
            System.out.println(n2 + " is middle");
        }
        else{
            System.out.println(n3+" is middle");
        }
    }
}