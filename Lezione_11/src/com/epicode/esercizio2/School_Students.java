package com.epicode.esercizio2;

import java.time.LocalDate;

public class School_Students {
	
	private Integer id;
	private String name;
	private String lastname;
	private String gender;
	private LocalDate birthdate;
	private Integer avg;
	private Integer min_vote;
	private Integer max_vote;
	
	public School_Students(Integer id, String name, String lastname, String gender, LocalDate birthdate, Integer avg,
			Integer min_vote, Integer max_vote) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
	}

	public School_Students(String name, String lastname, String gender, LocalDate birthdate, Integer avg, Integer min_vote,
			Integer max_vote) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.min_vote = min_vote;
		this.max_vote = max_vote;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

	public Integer getMin_vote() {
		return min_vote;
	}

	public void setMin_vote(Integer min_vote) {
		this.min_vote = min_vote;
	}

	public Integer getMax_vote() {
		return max_vote;
	}

	public void setMax_vote(Integer max_vote) {
		this.max_vote = max_vote;
	}

	@Override
	public String toString() {
		return "School_Students [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender
				+ ", birthdate=" + birthdate + ", avg=" + avg + ", min_vote=" + min_vote + ", max_vote=" + max_vote
				+ "]";
	}
	
	
	

}
