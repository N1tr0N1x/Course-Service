package com.eler.ms.course.CourseService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import com.eler.ms.course.CourseService.Model.Module;
import com.eler.ms.course.CourseService.Repository.ModuleRepository;
@Service
public class CourseService {

	@Autowired
	private ModuleRepository repo;
	
	public List<Module> listAll() {
		return repo.findAll();
	}
	
	public Module save(Module module) {
		repo.save(module);
		return module;
	}
	
	public Module get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
