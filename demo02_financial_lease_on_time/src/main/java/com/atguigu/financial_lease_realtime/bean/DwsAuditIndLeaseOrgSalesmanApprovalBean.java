package com.atguigu.financial_lease_realtime.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DwsAuditIndLeaseOrgSalesmanApprovalBean {
    // 窗口起始时间
    String stt;

    // 窗口结束时间
    String edt;

    // 当天日期
    String curDate;

    // 业务方向
    String leaseOrganization;

    // 三级行业 ID
    String industry3Id;

    // 三级行业名称
    String industry3Name;

    // 二级行业 ID
    String industry2Id;

    // 二级行业名称
    String industry2Name;

    // 一级行业 ID
    String industry1Id;

    // 一级行业名称
    String industry1Name;

    // 业务经办 ID
    String salesmanId;

    // 业务经办姓名
    String salesmanName;

    // 三级部门 ID
    String department3Id;

    // 三级部门名称
    String department3Name;

    // 二级部门 ID
    String department2Id;

    // 二级部门名称
    String department2Name;

    // 一级部门 ID
    String department1Id;

    // 一级部门名称
    String department1Name;

    // 申请项目数
    Long applyCount;

    // 申请金额
    BigDecimal applyAmount;

    // 批复金额
    BigDecimal replyAmount;

    // 通过时间 yyyy-MM-dd HH:mm:ss.SSSSSS
    @TransientSink  // 自定义注解
    String approveTime;

    // String,long的转换
    public Long getTs() {
        return DateFormatUtil.toTs(approveTime);
    }

}
