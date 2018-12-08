package com.imooc.miniprogram.service;

import com.imooc.miniprogram.entity.Area;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: miniprogram
 * User: quent
 * Date: 2018/12/7
 * Time: 21:32
 */
public interface AreaService {

    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean deleteArea(int areaId);
    boolean modifyArea(Area area);
}
