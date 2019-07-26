package com.czxy.score.service.impl;

import com.czxy.score.dao.MettingMapper;
import com.czxy.score.dao.RoomMapper;
import com.czxy.score.domain.Metting;
import com.czxy.score.service.MettingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.swing.text.EditorKit;
import java.util.List;

@Service
@Transactional
public class MettingServiceImpl implements MettingService {

    @Resource
    private MettingMapper mettingMapper;

    @Resource
    private RoomMapper roomMapper;


    @Override
    public List<Metting> findAllByUserName(String  username) {
        List<Metting> list = mettingMapper.findAllByUserName(username);
        for (Metting m : list) {
            m.setRoom(roomMapper.selectByPrimaryKey(m.getRoom_id()));
        }
        return list;
    }

    @Override
    public Metting selectById(Integer metting_id) {
        return mettingMapper.selectByPrimaryKey(metting_id);
    }

    @Override
    public Metting selectByMeetinName(String metting_name) {
        Metting metting = mettingMapper.findByMettingName(metting_name);
        return metting;
    }

    @Override
    public List<Metting> selectByDate(String starttime, String endtime , String username) {
        List<Metting> list = mettingMapper.findByDate(starttime, endtime,username);
        for (Metting m : list) {
            m.setRoom(roomMapper.selectByPrimaryKey(m.getRoom_id()));
        }
        return list;
    }

}
