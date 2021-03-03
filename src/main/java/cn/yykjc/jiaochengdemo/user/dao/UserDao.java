package cn.yykjc.jiaochengdemo.user.dao;

import cn.yykjc.jiaochengdemo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);

    void delById(Integer id);

    public void save(UserEntity userEntity);
}
