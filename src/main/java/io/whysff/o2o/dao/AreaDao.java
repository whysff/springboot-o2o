package io.whysff.o2o.dao;

import io.whysff.o2o.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/12
 */
@Repository
public interface AreaDao {

    /**
     * 返回区域列表
     * @return areaList
     */
    List<Area> queryArea();
}
