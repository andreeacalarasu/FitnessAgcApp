package model;

public enum MembershipType {
    WEEKDAY(1,"Acces to all club facilities during the day, between 10-16:00, 5 days per week"),
    WEEKEND(2,"Acces to all club facilities 4 weekends per month."),
    MONTHLY(3, "All-inclusive access one month"),
    ANNUALLY(4,"All-inclusive access one YEAR");





    private int cod;
    private String description;

    MembershipType(int cod, String description){
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
