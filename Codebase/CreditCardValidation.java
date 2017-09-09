/**
* Class that checks a given String if it is a valid credit card number.
*/
public class CreditCardValidation{
    /**
    * <p>
    * Puts the given string through a number of processes which would then result into a boolean value
    * that tells if it is a valid credit card number or not.
    * </p>
    *
    * Algorithm:
    * <ul style="list-style-type:none">
    * <li>1. Get the numeric values of each character in cNum and store it in nNum.
    * <li>2. Starting from the furthest right and going left by two's check if the doubled value of 
    * nNum[j] is greater than 9.
    *    <ul style="list-style-type:none">
    *    <li>2.1. True, nNum[j] will now be equal to nNum[j]*2-9.
    *    <li>2.2. False, nNum[j] will now be equal to nNum[j]*2.
    *    </ul>
    * <li>3. Get the summation of all indexes of the array nNum and store it ti tSum.
    * <li>4. Check if tSum%10==0.
    *    <ul style="list-style-type:none">
    *    <li>4.1. True, return true.
    *    <li>4.2. False, return false.
    *    </ul>
    * </ul>
    * @param cNum, String representation of the credit card number to be processed.
    * @return Boolean value of whether the input cNum was valid or not.
    */
    public static Boolean validate(String cNum) {
    int tSum = 0;
    int[] nNum = new int[cNum.length()];
    
    for(int i=0; i<nNum.length; i++) {
      nNum[i] = Character.getNumericValue(cNum.charAt(i));
    }
    
    for(int j=nNum.length-2; j>=0; j-=2) {
      nNum[j] = nNum[j]*2>9 ? nNum[j]*2-9 : nNum[j]*2;
    }
    
    for(int k=0; k<nNum.length; k++) {
      tSum += nNum[k];
    }
    
    return ((tSum%10)==0);
    }//validate
}//Class
