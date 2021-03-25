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

    @GetMapping(value = "/modules/{email}/cours")
    @ResponseBody
    public String getModulesByEmailCours(@PathVariable("email") String email) {
        List<Module> modules = course.getModulesByEmailCours(email);
        String json = new Gson().toJson(modules);
        return json;
    }

    @GetMapping(value = "/modules/{email}/td")
    @ResponseBody
    public String getModulesByEmailTd(@PathVariable("email") String email) {
        List<Module> modules = course.getModulesByEmailTd(email);
        String json = new Gson().toJson(modules);
        return json;
    }

    @GetMapping(value = "/modules/{email}/tp")
    @ResponseBody
    public String getModulesByEmailTp(@PathVariable("email") String email) {
        List<Module> modules = course.getModulesByEmailTp(email);
        String json = new Gson().toJson(modules);
        return json;
    }
}
