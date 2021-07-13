package ru.lazarev.lesson7.model;

import javax.validation.constraints.NotBlank;


public class Course {

  private Long id;
  @NotBlank(message = "Course author has to be filled")
  private String author;
  @NotBlank(message = "Course title has to be filled")
  private String title;

  public Course() {
  }

  public Course(Long id, String author, String title) {
    this.id = id;
    this.author = author;
    this.title = title;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Course)) {
      return false;
    }

    Course course = (Course) o;

    if (getId() != null ? !getId().equals(course.getId()) : course.getId() != null) {
      return false;
    }
    if (getAuthor() != null ? !getAuthor().equals(course.getAuthor())
        : course.getAuthor() != null) {
      return false;
    }
    return getTitle() != null ? getTitle().equals(course.getTitle()) : course.getTitle() == null;
  }

  @Override
  public int hashCode() {
    int result = getId() != null ? getId().hashCode() : 0;
    result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
    result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
    return result;
  }
}
