package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CREATE TABLE `tab_room` (
 *   `room_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 *   `room_num` VARCHAR(20) DEFAULT NULL COMMENT '门牌号',
 *   `room_name` VARCHAR(20) DEFAULT NULL COMMENT '会议室名称',
 *   `room_size` INT(11) DEFAULT NULL COMMENT '会议室大小',
 *   `room_status` VARCHAR(10) DEFAULT NULL COMMENT '会议室状态',
 *   `remark` VARCHAR(500) DEFAULT NULL COMMENT '备注',
 *   PRIMARY KEY (`room_id`)
 * ) ENGINE=INNODB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
 */
@Table(name = "tab_room")
@Entity
public class Room {
    @Id
    private Integer room_id;
    private String room_num;
    private String room_name;
    private Integer room_size;
    private String room_status;
    private String remark;

    public Room() {
    }

    public Room(Integer room_id, String room_num, String room_name, Integer room_size, String room_status, String remark) {
        this.room_id = room_id;
        this.room_num = room_num;
        this.room_name = room_name;
        this.room_size = room_size;
        this.room_status = room_status;
        this.remark = remark;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public Integer getRoom_size() {
        return room_size;
    }

    public void setRoom_size(Integer room_size) {
        this.room_size = room_size;
    }

    public String getRoom_status() {
        return room_status;
    }

    public void setRoom_status(String room_status) {
        this.room_status = room_status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Room{" +
                "room_id=" + room_id +
                ", room_num='" + room_num + '\'' +
                ", room_name='" + room_name + '\'' +
                ", room_size=" + room_size +
                ", room_status='" + room_status + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
