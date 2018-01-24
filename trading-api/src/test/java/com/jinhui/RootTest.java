package com.jinhui;

import com.jinhui.entity.ChnInfo;
import com.jinhui.mapper.ChnInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.jinhui.mapper")//扫描Mapper接口
@SpringBootApplication
public class RootTest {



    @Autowired
    private ChnInfoMapper chnInfoMapper;



    @Test
    public void test1() {
        ChnInfo info = chnInfoMapper.selectByPrimaryKey(1);
        System.out.println(info);


    }

}