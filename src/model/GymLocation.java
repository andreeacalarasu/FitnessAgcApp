package model;

public enum GymLocation {

        AVIATIEI(1,"Aviatiei"),
        MILITARI(2,"Militari"),
        TITAN(3, "Titan");



        private int cod;
        private String description;

        GymLocation(int cod, String description){
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

