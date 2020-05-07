package com.jinhaoxun.mpmultipledatasources.mapper.db1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jinhaoxun.mpmultipledatasources.entity.Test;
import com.jinhaoxun.mpmultipledatasources.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jinhaoxun
 * @since 2020-02-13
 */
public interface TestMapper extends BaseMapper<User> {

    /**
     * @Author: jinhaoxun
     * @Description:
     * @param name 姓名
     * @Date: 2020/2/13 下午12:06
     * @Return: com.jinhaoxun.mybatisplusdemo.entity.User
     * @Throws:
     */
    Test selectByName(String name);

}