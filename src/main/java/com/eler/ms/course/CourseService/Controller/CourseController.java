package com.eler.ms.course.CourseService.Controller;
import java.util.*;
import java.util.stream.*;
import com.google.gson.*;
import com.eler.ms.course.CourseService.Model.Module;
import com.eler.ms.course.CourseService.Service.CourseService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import javax.ws.rs.core.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mod")
public class CourseController {
    
    @Autowired
    CourseService course;

    @RequestMapping(value = "/save", method = RequestMethod.POST,headers = "Accept=application/json")
    @ResponseBody
	public String saveModule(@RequestBody Module module) {
	Module m=course.save(module);
	List<Module> modules = course.listAll();
    String json = new Gson().toJson(modules);
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.postForObject("http://localhost:8086/main/modindex/",json, String.class);
}
    @GetMapping(value = "/editpage/{id}")
    @ResponseBody
    public String EditPage(@PathVariable("id") int id){
        Module mod= course.get(id);
        String json = new Gson().toJson(mod);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8086/main/modeditpage/",json,String.class);
    }
    @GetMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String deleteModule(@PathVariable("id") int id) {
    course.delete(id);
    List<Module> modules = course.listAll();
    String json = new Gson().toJson(modules);
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.postForObject("http://localhost:8086/main/modindex/",json, String.class);
}


	/*HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
    HttpEntity<String> entity = new HttpEntity<String>(headers);
	
	
	HttpEntity<Object> requestEntity = new HttpEntity<Object>(modules,headers);
    //ResponseEntity<Foo> response = restTemplate.postForObject("http://localhost:8086/main/modindex/",modules, List<Module>.class);
    ResponseEntity<List<Module>> rateResponse = restTemplate.exchange("http://localhost:8086/main/modindex/", HttpMethod.POST, requestEntity,new ParameterizedTypeReference<List<Module>>() {});
*/

    /*ResponseEntity<Object[]> responseEntity =
   restTemplate.getForEntity("http://localhost:8086/main/modindex/", Object[].class);*/
   //RestTemplate restTemplate = new RestTemplate();
   //return restTemplate.
   /*ResponseEntity<List<Module>> modResponse =
        restTemplate.exchange("http://localhost:8086/main/modindex/",
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Module>>() {
            });*/
    
    // standard constructor and getter/setter
}
