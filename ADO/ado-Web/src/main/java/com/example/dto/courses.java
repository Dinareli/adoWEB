package com.example.dto;

public class courses {
  private String title;
  private String[] capacities;
  private String institute;
  private int endYear;

  public courses() {
  }
  public courses(String title, String institute, int endYear) {
    this.title = title;
    this.capacities = capacities;
    this.institute = institute;
    this.endYear = endYear;
  }

  
  public String getInstitute() {
    return institute;
  }
  public void setInstitute(String institute) {
    this.institute = institute;
  }
  public int getEndYear() {
    return endYear;
  }
  public void setEndYear(int endYear) {
    this.endYear = endYear;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String[] getCapacities() {
    return capacities;
  }
  public void setCapacities(String[] capacities) {
    this.capacities = capacities;
  }
}