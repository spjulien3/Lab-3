/*Samuel Julien
* Lab 3
* 9-18-17*/
import java.util.ArrayList;
public class TestExtdArray {
    public static void main(String[]args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(2.0);
        list2.add(3.0);
        System.out.println("The sum of the Array list is: "+extdArray.sumArray(list));
        System.out.println("The Max of the Array list is: "+extdArray.maxArray(list));
        extdArray.unionArray(list,list2);

    }
}
