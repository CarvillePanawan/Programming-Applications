// import java.util.ArrayList;
// it's so long, I know

/**
 * Solution for: 'Follow that spy' by adromil
 * Algorithm:
 *     1. Receive parameter value of routes
 *     2. Declare String[] variable temp1, int variable counter, String variable temp3, boolean 
 *        variable spyFollowed, ArrayList<String[]> variable oldRoute, ArrayList<String> variable newRoute
 *     3. Copy the contents of routes to oldRoute
 *     4. Add the values of first array of oldRoute to newRoute, then removes said array
 *     5. While spyFollowed is false:
 *          5.1 Copy first array of oldRoute to temp1
 *          5.2 Compare temp1[1] String value to the first String value of newRoute
 *          5.3 If String values are equal:
 *               5.3.1 Insert temp1[0] value at index 0 of newRoute, remove array from oldROute, and increment counter by 1
 *               5.3.2 Check if oldRoute is empty. If empty, set spyFollowed to true
 *          5.3 If String values are not equal, increment counter by 1 and skip to next array
 *          5.4 If counter is equal to the size of oldRoute (no match), proceed to switchRoute method
 *    6. Add all values of newRoute to temp3
 *    7. Return temp3
 *
 * @param routes the array of arrays that will contain the strings to be sorted
 * @return String the sorted string
 */
public static String findRoutes(String[][] routes) {
    String[] temp1; int counter=0; String temp3="";
    boolean spyFollowed = false;
		ArrayList<String[]> oldRoute = new ArrayList<String[]>();
		ArrayList<String> newRoute = new ArrayList<String>(); // empty
		for (String[] temp2 : routes) {
			oldRoute.add(temp2);
		}
		temp1 = oldRoute.get(0);
		newRoute.add(temp1[0]);
		newRoute.add(temp1[1]);
		oldRoute.remove(0);

		try {
			while (!spyFollowed) {
				for (int a=0; a<oldRoute.size(); a++) {
					temp1 = oldRoute.get(a);
					if (temp1[1].equalsIgnoreCase(newRoute.get(0))) {
						newRoute.add(0, temp1[0]);
						oldRoute.remove(a); counter=0;
	                    if (oldRoute.isEmpty()) { // oldRoute empty
	                        spyFollowed = true;
	                    }
	                    break;
					} else if (counter == oldRoute.size()) { // no match, oldRoute !empty
	                    newRoute = switchRoute(newRoute, oldRoute);
	                    spyFollowed = true;
	                    break;
					} else {
						counter++;
					}
				}
			}
	    temp3 = newRoute.get(0);
			for (int c=1; c<newRoute.size(); c++) {
			temp3 += " " + newRoute.get(c);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return temp3;
}

/**
 * Algorithm:
 *     1. Receives parameter values of newRoute and oldRoute
 *     2. Declare String[] variable temp4, boolean variable switchDone
 *     3. While switchDone is false:
 *          3.1 Copy first array of oldRoute to temp4
 *          3.2 Compare temp4[0] to the last String value of newRoute
 *          3.3 If String values are equal:
 *               4.3.1 Insert temp4[1] value at the end of newRoute and remove array from oldRoute
 *               4.3.2 Check if oldRoute is empty. If empty, set switchDone to true
 *          3.4 If String values are not equal, skip to next array
 *     4. Return newRoute
 *
 * @param newRoute the ArrayList<String> for sorted elements
 * @param oldRoute the ArrayList<String[]> for unsorted elements
 * @return ArrayList<String> the sorted ArrayList<String> 
 */
public static ArrayList<String> switchRoute(ArrayList<String> newRoute, ArrayList<String[]> oldRoute) {
    String[] temp4; boolean switchDone = false;
    while (!switchDone) {
        for (int b=0; b<oldRoute.size(); b++) {
            temp4 = oldRoute.get(b);
            if (temp4[0].equalsIgnoreCase(newRoute.get(newRoute.size()-1))) {
                newRoute.add(temp4[1]);
                oldRoute.remove(b);
                if (oldRoute.isEmpty()) {
                    switchDone = true;
                }
                break;
            }
        }
    }
    return newRoute;
}
