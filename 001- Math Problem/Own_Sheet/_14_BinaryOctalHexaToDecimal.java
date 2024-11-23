package Own_Sheet;

import org.w3c.dom.ls.LSOutput;

public class _14_BinaryOctalHexaToDecimal {

    public static void main(String[] args) {
        int binary = 1000;
        int octal = 90;

        System.out.println("binary to decimal: "+ binToDecimal(binary));

        System.out.println("octal to decimal: "+ octToDecimal(octal));
    }

    private static int octToDecimal(int bin) {
        int dec = 0, pw =1;
        do{
            int ld = bin%10;
            dec = dec + ld * pw;
            pw = pw*2;
            bin = bin/10;

        }while(bin!=0);

        return dec;
    }

    private static int binToDecimal(int oct) {

        int dec = 0, pw =1;
        do{
            int ld = oct%10;
            dec = dec + ld * pw;
            pw = pw*8;
            oct = oct/10;

        }while(oct!=0);

        return dec;
    }


}
