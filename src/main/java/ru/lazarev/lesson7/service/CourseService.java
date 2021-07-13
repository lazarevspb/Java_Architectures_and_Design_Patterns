package ru.lazarev.lesson7.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lazarev.lesson7.dao.CourseRepository;
import ru.lazarev.lesson7.model.Course;


@Service
public class CourseService {

  private final CourseRepository courseRepository;

  @Autowired
  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public List<Course> findByTitleWithPrefix(String prefix) {
    return courseRepository.findByTitleWithPrefix(prefix == null ? "" : prefix);
  }

  public void save(Course course) {
    courseRepository.save(course);
  }

  public void delete(Long id) {
    courseRepository.delete(id);
  }

  public Optional<Course> findById(Long id) {
    return courseRepository.findById(id);
  }
}
