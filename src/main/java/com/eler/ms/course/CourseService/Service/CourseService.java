package com.eler.ms.course.CourseService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eler.ms.course.CourseService.Model.MyFile;
import com.eler.ms.course.CourseService.Model.Module;
import com.eler.ms.course.CourseService.Repository.FileRepository;
import com.eler.ms.course.CourseService.Repository.ModuleRepository;
@Service
public class CourseService {

	@Autowired
	private ModuleRepository repo;

	@Autowired
	private FileRepository repo1;
	
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
	public List<MyFile> listAllFiles() {
		return repo1.findAll();
	}
	
	public MyFile saveFile(MyFile file) {
		repo1.save(file);
		return file;
	}
	
	public MyFile getFile(long id) {
		return repo1.findById(id).get();
	}
	
	public void deleteFile(long id) {
		repo1.deleteById(id);
	}
	public List<MyFile> getFilesByModuleId(Long moduleID) {
		return repo1.findAllByModuleID(moduleID);
	}
}
