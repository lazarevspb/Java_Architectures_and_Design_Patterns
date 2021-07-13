package ru.lazarev.lesson7.dao;

import java.util.List;
import java.util.Optional;
import ru.lazarev.lesson7.model.Course;


public interface CourseRepository {

  List<Course> findAll();

  Optional<Course> findById(Long id);

  void save(Course course);

  void delete(Long id);

  List<Course> findByTitleWithPrefix(String prefix);
}
