package com.eler.ms.course.CourseService.Repository;

import java.util.List;

import com.eler.ms.course.CourseService.Model.File;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<File,Long> {
    List<File> findAllByModuleID(Long moduleID);
}
