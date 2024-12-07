package users;

public abstract class User {
    protected String login;
    protected String password;
    private String id;
    private String name;
    
    public User(String login, String password) {
    	this.login = login;
    	this.password = password;
    }
    
    public User(String login, String password, String id, String name) {
    	this.login = login;
    	this.password = password;
    	
    	this.id = id;
    	this.name = name;
    }
    public abstract String getLogin();
    public abstract String getPassword();
    
    
}
