package com.cdx.springboot.blog.initialblog.repository;

import com.cdx.springboot.blog.initialblog.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: initialblog
 * @author: cdx
 * @create: 2018-11-04 21:18
 **/
public interface UserRepository extends CrudRepository<User, Long> {
}
