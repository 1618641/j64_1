package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: 马果
 * @Date: 2019/12/2 16:32
 * @Description:通用的Mapper接口，这个接口不能被spring扫描到,如果扫描到会出错，所以，该接口不能放到org.java包中
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
