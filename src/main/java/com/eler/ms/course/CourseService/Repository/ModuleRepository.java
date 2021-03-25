package com.eler.ms.course.CourseService.Repository;

import java.util.List;

import com.eler.ms.course.CourseService.Model.Module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModuleRepository extends JpaRepository<Module,Long> {
    List<Module> findAllByEmailEnsCours(String emailEnsCours);
    
    List<Module> findAllByEmailEnsTp(String emailEnsTp);
    
    List<Module> findAllByEmailEnsTd(String emailEnsTd);
}
