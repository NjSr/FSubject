package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 CREATE TABLE `tab_dept` (
 `dept_id` INT(11) NOT NULL AUTO_INCREMENT,
 `dept_name` VARCHAR(20) DEFAULT NULL,
 PRIMARY KEY (`dept_id`)
 ) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
 */
@Table(name = "tab_dept")
@Entity
public class Dept {
    private Integer dept_id;
    private String dept_name;

    public Dept() {
    }

    public Dept(Integer dept_id, String dept_name) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                '}';
    }
}
