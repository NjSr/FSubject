package com.czxy.score.service;

import com.czxy.score.domain.Metting;

import java.util.List;

public interface MettingService {

    public List<Metting> findAllByUserName(String username);

    public Metting selectById(Integer metting_id);

    public Metting selectByMeetinName(String metting_name);

    public List<Metting> selectByDate(String starttime , String endtime , String username);
}
