public class LoginAuth {


    private String email;
    private String password;
    private String hash;
    private String hashClient;

    public LoginAuth(String email, String password, String hash, String hashClient) {
        this.email = email;
        this.password = password;
        this.hash = hash;
        this.hashClient = hashClient;
    }

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

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHashClient() {
        return hashClient;
    }

    public void setHashClient(String hashClient) {
        this.hashClient = hashClient;
    }

    @Override
    public String toString() {
        return "LoginAuth: \n" +
                "Email= " + email + "\n" +
                "Password= " + password + "\n" +
                "Hash= " + hash + "\n" +
                "HashClient= " + hashClient;
    }
}
