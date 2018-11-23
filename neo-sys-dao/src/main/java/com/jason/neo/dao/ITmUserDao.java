package com.jason.neo.dao;

import com.jason.neo.dao.dto.TmUser;

public interface ITmUserDao {
    TmUser selectByPrimaryKey(String idNo);

    int insert(TmUser record);
}
