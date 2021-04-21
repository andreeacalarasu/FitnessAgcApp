package model;

public enum DayOfWeek {
    MONDAY(1,"Monday"),
    TUESDAY(2,"Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4,"Thursday"),
    FRIDAY(5,"Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday");





    private int cod;
    private String description;

    DayOfWeek(int cod, String description){
        this.cod=cod;
        this.description=description;
    }

    public int getCod(){
        return cod;
    }

    public String getDescription() {
        return description;
    }


}
