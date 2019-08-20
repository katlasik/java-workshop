package pl.sda.enums;

import java.util.List;

public class OfficeWorkingHours {

    private List<DayOfWeek> daysWithExtendedWorkingHours;

    public OfficeWorkingHours(List<DayOfWeek> daysWithExtendedWorkingHours) {
        this.daysWithExtendedWorkingHours = daysWithExtendedWorkingHours;
    }

    String getOfficeWorkingHours(DayOfWeek day) {

        if(daysWithExtendedWorkingHours.contains(day)) {
            return "8-17";
        } else if(day.isWeekend()) {
            return "closed";
        } else {
            return "8-15";
        }

    }

    public static void main(String[] args) {

        OfficeWorkingHours workingHours = new OfficeWorkingHours(List.of(DayOfWeek.MONDAY, DayOfWeek.THURSDAY));

        System.out.println(workingHours.getOfficeWorkingHours(DayOfWeek.MONDAY)); //8-17
        System.out.println(workingHours.getOfficeWorkingHours(DayOfWeek.TUESDAY)); //8-15
        System.out.println(workingHours.getOfficeWorkingHours(DayOfWeek.SATURDAY)); //closed

    }
}
