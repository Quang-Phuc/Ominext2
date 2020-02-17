package fix;

import java.util.Arrays;
import java.util.List;

public class Users {
	 private String id;
	    private String name;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Users{" +
	                "id='" + id + '\'' +
	                ", name='" + name + '\'' +
	                '}';
	    }

	    public Users() {
	    }

	    public Users(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public  List<Users> insertUser()
	    {
	        List<Users> users = Arrays.asList(
	                new Users("1", "A"),
	                new Users("2", "B"),
	                new Users("3", "C"),
	                new Users("4", "D"));
	        return  users;

	    }
}
