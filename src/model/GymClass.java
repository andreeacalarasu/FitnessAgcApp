package model;

public class GymClass {
    private String code;
    private Activity activity;
    private int noOfClients;
    private TrainingLevel trainingLevel;
    private int classDuration;
    private GymLocation location;
    private String classDescription;
    private double trainingClassTime;
    private DayOfWeek dayOfWeek;
    private Trainer trainer;

    public GymClass(String code, Activity activity,int noOfClients,TrainingLevel trainingLevel, int classDuration, GymLocation location, String classDescription,
                    double trainingClassTime,DayOfWeek dayOfWeek, Trainer trainer){
        this.code=code;
        this.activity = activity;
        this.noOfClients = noOfClients;
        this.trainingLevel = trainingLevel;
        this.classDuration = classDuration;
        this.location = location;
        this.classDescription = classDescription;
        this.trainingClassTime = trainingClassTime;
        this.dayOfWeek = dayOfWeek;
        this.trainer = trainer;

    }

    public String getCode(){return code;}
    public Activity getActivity(){return activity;}
    public int getNoOfClients(){return noOfClients;}
    public TrainingLevel getTrainingLevel(){return trainingLevel;}
    public String getClassDescription(){return classDescription;}
    public int getClassDuration(){return classDuration;}
    public GymLocation getLocation(){return location;}
    public double getTrainingClassTime(){return trainingClassTime;}
    public DayOfWeek getDayOfWeek(){return dayOfWeek;}
    public Trainer getTrainer(){return trainer;}

    public void setCode(String code){this.code = code;}
    public void setActivity(Activity activity) {this.activity = activity;}
    public void setNoOfClients(int noOfClients) {this.noOfClients = noOfClients;}
    public void setTrainingLevel(TrainingLevel trainingLevel) {this.trainingLevel = trainingLevel;}
    public void setClassDuration(int classDuration) {this.classDuration = classDuration;}
    public void setLocation(GymLocation location) {this.location = location;}
    public void setClassDescription(String classDescription) {this.classDescription = classDescription;}
    public void setTrainingClassTime(double trainingClassTime) {this.trainingClassTime = trainingClassTime;}
    public void setDayOfWeek(DayOfWeek dayOfWeek) {this.dayOfWeek = dayOfWeek;}
    public void setTrainer(Trainer trainer) {this.trainer = trainer;}

    @Override
    public int hashCode(){
        int prime = 31;
        int result = 31* code.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object o){
        GymClass gymClass = (GymClass) o;
        if(code.equals(gymClass.getCode())){return true;}
        else {return false;}
    }
    @Override
    public String toString(){
        return "Code number : " + code + ", Activity : " + activity + ", Number of clients : "+ noOfClients +
                ", Training Level : " + trainingLevel + ", Class Duration : " + classDuration +", Location : " +
                location + ", Class Description : " + classDescription + ", Training Class Time : " + trainingClassTime +
                ", Day of The Week: " + dayOfWeek + ", Trainer : " + trainer;}

}
