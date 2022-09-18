package com.ltp.gradesubmission;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class GradeController {
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Mathematics", "A"),
        new Grade("James", "Mathematics", "A"),
        new Grade( "Peterson", "French", "B+"),
        new Grade( "Lydia", "Algorithms", "A"),
        new Grade( "White","Data Structures", "B")
        
    );
    
    
    @GetMapping("/grades")
    public String getGrades(Model model) {
        
        model.addAttribute("grade", studentGrades);
        return "grades";
    }
}
