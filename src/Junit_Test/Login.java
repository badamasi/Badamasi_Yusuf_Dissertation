
package Junit_Test;

//import java.util.Scanner;
public class Login {
   private String username;
   private String password;
   private String key;
   private String pass;

    public Login(String username, String password, String key) {
        this.username = username;
        this.password = password;
        this.key = key;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
}
