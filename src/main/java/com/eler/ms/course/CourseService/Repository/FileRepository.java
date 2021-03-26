package com.eler.ms.course.CourseService.Repository;

import java.util.List;

import com.eler.ms.course.CourseService.Model.MyFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepository extends JpaRepository<MyFile,Long> {
    List<MyFile> findAllByModuleID(Long moduleID);
}
