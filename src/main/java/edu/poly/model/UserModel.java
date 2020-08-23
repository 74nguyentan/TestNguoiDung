package edu.poly.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserModel")
public class UserModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String name;
	
	@Column(length = 100)
	private String UserName;
	
	@Column(length = 100)
	private String password;
	
	@Column(length = 10)
	private Integer role;
	
	@Column(length = 100)
	private String numberPhone;
	
	@Column(length = 200)
	private String adress;
	
	@Column(length = 200)
	private Integer status;

	public UserModel() {
		super();
	}

	public UserModel(Integer id, String name, String userName, String password, Integer role, String numberPhone,
			String adress, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.UserName = userName;
		this.password = password;
		this.role = role;
		this.numberPhone = numberPhone;
		this.adress = adress;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
}
