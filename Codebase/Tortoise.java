/**
 *This class returns an array of [hr, min , sec]
 *that will take the tortoise B to catch tortoise A
 **/  
public class Tortoise{
	
	
	/**
	 *Algorithm for race method
	 *1. Declare an int variable for hr, min , sec
	 *2.1 If V1 is less than or equal to V2, return null
	 *2.2 ELSE get the value of sec by subtracting 
	 *	  V2 to V1 (v2-v1) then divide it to the product
	 *	  of 3600 and G (3600*g)    3600*g/(v2-v1)
	 *2.3 get the value of hr by dividing the value of
	 *	  second to 3600 (sec/3600)
	 *2.4 get the value of the new sec by subtracting
	 *	  the product of 3600 * hr (sec-3600*hr)
	 *2.5 get the value of min by diving sec to 60
	 *    (sec/60)
	 *2.6 get the value of sec by subtracting sec to
	 *    the product of 60 and min (sec - 60 * min)
	 *2.7 return the new array of hr,min,sec {hr,min,sec }
	 *	
	 *@param v1 is the integer velocity of tortoise A
	 *@param v2 is the integer velocity of tortoise B
	 *@param g is the integer  lead of tortoise A
	 *@return int[] of time {hr,min,sec} of how long B will catch A 
	 *
    public static int[] race(int v1, int v2, int g) {
       int hr = 0;
       int min= 0;
       int sec = 0;
          if(v1 >= v2){
            return null;
          }

      sec = 3600 * g / (v2 - v1);
      hr = sec / 3600;
      sec= sec - 3600 * hr;
      min = sec / 60;
      sec = sec - 60 * min;
    return new int[]{hr,min,sec};
    }


}