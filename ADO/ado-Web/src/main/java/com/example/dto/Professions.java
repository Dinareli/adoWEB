package com.example.dto;

public class Professions {
  private String role;
  private String[] capacities;
  private String company;
  private String duration;

  public Professions() {
  }
  public Professions(String role, String company, String duration) {
    this.role = role;
    this.capacities = capacities;
    this.company = company;
    this.duration = duration;
  }

  
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }
  public String[] getCapacities() {
    return capacities;
  }
  public void setCapacities(String[] capacities) {
    this.capacities = capacities;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }
  
}
