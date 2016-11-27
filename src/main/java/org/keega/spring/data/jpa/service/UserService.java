package org.keega.spring.data.jpa.service;

import org.keega.spring.data.jpa.dao.IUserDao;
import org.keega.spring.data.jpa.model.User;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by zun.wei on 2016/10/6.
 * To change this template use File|Default Setting
 * |Editor|File and Code Templates|Includes|File Header
 */
@Service("userService")
@Transactional(readOnly = true)
public class UserService implements IUserService {

    @Inject
    private IUserDao userDao;

    @Override
    public void saveUser(User user) {
        this.userDao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        this.userDao.delete(id);
    }

    @Override
    public List<User> findAllUsers() {
        return this.userDao.findAll();
    }

    @Override
    public User findOneUser(Long id) {
        return this.userDao.findOne(id);
    }

    @Override
    public Page<User> findAllUserByPage(PageRequest page) {
        return this.userDao.findAll(page);
    }

    @Override
    public User findUserByUsername(String userName) {
        return this.userDao.findUserByUsername(userName);
    }

    @Override
    public List<User> findUsersByUserNameLike(String userName) {
        return this.userDao.findUsersByUsernameLike(userName);
    }
}
