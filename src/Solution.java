import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Current time is: "+ Calendar.getInstance().getTime());

        DateFormat dateFormat = new SimpleDateFormat("h:m");
        System.out.println("Current time is: "+dateFormat.format(Calendar.getInstance().getTime()));
    }
}
