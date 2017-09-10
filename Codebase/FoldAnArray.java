/**
 * @(#)FoldAnArray!
 *
 *
 * @author Klint Chinayog
 * @version 1.00 2017/8/16
 */

/*
 *Class that folds an integer array and addig the folded integers
 *@param
 **/
public class FoldAnArray{
	
	/*
	 *Algorithm
	 *1. Declare an empty array dummy.
	 *2. While runs isn't equal to 0
	 *	2.1 Declare an integer value length equevalent to the legth of the array 
	 *  2.2 If the given array is divisible by two, equate dummy to the length
	 *		2.2.1 Else equate dummy to length adn add 1
	 *	2.3 Divde the array into two, equate dummy to the result of adding the values of the two halves
	 *	2.4 If length of the dummy array is equal to halve the length of the array
	 *		2.4.1 Decrement runs by 1
	 *		2.4.2 Equate array to dummy
	 *		2.4.3 Return array
	 *@param
	 **/
	public static int[] foldArray(int[] array, int runs){
		int[] dummy=null;
		while(!(runs==0)){
			int length=array.length;
			if(array.length%2==0){
				dummy=new int[length/2];
			}else{
				dummy=new int[length/2+1];
			}
			for(int first=0,last =array.length-1; first<last&&!(first==last); first++,last--){
				dummy[first]=array[first]+array[last]; 
			}
			if(array.length%2==1)dummy[dummy.length-1]=array[length/2];
			runs--;
			array=dummy;
			}
			return array;
		}
	}
