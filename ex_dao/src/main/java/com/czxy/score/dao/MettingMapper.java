package com.czxy.score.dao;

import com.czxy.score.domain.Metting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MettingMapper extends Mapper<Metting> {
    @Select("select * from tab_metting where username = #{username}")
    public List<Metting> findAllByUserName(@Param("username") String username);

    @Select("SELECT * FROM tab_metting  ,tab_user_metting, tab_user  WHERE tab_user_metting.metting_id=tab_metting.metting_id AND tab_user.user_id = tab_user_metting.user_id AND tab_metting.metting_name='招聘会'")
    public Metting findByMettingName (String metting_name);

    @Select("SELECT * FROM tab_metting WHERE metting_starttime >=#{starttime} AND metting_endtime <=#{endtime}  and username = #{username}")
    public List<Metting> findByDate(@Param("starttime") String starttime  , @Param("endtime") String endtime ,@Param("username") String username);
}
