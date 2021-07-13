package ru.lazarev.lesson7.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.lazarev.lesson7.dao.CourseRepository;
import ru.lazarev.lesson7.model.Course;


@Component
public class MemoryBasedCourseRepositoryImpl implements CourseRepository {

  private final Map<Long, Course> courseMap = new ConcurrentHashMap<>();
  private final AtomicLong identity = new AtomicLong();

  @PostConstruct
  public void init() {
    save(new Course(null, "Vasya", "Основы программирования на джава"));
    save(new Course(null, "Вася", "Базы данных для самых маленьких"));
    save(new Course(null, "Петя", "Скучный маркетинг"));
  }

  @Override
  public List<Course> findAll() {
    return new ArrayList<>(courseMap.values());
  }

  @Override
  public Optional<Course> findById(Long id) {
    return Optional.ofNullable(courseMap.get(id));
  }


  @Override
  public void save(Course course) {
    if (course.getId() == null) {
      course.setId(identity.incrementAndGet());
    }
    courseMap.put(course.getId(), course);
  }

  @Override
  public void delete(Long id) {
    courseMap.remove(id);
  }

  @Override
  public List<Course> findByTitleWithPrefix(String prefix) {
    return courseMap.values()
        .stream().filter(course -> course.getTitle().startsWith(prefix))
        .collect(Collectors.toList());
  }
}
