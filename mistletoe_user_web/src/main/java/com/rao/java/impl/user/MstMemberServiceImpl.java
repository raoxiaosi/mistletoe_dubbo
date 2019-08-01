package com.rao.java.impl.user;

import bean.user.MstMember;
import com.rao.java.dao.user.MstMemberDao;
import org.springframework.stereotype.Service;
import service.user.MstMemberService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author raojing
 * @date 2019/7/31 11:35
 */
@Service
public class MstMemberServiceImpl implements MstMemberService {
    
    @Resource
    private MstMemberDao mstMemberDao;
    
    @Override
    public List<MstMember> findUser() {
        return mstMemberDao.listAllUser();
    }
}
