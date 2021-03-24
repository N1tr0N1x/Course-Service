package com.eler.ms.course.CourseService.Controller;
import java.util.*;
import com.google.gson.*;
import com.eler.ms.course.CourseService.Model.Module;
import com.eler.ms.course.CourseService.Service.CourseService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mod")
public class CourseController {
    
    @Autowired
    CourseService course;

    @RequestMapping(value = "/save", method = RequestMethod.POST,headers = "Accept=application/json")
	public void saveModule(@RequestBody Module module) {
	    course.save(module);
    }

    @GetMapping(value = "/getModule/{id}")
    @ResponseBody
    public Module getModule(@PathVariable("id") int id){
        return course.get(id);
    }

    @GetMapping(value = "/modules")
    @ResponseBody
    public String getAllModules() {
        List<Module> modules = course.listAll();
        String json = new Gson().toJson(modules);
        return json;
    }

    @GetMapping(value = "/delete/{id}")
    @ResponseBody
    public void deleteModule(@PathVariable("id") int id) {
        course.delete(id);
    }
}
