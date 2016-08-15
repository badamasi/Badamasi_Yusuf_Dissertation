

/**
 *
 * @Badamasi Yusuf 771772239 2016.
 */
public class AdminDatabase {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String user;
    private String pass;
    private String poss;
    
    public AdminDatabase(int id, String name, String email, String phone, String user, String pass, String poss){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.pass = pass;
        this.poss = poss;
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
    
    public String getUser(){
       return user;
    }
    
     public String getPass(){
        return pass;
    }
     
    public String getPoss(){
        return poss;
    } 
}
