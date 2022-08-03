package BasicPartI;

import java.util.Arrays;

public class Q81 {
	public static void main(String[] args) {
		int mang[] = {20,30,40};
        System.out.println("mang goc: "+Arrays.toString(mang)); 

        for (int i = 0, j = mang.length - 1; i < j; i++, j--) {
            int temp = mang[i];
            mang[i]  = mang[j];
            mang[j] = temp;
        }

        System.out.println("mang moi: "+Arrays.toString(mang)); 
	}

}
