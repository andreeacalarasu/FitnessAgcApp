package model;

public enum TrainingLevel {
    BEGINNER(1,"Beginner"),
    INTERMEDIATE(2,"Intermediate"),
    ADVANCED(3, "Advanced");



    private int cod;
    private String description;

    TrainingLevel(int cod, String description){
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

