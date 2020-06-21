package com.huhu.mall.mbg.mapper;

import com.huhu.mall.MallTestBase;
import com.huhu.mall.mbg.model.PmsBrand;
import com.huhu.mall.mbg.model.PmsBrandExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class PmsBrandMapperTest extends MallTestBase {

    @Autowired
    private PmsBrandMapper brandMapper;

    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
        int count = brandMapper.insertSelective(new PmsBrand());
        System.out.println(count);
    }

    @Test
    public void selectByExampleWithBLOBs() {
    }

    @Test
    public void selectByExample() {
        List<PmsBrand> pmsBrands = brandMapper.selectByExample(new PmsBrandExample());
        System.out.println(pmsBrands);
    }

    @Test
    public void selectByPrimaryKey() {
        PmsBrand pmsBrand = brandMapper.selectByPrimaryKey(new Long(2));
        System.out.println(pmsBrand);
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExampleWithBLOBs() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKeyWithBLOBs() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}