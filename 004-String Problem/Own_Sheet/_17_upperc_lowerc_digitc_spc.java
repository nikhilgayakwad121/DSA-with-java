package Own_Sheet;

public class _17_upperc_lowerc_digitc_spc {
    public static void main(String[] args) {

        String str = "my name is Nikhil Gayakwad";
        int upperCase=0 , lowercase=0 , digitCount=0, specialChar = 0, vc=0, cc=0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch>='A'&&ch<='Z'){
                upperCase++;
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vc++;
                }else{
                    cc++;
                }
            }
            else if (ch>='a'&&ch<='z') {
                lowercase++;
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vc++;
                }else
                    cc++;

            }
            else if (ch>=0&&ch<=9) {
                digitCount++;
            }
            else
                specialChar++;
        }

        System.out.println("Uppercase ="+upperCase+ '\n' +" Lowercase=  "+lowercase + '\n' + "vowel count ="+vc + '\n' +" Consonant count = "+cc
                + '\n' +" Special character= " +specialChar);



    }

}
