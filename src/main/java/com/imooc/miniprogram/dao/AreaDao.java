package com.imooc.miniprogram.dao;

import com.imooc.miniprogram.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: miniprogram
 * User: quent
 * Date: 2018/12/7
 * Time: 15:32
 */
@Mapper
public interface AreaDao {

    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int deleteArea(int areaId);
    int updateArea(Area area);
}
