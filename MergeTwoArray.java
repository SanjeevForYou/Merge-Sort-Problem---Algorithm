package algorithm.lab2;

public class MergeTwoArray {

	public static void main(String[] args)
	{
		int[] ary1 = {1, 4, 5, 8, 17};
		int[] ary2 = {2, 4, 8, 11, 13, 21, 23, 25};
		int[] solAry = new int[ary1.length + ary2.length];
		
		int[] result = merge(ary1,ary2,solAry,0,0,0);
		
		System.out.print("{");
		for(int i=0;i<solAry.length;i++)
		{
			System.out.print(solAry[i]);
			if(i!=solAry.length-1)
				System.out.print(" , ");
		}
		System.out.print("}");
		
	}
	
	public static int[] merge(int[] ary1, int[] ary2,int[] solAry,int index, int index1, int index2)
	{
		System.out.println("index1 : " + index1 + "  index2 :" + index2);
		if(index1 == ary1.length && index2 == ary2.length)
			return solAry;
		else
		{
			int val1 = Integer.MAX_VALUE, val2 = Integer.MAX_VALUE;
			if(index1 < ary1.length)
			{
				val1 = ary1[index1];
			}
			if(index2 < ary2.length)
			{
				val2 = ary2[index2];
			}
			System.out.println("value1 : " + val1 + "  value2 :" +val2);

				if(val1 <= val2 )
				{
					solAry[index] = val1;
					++index1;
					++index;
				}
				else
				{
					solAry[index] = val2;
					++index2;
					++index;
				}
	
			
			return merge(ary1, ary2,solAry,index,index1,index2);
		}
	}
}
