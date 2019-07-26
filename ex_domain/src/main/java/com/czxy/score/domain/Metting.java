package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * CREATE TABLE `tab_metting` (
 *   `metting_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 *   `metting_name` VARCHAR(30) DEFAULT NULL COMMENT '会议名称',
 *   `metting_size` INT(11) DEFAULT NULL COMMENT '预计参会人数',
 *   `metting_starttime` DATETIME DEFAULT NULL COMMENT '会议开始时间',
 *   `metting_endtime` DATETIME DEFAULT NULL COMMENT '会议结束时间',
 *   `metting_ordertime` DATETIME DEFAULT NULL COMMENT '会议预定时间',
 *   `remark` VARCHAR(200) DEFAULT NULL COMMENT '会议说明',
 *   `status` VARCHAR(10) DEFAULT NULL COMMENT '会议状态',
 *   `username` VARCHAR(30) DEFAULT NULL COMMENT '预定者',
 *   `room_id` INT(11) DEFAULT NULL COMMENT '会议室ID',
 *   PRIMARY KEY (`metting_id`)
 * ) ENGINE=INNODB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
 */
@Table(name = "tab_metting")
@Entity
public class Metting {
    private Integer metting_id;
    private String metting_name;
    private Integer metting_size;
    private Date metting_starttime;
    private Date metting_endtime;
    private Date metting_ordertime;
    private String remark;
    private String status;
    private String username;
    private Integer room_id;
    private  Room room;
    private User user;

    public Metting() {
    }

    public Metting(Integer metting_id, String metting_name, Integer metting_size, Date metting_starttime, Date metting_endtime, Date metting_ordertime, String remark, String status, String username, Integer room_id, Room room, User user) {
        this.metting_id = metting_id;
        this.metting_name = metting_name;
        this.metting_size = metting_size;
        this.metting_starttime = metting_starttime;
        this.metting_endtime = metting_endtime;
        this.metting_ordertime = metting_ordertime;
        this.remark = remark;
        this.status = status;
        this.username = username;
        this.room_id = room_id;
        this.room = room;
        this.user = user;
    }

    public Integer getMetting_id() {
        return metting_id;
    }

    public void setMetting_id(Integer metting_id) {
        this.metting_id = metting_id;
    }

    public String getMetting_name() {
        return metting_name;
    }

    public void setMetting_name(String metting_name) {
        this.metting_name = metting_name;
    }

    public Integer getMetting_size() {
        return metting_size;
    }

    public void setMetting_size(Integer metting_size) {
        this.metting_size = metting_size;
    }

    public Date getMetting_starttime() {
        return metting_starttime;
    }

    public void setMetting_starttime(Date metting_starttime) {
        this.metting_starttime = metting_starttime;
    }

    public Date getMetting_endtime() {
        return metting_endtime;
    }

    public void setMetting_endtime(Date metting_endtime) {
        this.metting_endtime = metting_endtime;
    }

    public Date getMetting_ordertime() {
        return metting_ordertime;
    }

    public void setMetting_ordertime(Date metting_ordertime) {
        this.metting_ordertime = metting_ordertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Metting{" +
                "metting_id=" + metting_id +
                ", metting_name='" + metting_name + '\'' +
                ", metting_size=" + metting_size +
                ", metting_starttime=" + metting_starttime +
                ", metting_endtime=" + metting_endtime +
                ", metting_ordertime=" + metting_ordertime +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", room_id=" + room_id +
                ", room=" + room +
                ", user=" + user +
                '}';
    }
}
