package com.eler.ms.course.CourseService.Repository;

import com.eler.ms.course.CourseService.Model.Module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Long> {

}
