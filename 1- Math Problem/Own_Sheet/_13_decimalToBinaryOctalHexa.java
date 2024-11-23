package Own_Sheet;

public class _13_decimalToBinaryOctalHexa {

    public static void main(String[] args) {
        int dec = 64556;
        String binary = decTobin(dec);
        String octal  = decToOct(dec);
        String hexadecimal = decTohex(dec);
    }



    private static String decTobin(int dec) {

        String bin ="";
        do{
            int ld= dec%2;
            bin = ld + bin;
            dec=dec/2;

        }while(dec!=0);

        return bin;
    }

    private static String decToOct(int dec) {

        String oct = "";
        do{
            int ld = dec%10;
            oct = ld +oct;
            dec = dec/8;

        }while(dec!=0);

        return oct;
    }

    private static String decTohex(int dec) {

        String hex = "";
        do{
            int ld = dec % 16;
            if(ld<10){
                System.out.println();
            }
            else
                hex = (char)(ld+55) +hex;
                dec=dec/16;  
        }while(dec!=0);
        
        return hex;
    }
}
