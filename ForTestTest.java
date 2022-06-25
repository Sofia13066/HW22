import java.util.Arrays;
import java.util.Comparator;
import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;



class DateSortTest {

  @Test
  void test() {
    String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
    String[] expected = { "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010", };
   
    Comparator<String> comp = (d1, d2) -> {
        
        // int res1 = (Integer.parseInt(d1.substring(6, 10)))-(Integer.parseInt(d2.substring(6, 10)));
        // int res2 = (Integer.parseInt(d1.substring(3, 5)))-(Integer.parseInt(d2.substring(3, 5)));
        // int res3 = (Integer.parseInt(d1.substring(0, 2)))-(Integer.parseInt(d2.substring(0, 2)));
        int resYear = Integer.compare((Integer.parseInt(d1.substring(6, 10))),(Integer.parseInt(d2.substring(6, 10))));
        int resMonth = Integer.compare((Integer.parseInt(d1.substring(3, 5))),(Integer.parseInt(d2.substring(3, 5))));
        int resDay = Integer.compare((Integer.parseInt(d1.substring(0, 2))),(Integer.parseInt(d2.substring(0, 2))));
        if(resYear!=0) return resYear;
              if(resMonth!=0) return resMonth;
                return resDay;
              
    }; 
    Arrays.sort(dates, comp);
    assertArrayEquals(expected, dates);
  }

}
