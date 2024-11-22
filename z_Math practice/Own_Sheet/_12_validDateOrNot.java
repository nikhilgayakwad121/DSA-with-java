package Own_Sheet;

public class _12_validDateOrNot {

    public static void main(String[] args) {
        int dd = 17;
        int mm = 07;
        int yy = 2000;

        if(dd<1 ||dd>31 ||mm < 1||mm>12 ||yy<1)
            System.out.println("invalid");
        else if (mm==4||mm==6||mm==9||mm==11&& dd>30)
            System.out.println("invalid");
        else if(mm==2&&dd>29)
            System.out.println();
        else if(mm==2 &&(yy%400==0 || yy % 4 ==0 && yy%100!=0)==false && dd>28)
            System.out.println("invalid");
        else
            System.out.println("valid");
        }
    }

