public class _18_upperc_lowerc_digitc_spc {
    public static void main(String[] args) {

        String str = "my name is Nikhil Gayakwad";
        int upperCase=0 , lowercase=0 , digitCount=0, specialChar = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch>='A'&&ch<='Z'){
                upperCase++;
            } else if (ch>='a'&&ch<='z') {
                lowercase++;
            } else if (ch>=0&&ch<=9) {
                digitCount++;
            }else
                specialChar++;
        }


    }

}
