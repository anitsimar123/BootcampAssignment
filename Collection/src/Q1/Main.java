package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Float> list = new ArrayList<>();
            Float sum = 0.0F;
            list.add(3.14F);
            list.add(2.3F);
            list.add(4.5F);
            list.add(8.6F);
            list.add(2.4F);

            Iterator itr = list.iterator();

            while (itr.hasNext()) {
                sum += (Float) itr.next();
            }
            System.out.println("Sum - "+sum);
        }
}
