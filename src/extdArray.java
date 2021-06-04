/*Samuel Julien
* Lab 3
* 9-18-17*/
import java.util.ArrayList;

public class extdArray extends ArrayList {
    public static double sumArray(ArrayList<Double> x){
        double sum=0;
        for(int i=0;i<x.size();i++) {
            sum += x.get(i);
        }
        return sum;
        }
    public static double  maxArray(ArrayList<Double> x){
        double max=0;
        for(int i=0;i<x.size();i++) {
          if(x.get(i)>max){
              max=x.get(i);
          }
        }
        return max;

    }
    public static void unionArray(ArrayList<Double> x,ArrayList<Double> y){
        for (int i =0; i< y.size();i++){
            x.add(y.get(i));
        }
        System.out.println("The new Array is: "+x);
    }
}
