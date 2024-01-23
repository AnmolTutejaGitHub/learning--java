package enums;

enum DaysofWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Basic2 {
    public static void main(String[] args) {
        // DaysofTheWeek day = new DaysofTheWeek ; // error as enum is defined to have
        // predefined set of values

        DaysofWeek day = DaysofWeek.SUNDAY;

        if (day == DaysofWeek.SUNDAY) {
            System.out.println("Almost monday");
        }

        // all enum classes in java extends from java.lang.Enum
        // as it extends enum class , it gives some functionality

        for (DaysofWeek myday : DaysofWeek.values()) {
            System.out.println(myday);
        }

        // just like regular java classes enum can fields (
        // note enum vs Normal classes in enum we can't create new object , we have to
        // define object only in enum only )

    }

}
