package org.java;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.dao.InfoMapper;
import org.java.entity.Info;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = SpringbootTkmybatisApplication.class)
@RunWith(SpringRunner.class)
@Transactional
public class SpringbootTkmybatisApplicationTests {

    @Autowired
    private InfoMapper infoMapper;

    @Test
    public void findAll() {
        List<Info> list = infoMapper.selectAll();
        for(Info f:list){
            System.out.println(f);
        }
    }
    @Test
    public void findPage(){
        PageHelper.startPage(2,5 );
        PageInfo<Info> pageInfo = new PageInfo<>(infoMapper.selectAll());
        List<Info> list = pageInfo.getList();
        for(Info f:list){
            System.out.println(f);
        }
    }

}
