package Own;

public class _16_frequency_each_character {
    public static void main(String[] args) {
        String str=  "Nikhil Gayakwad";

        int[] count= countFreq(str);
        for(int i =0 ;i< count.length;i++){
            if(count[i]>0)
            System.out.println((char)i + " => "+count[i]);
        }

    }

    private static int[] countFreq(String str) {
        int[] count= new int[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        return count;
    }
}
