package ru.lazarev.lesson7.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.lazarev.lesson7.model.Course;
import ru.lazarev.lesson7.exception.NotFoundException;
import ru.lazarev.lesson7.service.CourseService;


/**
 * CourseController — просто rest http endpoint, умеет отдавать список интересных курсов по адресу
 * /course/interesting.
 */
@Controller
@RequestMapping("/course")
public class CourseController {

  private final CourseService courseService;

  @Autowired
  public CourseController(CourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping
  public String courseTable(Model model,
      @RequestParam(name = "titlePrefix", required = false) String titlePrefix) {
    model.addAttribute("courses",
        courseService.findByTitleWithPrefix(titlePrefix));
    return "course_table";
  }

  @PostMapping
  public String submitCourseForm(@Valid Course course, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "course_form";
    }
    courseService.save(course);
    return "redirect:/course";
  }

  @GetMapping("/{id}")
  public String courseForm(Model model, @PathVariable("id") Long id) {
    model.addAttribute("course", courseService.findById(id).orElseThrow(NotFoundException::new));
    return "course_form";
  }

  @GetMapping("/new")
  public String courseForm(Model model) {
    model.addAttribute("course", new Course());
    return "course_form";
  }

  @DeleteMapping("/{id}")
  public String deleteCourse(@PathVariable("id") Long id) {
    courseService.delete(id);
    return "redirect:/course";
  }

  @ExceptionHandler
  public ModelAndView notFoundExceptionHandler(NotFoundException ex) {
    ModelAndView modelAndView = new ModelAndView("not_found");
    modelAndView.setStatus(HttpStatus.NOT_FOUND);
    return modelAndView;
  }
}
