package com.brainbeast.practice;

import java.util.HashSet;
import java.util.Set;

public class UserLoginSessionManagement {

	
	private Set<String> activeUsers;

	
	public UserLoginSessionManagement() {
        this.activeUsers= new HashSet<>();
	}
	
	public boolean loginUser(String id) {
		return activeUsers.add(id);
	}
	public boolean logoutUser(String id) {
		return activeUsers.remove(id);
	}

	public boolean isUserLoggedIn(String id) {
		return activeUsers.contains(id);
	}
	
	public int getActiveuserCount() {
		return activeUsers.size();
	}
	
	public void printHashSet(){
		System.out.println("UserLoginSessionManagement.printHashSet(): active users");
		System.out.println("Active users: ");
		for(String s: activeUsers) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		UserLoginSessionManagement sessionManagement=new UserLoginSessionManagement();
		
		System.out.println("User Logged in : "+ sessionManagement.loginUser("Sandip"));
		System.out.println("User Logged in : "+ sessionManagement.loginUser("Sachin"));
		System.out.println("User Logged in : "+ sessionManagement.loginUser("Dj"));
		sessionManagement.printHashSet();
		
		System.out.println("-------------------------------------------");
		System.out.println("is Sandip logged in : " + sessionManagement.isUserLoggedIn("Sandip"));
		System.out.println("is Dj logged in : " + sessionManagement.isUserLoggedIn("Dj"));
		System.out.println("-------------------------------------------");
		System.out.println("Total Active users: " + sessionManagement.activeUsers);
		System.out.println("-------------------------------------------");
		System.out.println("User Logged in : "+ sessionManagement.loginUser("Sandip"));
		
		System.out.println("User Logged out : "+ sessionManagement.logoutUser("Sandip"));
		System.out.println("Total Active users: " + sessionManagement.activeUsers);
		
	}


}
