package Kira;

public class Register {

    private String email;
    private String password;
    private int id;
    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken() {

    }



    public Register(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
