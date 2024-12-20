package users;

public abstract class User {
    protected String login;
    protected String password;
    protected String id;
    protected String name;
    protected String email;
    
    public User(String login, String password) {
    	this.login = login;
    	this.password = password;
    }
    
    public User(String login, String password,String id, String name, String email) {
    	this.login = login;
    	this.password = password;
    	this.id = id;
    	this.name = name;
    	this.email = email;
    }
    
    public abstract String getLogin();
    public abstract String getPassword();
    
    
}
