package com.uningen.gradesubmission;

public class Movie {
  private String title;
  private String episode;
  private double rating;

  public Movie(String title, String episode, double rating) {
    this.title = title;
    this.episode = episode;
    this.rating = rating;
  }

  public Movie() {
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getEpisode() {
    return this.episode;
  }

  public void setEpisode(String episode) {
    this.episode = episode;
  }

  public double getRating() {
    return this.rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

}
