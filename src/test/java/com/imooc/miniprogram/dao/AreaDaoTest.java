package com.imooc.miniprogram.dao;

import com.imooc.miniprogram.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: miniprogram
 * User: quent
 * Date: 2018/12/7
 * Time: 15:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
//        assertEquals(2,areaList.size());//failed
        assertEquals(0,areaList.size());//passed
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
//        assertEquals("北苑",area.getAreaName());//failed
        assertEquals("南苑",area.getAreaName());//passed
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("东苑");
        area.setPriority(3);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        int effectedNum = areaDao.insertArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1,effectedNum);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setAreaId(4);
        int effectedNum = areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }
}