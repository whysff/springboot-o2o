package io.whysff.o2o.dao;


import io.whysff.o2o.entity.Area;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;



/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/12
 */

@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        System.out.println("areaListsize = " + areaList.size());
    }
}
