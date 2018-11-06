package com.cdx.springboot.blog.initialblog.themeleaf.repository;

import com.cdx.springboot.blog.initialblog.themeleaf.domain.User;

import java.util.List;

/**
 * @program: initialblog
 * @author: cdx
 * @create: 2018-11-04 21:18
 **/
public interface UserRepository {
    /**
     * 新增或修改用戶
     * @param user 用戶
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 根据用户ID删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     *  根据用户ID获取数据
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有的用户的列表
     * @return
     */
    List<User> listUser();

}
