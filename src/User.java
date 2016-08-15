

/**
 *
 * @author USER
 */
public class User {
    
    private int id;
    private String name;
    private String email;
    private String phone;
    private String pass;
    private String gend;
    private String nationality;
    private String address;
    
    public User(int id, String name, String email, String phone, String pass, String gend, String nationality, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.gend = gend;
        this.nationality = nationality;
        this.address = address;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
     public String getEmail(){
        return email;
    }
     
      public String getPhone(){
        return phone;
    }
    
    public String getPass(){
       return pass;
    }
    
     public String getGend(){
        return gend;
    }
     
    public String getNationality(){
        return nationality;
    }
    
    public String getAddress(){
        return address;
    } 
    
}
