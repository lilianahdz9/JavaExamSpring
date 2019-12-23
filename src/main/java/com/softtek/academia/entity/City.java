package com.softtek.academia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@Column(name = "city_id")
	private long city_id;
	
//	@Column(name = "description" )
	private String description;
	
//	@Column(name = "state_id")
	@ManyToOne
	@JoinColumn(name="state_id" , nullable=false)
	private State state_id;
	
	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", description=" + description + ", state_id=" + state_id + "]";
	}

	
}