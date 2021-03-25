package com.eler.ms.course.CourseService.Controller;
import java.util.*;
import com.google.gson.*;
import com.eler.ms.course.CourseService.Model.File;
import com.eler.ms.course.CourseService.Service.CourseService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class CourseControllerFiles {
    
    @Autowired
    CourseService course;

    //@RequestMapping(value = "/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @PostMapping("/save")
	public void saveFile(@RequestBody File file) {
	    course.saveFile(module);
    }

}
