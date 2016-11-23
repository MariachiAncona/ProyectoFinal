import java.io.*;
import java.util.*;

public class User {

	String nickname;
	String password;
	int id;

	//public User{}

	public User(String nickname, String password, int id){
		//super();
		this.nickname = nickname;
		this.password = password;
		this.id = id;
	}
 	
 	public String getNickname() {
        return nickname;
     }

     public void setNickname(String nickname) {
        this.nickname = nickname;
     }

     public String getPass() {
         return password;
     }

     public void setPass(String password) {
          this.password = password;
     }

     public int getId() {
         return id;
     }

     public void setId(int edad) {
          this.id = id;
     }

}