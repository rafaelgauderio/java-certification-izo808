package objectOriented.enums;

enum WeekDays {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURDAY(8),
    FRIDAY(8),
    SATURDAY(4),
    SUNDAY(2) {
        public String getLocalOfWork() {
            return "Home"; // working from home during the weekends
        }

    }; // complex enum must have a semicolon at the end of the enumerations


    private final int hoursOfWork;

    private WeekDays(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public String getLocalOfWork() {
        return "Company"; // duraring the week word at the company
    }
}

public class ComplexEnum {

    public static void main(String[] args) {
        System.out.println("Complex Enums\n" +
                "Can have fields, constructors and methods.\n" +
                "Do not ever can the constructor, we simple refer to the enum value.\n" +
                "The constant specific class body is used whenever we need a particular constant to.\n" +
                "\toverrride a method in the enum.\n" +
                "");

        WeekDays segunda = WeekDays.MONDAY;
        System.out.println("\n"+ segunda.name());
        System.out.println(segunda.getHoursOfWork());
        System.out.println(segunda.getLocalOfWork());

        WeekDays sabado = WeekDays.SATURDAY;
        System.out.println("\n"+ sabado.name());
        System.out.println(sabado.getHoursOfWork());
        System.out.println(sabado.getLocalOfWork());

        System.out.println("\n" + WeekDays.SUNDAY.name());
        System.out.println(WeekDays.SUNDAY.getHoursOfWork());
        System.out.println(WeekDays.SUNDAY.getLocalOfWork());


    }


}







