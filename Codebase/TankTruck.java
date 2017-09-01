/**
 * @(#)TankTruck.java
 *
 *
 * @author : Chinayog
 * @version 1.00 2017/8/31
 */
 
import java.lang.Math;
public class TankTruck {
	/**
     * Executes the tankvol method and returns the remaining volume in the tank
     *@param
     **/
	public static void main(String [] a){
    	System.out.print(tankVol(40,120,3500));
    }
    /**
     * Algorithm:
     * 1. Declare double radius equivalent to the radius,divide the diameter by 2
     * 2. Declare double radiusSquared equals to the value of the radius squared
     * 3. Declare double heightSquared equivalent to the height squared
     * 4. Declare double length equivalent to the maximum volume of the tank divided by area of the cylinder top
     * 5. Declare double equivalent answer equivalent to the computed reamining value
     * 6. Declare int result as answer
     * 7. Return result
     *@ param
     **/
    public static int tankVol(int h, int d, int vt) {
        double radius=1.0f*d/2;
        double radiusSquared=Math.pow(radius,2);
        double heightSquared=Math.pow(h,2);
        double length=vt/(Math.PI*radiusSquared);
        double answer=length*(radiusSquared*(Math.acos((radius-h)/radius))-(radius-h)*(Math.sqrt(2*radius*h-heightSquared)));
        int result=(int)answer;
        return result;
    }
}
