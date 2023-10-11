package com.uningen.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

  List<Grade> studentGrades = new ArrayList<Grade>();

  @GetMapping("/grades")
  public String getGrades(Model model) {
    model.addAttribute("grades", studentGrades);
    return "grades";
  }

  @PostMapping("/handleSubmit")
  public String submitGrade(Grade grade) {
    int gradeIndex = getGradeIndex(grade.getId());
    if (gradeIndex == -1) {
      studentGrades.add(grade);
    } else {
      studentGrades.set(gradeIndex, grade);
    }

    return "redirect:/grades";
  }

  @GetMapping("/")
  public String getGradeForm(Model model, @RequestParam(required = false) String id) {
    int gradeIndex = getGradeIndex(id);
    Grade grade = (gradeIndex == -1) ? new Grade() : studentGrades.get(gradeIndex);

    model.addAttribute("grade", grade);
    return "form";
  }

  public Integer getGradeIndex(String id) {
    for (int i = 0; i < studentGrades.size(); i++) {
      if (studentGrades.get(i).getId().equals(id))
        return i;
    }
    return -1;
  }
}
