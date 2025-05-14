package Strivers_Sheet_Easy;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;

//brute force
public class _7_move_all_zero_to_the_end {
    public static int[] moveZeros(int n, int []a)
    {   //temporary Array
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array
        for (int i = 0; i < n; i++) {
            if(a[i] != 0)
            {
                temp.add(a[i]);
            }

            int nz = temp.size();
        }
    }
}
