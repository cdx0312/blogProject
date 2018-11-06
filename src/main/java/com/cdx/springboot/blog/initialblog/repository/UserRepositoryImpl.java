package com.cdx.springboot.blog.initialblog.repository;

import com.cdx.springboot.blog.initialblog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: initialblog
 * @author: cdx
 * @create: 2018-11-04 21:20
 **/
@Repository
public class UserRepositoryImpl implements UserRepository{

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<Long, User> maps = new ConcurrentHashMap<>();

    public UserRepositoryImpl() {
        User user = new User();
        user.setAge(12);
        user.setName("JackyLove");
        this.saveOrUpdateUser(user);
    }

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        if (id <= 0) {
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.maps.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.maps.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.maps.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList<>(this.maps.values());
    }
}
