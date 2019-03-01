package cn.ulegal.seed.base;

import tk.mybatis.mapper.common.*;

/**
 * 自定义mapper接口，继承tk.mybatis.common.Mapper
 *
 * @author dazzlzy
 * @date 2018/4/1
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
