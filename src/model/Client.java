package model;

public class Client {
    private int id;
    private String cnp;
    private String firstName;
    private String lastName;
    private int mobile;
    private String address;

    public Client(int id, String cnp, String firstName, String lastName,
                  int mobile, String address){
        this.id = id;
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId(){return id;}
    public String getCnp(){return cnp;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getMobile(){return mobile;}
    public String getAddress(){return address;}

    public void setId(int id){this.id = id;}
    public void setCnp(String cnp){this.cnp = cnp;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setMobile(int mobile){this.mobile = mobile;}
    public void setAddress(String address){this.address = address;}

    @Override
    public int hashCode(){
        int prime = 31;
        int result = prime* cnp.hashCode();
        return result;
    }

}
