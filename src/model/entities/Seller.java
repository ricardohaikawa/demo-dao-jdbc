package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String name;
	private String email;
	private Date birthDate;
	private Double BaseSalary;

	private Department departmen;

	public Seller() {
	}

	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department departmen) {
		Id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		BaseSalary = baseSalary;
		this.departmen = departmen;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return BaseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}

	public Department getDepartmen() {
		return departmen;
	}

	public void setDepartmen(Department departmen) {
		this.departmen = departmen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", BaseSalary="
				+ BaseSalary + ", departmen=" + departmen + "]";
	}
}
