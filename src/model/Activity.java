package model;

public enum Activity {
    SPINNING(1,"Spinning"),
    KANGOO_JUMPS(2,"Kangoo Jumps"),
    BAG_BOXING(3, "Bag Boxing"),
    BODY_COMBAT(4,"Body Combat"),
    AQUA(5, "Aqua");




    private int cod;
    private String description;

    Activity(int cod, String description){
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
