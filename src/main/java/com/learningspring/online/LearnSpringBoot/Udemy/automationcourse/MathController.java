package com.learningspring.online.LearnSpringBoot.Udemy.automationcourse;

import com.learningspring.online.LearnSpringBoot.Udemy.automationcourse.pojo.CalciResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add/{n1}/{n2}")
    public CalciResponse add(@PathVariable int n1, @PathVariable int n2){
        return new CalciResponse(n1,n2);
    }
}
