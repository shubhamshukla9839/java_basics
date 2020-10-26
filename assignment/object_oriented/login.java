package assignment.object_oriented;

public class login {

    private String username;
    private String pasword;
    public login(){

    }

    public login(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "login [pasword=" + pasword + ", username=" + username + "]";
    }
    
    
    
}