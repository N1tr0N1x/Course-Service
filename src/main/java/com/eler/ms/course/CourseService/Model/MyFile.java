package com.eler.ms.course.CourseService.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import java.util.Date;
import javax.persistence.Table;
//import org.hibernate.annotations.Entity;


@Entity
//@org.hibernate.annotations.Entity(dynamicInsert = true, dynamicUpdate = true)
@Table(name = "Files")
public class MyFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idFile")
    private long idFile;

    @Column(name = "title")
    private String title;

    @Column(name = "moduleID")
    private Long moduleID;

    @Column(name = "teacher_email")
    private String teacher_email;

    @Column(name = "description")
    private String description;

    @Column(name = "link")
    private String link;

    @CreatedDate
    @Column(name = "createdDate")
    private Date createdDate;
    
     public long getIdFile() {
        return idFile;
    }

    public void setIdFile(long idFile) {
        this.idFile = idFile;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setModuleID(Long moduleID) {
        this.moduleID = moduleID;
    }

    public Long getModuleID() {
        return moduleID;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacher_email = teacherEmail;
    }

    public String getTeacherEmail() {
        return teacher_email;
    }
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

      public String getLink(){
        return link;
    }

    public void setLink(String link){
        this.link=link;
    }

      public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate=createdDate;
    }

    public MyFile() {
    }

    public MyFile(long idFile, String title, Long moduleID, String teacher_email, String description, String link,
     Date createdDate){
        super();
        this.idFile = idFile;
        this.title = title;
        this.moduleID = moduleID;
        this.teacher_email = teacher_email;
        this.description = description;
        this.link = link;
        this.createdDate = createdDate;
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String teacher_email) {
        this.teacher_email = teacher_email;
    }

    
}
