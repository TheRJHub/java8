import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Using_DataeTimeAPI {
    public static void main(String[] args) {
        //using instant and currentTimeMillis()
//        long l=System.currentTimeMillis();
//        System.out.println(l);
//
//        Instant now = Instant.now();
//        System.out.println(now);


        //LocalTime
        System.out.println("LocalTime");
        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalTime Before1hr=now.minusHours(1);
        if (now.isAfter(Before1hr)){
            System.out.println("Yes curr time is after Before1hr");
        }
        //LocalDate
        System.out.println("LocalDate");
        LocalDate today=LocalDate.now();
        System.out.println("Local Date: "+today);
        LocalDate yesterday=today.minusDays(1);
        if (today.isAfter(yesterday)){
            System.out.println("today is after yesterday");
        }

        System.out.println("LocalDateTime");
        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now2);

        LocalDateTime beforeSometime=LocalDateTime.parse("2025-02-23T12:12:12");
        System.out.println("using LDT: "+beforeSometime);
        
//        LocalTime l=LocalTime.of("05:2:12");

        System.out.println("ZonedDateTime");
        Set<String> s=ZoneId.getAvailableZoneIds();
        System.out.println(s);
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        System.out.println("=========================Diff in Date==================================");
        LocalDate l1=LocalDate.of(2016,1,2);
        LocalDate l2=LocalDate.of(2011,1,9);

        Period p=Period.between(l2,l1);
        System.out.println("Days: "+p.getDays());
        System.out.println("Months: "+p.getMonths());
        System.out.println("Years: "+p.getYears());

        System.out.println("=========================Diff in Time==================================");
        LocalTime ll1=LocalTime.of(10,1,2);
        LocalTime ll2=LocalTime.of(8,1,9);

        Duration pp=Duration.between(ll2,ll1);
        System.out.println("Days: "+pp.toDays());
        System.out.println("Hours: "+pp.toHours());
        System.out.println("Millis: "+pp.toMillis());
        System.out.println("=========================DateTimeFormatter==================================");
        LocalDate lll=LocalDate.now();
        DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MMMM/yyyy EEEE");
        System.out.println(lll.format(d));
    }
}