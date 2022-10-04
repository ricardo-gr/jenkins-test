package com.rgr.testexample;

public class Character {
	private String name;
	private Integer level;
	private Float weight;
	private Long experience;

	public Character(String name, Float weight, Long experience) {
		this.name = name;
		this.weight = weight;
		
		this.setExperience(experience < 0 ? 0 : experience);
	}
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected Integer getLevel() {
		return level;
	}

	protected Float getWeight() {
		return weight;
	}

	protected void setWeight(Float weight) {
		this.weight = weight;
	}

	public Long getExperience() {
		return experience;
	}

	public void setExperience(Long experience) {
		this.experience = experience;

		updateLevel();
	}

	public void addExperience(Long newXp) {
		this.experience += newXp;

		updateLevel();
	}

	protected void updateLevel() {
		if (this.experience < 2000)
			level = 1;
		else if (this.experience < 4000)
			level = 2;
		else if (this.experience < 8000)
			level = 3;
		else if (this.experience < 16000)
			level = 4;
		else
			level = 5;
	}
	
	public String toString() {
		return this.name + " - " + this.weight + "kg - Level " + this.getLevel() + " - " + this.experience + " XP\r\n";
	}

}
