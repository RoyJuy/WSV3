package io.swagger.mybatis.dao;

import io.swagger.mybatis.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKeyWithBLOBs(Account record);

    int updateByPrimaryKey(Account record);
}