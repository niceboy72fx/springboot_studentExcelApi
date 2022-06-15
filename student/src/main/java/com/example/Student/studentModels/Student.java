package com.example.Student.studentModels;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="student")
@Getter
@Setter
@ToString
public class Student {
    @Id
     // cai nay dung hibernate
    private Long Stt;
    private String school,address,IdStudent,Grade,Name;
    private Date BirthDate;
    private String Gender,Province,dan_toc,Address_live,phone_num;

    private double class1,class2,class3,class4,class5 , total5years;
    private double priorityPoint = 0.0;
    private double totalPoint;
    private String Note;



    public Student(Long stt, String school, String address, String idStudent, String Grade, String name, Date birthDate, String gender, String province, String dan_toc, String address_live, String phone_num, double class1, double class2, double class3, double class4, double class5, double total5years, double priorityPoint, double totalPoint, String note) {
        Stt = stt;
        this.school = school;
        this.address = address;
        IdStudent = idStudent;
        this.Grade = Grade;
        Name = name;
        BirthDate = birthDate;
        Gender = gender;
        Province = province;
        this.dan_toc = dan_toc;
        Address_live = address_live;
        this.phone_num = phone_num;
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
        this.class4 = class4;
        this.class5 = class5;
        this.total5years = total5years;
        this.priorityPoint = priorityPoint;
        this.totalPoint = totalPoint;
        Note = note;
    }

    public Student() {
    }

}
