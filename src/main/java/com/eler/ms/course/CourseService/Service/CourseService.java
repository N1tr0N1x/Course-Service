package com.eler.ms.course.CourseService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public List<Module> getModulesByEmailCours(String email) {
		return repo.findAllByEmailEnsCours(email);
	}
	
	public List<Module> getModulesByEmailTd(String email) {
		return repo.findAllByEmailEnsTd(email);
	}
	
	public List<Module> getModulesByEmailTp(String email) {
		return repo.findAllByEmailEnsTp(email);
	}
	public List<File> listAllFiles() {
		return repo1.findAll();
	}
	
	public File saveFile(File file) {
		repo1.save(file);
		return file;
	}
	
	public File getFile(long id) {
		return repo1.findById(id).get();
	}
	
	public void deleteFile(long id) {
		repo1.deleteById(id);
	}
	public List<File> getFilesByEmailTp(Long moduleID) {
		return repo1.findAllByModuleID(moduleID);
	}
}
