package com.rao.java.controller.user;

import bean.user.MstMember;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.user.MstMemberService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author raojing
 * @date 2019/7/31 11:35
 */
@RestController
@RequestMapping("/api/member")
public class MstMemberController {
    
    @Resource
    private MstMemberService mstMemberService;
    
    @GetMapping("/find_user")
    public String findUser(){
        List<MstMember> memberList = mstMemberService.findUser();
        return JSON.toJSONString(memberList);
    }
}
