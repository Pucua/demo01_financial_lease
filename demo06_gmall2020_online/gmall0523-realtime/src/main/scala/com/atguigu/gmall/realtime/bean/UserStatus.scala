package com.atguigu.gmall.realtime.bean

/**
 * @author : Pucua
 * @date : 2023-10-12 22:31
 * @Desc :  用于映射用户状态表的样例类
 **/
case class UserStatus(
                       userId:String, //用户 id
                       ifConsumed:String //是否消费过 0 首单 1 非首单
                     )
