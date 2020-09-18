import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Week1Final {
    static int testsSucceeded = 0;
    static final int tests= 1000;

    public static void main(String[] args) {
        for(int testNumber=0; testNumber < tests; testNumber++) {
            //looping through the people in the class and assigning 23 birthdays
            ArrayList<Integer> listofbirthdays = new ArrayList<>();
            for (int n = 0; n < 23; n++) {
                Random random = new Random();
                //assigns 23 birthdays in between 0 and 364(1 to 365)
                listofbirthdays.add(random.nextInt(364));
            }

            int prevTestsSucceeded = testsSucceeded;

            for (int i = 0; i < listofbirthdays.size(); i++) {
                for (int j = i + 1; j < listofbirthdays.size(); j++) {
                    if ((listofbirthdays.get(i).equals(listofbirthdays.get(j)))) {
                        testsSucceeded += 1;
                        break;
                    }
                }
                if (prevTestsSucceeded != testsSucceeded) {
                    break;
                }
            }
            listofbirthdays.clear();
        }

        //finding the percentage of tests successful
        System.out.println(((double) testsSucceeded / tests * 100) + "% of tests succeeded");
    }
}
