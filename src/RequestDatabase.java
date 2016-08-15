
public class RequestDatabase {
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String nationality;
    private String email;
    private String mobile;
    private String gender;
    private String maritalStatus;
    private String address;
    
    public RequestDatabase(int id, String firstname, String lastname, String username, String password, String nationality, String email, String mobile, String gender, String maritalStatus, String address){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.nationality = nationality;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.address = address;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
     public String getLastName(){
        return lastname;
    }
     
      public String getUsername(){
        return username;
    }
    
    public String getPassword(){
       return password;
    }
    
     public String getNationality(){
        return nationality;
    }
     
    public String getEmail(){
        return email;
    } 
    public String getMobile(){
       return mobile;
    }
    
     public String getGender(){
        return gender;
    }
     
    public String getMaritalStatus(){
        return maritalStatus;
    } 
    public String getAddress(){
        return address;
    } 
    
}
