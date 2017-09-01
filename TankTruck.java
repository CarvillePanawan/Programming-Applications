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
     * 1. Calculate the radius of the tanker
     * 2. Square the radius
     * 3. Square the height
     * 4. Calculate the length
     * 5. Calculates the remaining volume in the tank
     * 6. Returns the result
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