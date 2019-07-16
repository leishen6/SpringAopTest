package com.lyl.entity;

/**
 *@Title: User 
 * @Description: 
 * @date: 2019年7月15日 下午9:33:20
 */
public class User {
	
	private Integer id;         // 用户id
    private String username;    // 用户名
    private String password;    // 用户密码
    private String email;       // 用户邮箱

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}


}
