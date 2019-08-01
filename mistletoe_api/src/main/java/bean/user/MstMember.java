package bean.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MstMember implements Serializable {
    
    private Integer id;

    private String memberNo;

    private String nickName;

    private Byte gender;

    private String phone;

    private String avatar;

    private String password;

    private Byte useStatus;

    private Byte deleteStatus;

    private String remark;

    private Integer memberLoginNum;

    private String memberLoginIp;

    private String memberOldLoginIp;

    private Integer memberLoginTime;

    private Integer memberOldLoginTime;

    private Integer birthday;

    private Integer createTime;

    private Integer updateTime;

    private static final long serialVersionUID = 1L;

}