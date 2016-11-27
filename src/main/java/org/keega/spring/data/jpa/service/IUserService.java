package org.keega.spring.data.jpa.service;

import org.keega.spring.data.jpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by zun.wei on 2016/10/6.
 * To change this template use File|Default Setting
 * |Editor|File and Code Templates|Includes|File Header
 */
public interface IUserService {
    public void saveUser(User user);

    public void deleteUser(Long id);

    public List<User> findAllUsers();

    public User findOneUser(Long id);

    /**
     * 分页
     *
     * @param page 是spring自己封装的请求分页类，实现了Pageable接口，包涵从请求中获得的分页属性（当前页和大小）和获取方法
     * @return 通过调用分页方法，返回一个Page<>一个泛型集合的分页对象，里面包涵了通过查询计算出的各个属性和结果集
     */
    public Page<User> findAllUserByPage(PageRequest page);

    public User findUserByUsername(String userName);

    public List<User> findUsersByUserNameLike(String userName);
}
