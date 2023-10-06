package practise;

import java.util.Arrays;

public class AppArrays {
public static void main(String[] args) {
	Integer[] numbers=new Integer[] {10,45,34,35,67};
	Arrays.sort(numbers);
	// Linear Search
	int num=45;
	int flag=-1;
	for(int i=0;i<numbers.length;i++)
	{
		flag=numbers[i].equals(num)? i:flag;
		if(flag>-1)
		{
			break;
		}
	}
	System.out.println(flag);

}
}
