package com.rao.java.dao.user;

import bean.user.MstMember;

import java.util.List;

public interface MstMemberDao {
    
    int deleteByPrimaryKey(Integer id);

    int insert(MstMember record);

    int insertSelective(MstMember record);

    MstMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MstMember record);

    int updateByPrimaryKey(MstMember record);

    
    List<MstMember> listAllUser();
    
}