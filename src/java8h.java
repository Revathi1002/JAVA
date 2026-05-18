import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Month;

public class java8h {
    public static void main(String[] args)
    {
        LocalDate obj=LocalDate.of(2000,Month.JANUARY,10);
        System.out.println("Date :" + obj);
        LocalTime obj1=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in India :" + obj1);
        System.out.println("All Zone IDs");
        for(String i :ZoneId.getAvailableZoneIds())
        {
            System.out.println(i);
        }
    }
}
