package service.user;

import bean.user.MstMember;

import java.util.List;

/**
 * @author raojing
 * @date 2019/7/31 11:35
 */
public interface MstMemberService {
    
    List<MstMember> findUser();
    
}
