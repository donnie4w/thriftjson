namespace java com.bln.tf.protocol

/**分页对象*/
struct BlnPageBean {
/**每页条数*/
1: optional  i32			 rowNumber;  
/**最后条数标识*/       
2: optional  i32			 lastFlagInt;
/**最后条数标识*/
3: optional  string			 lastFlagStr;
/**最后条数标识2*/       
4: optional  i32			 lastFlagInt2;
/**最后条数标识*/
5: optional  string			 lastFlagStr2;
/**页码*/
6: optional  i32			 pageNumber;
}

/**头信息*/
struct  BlnHeadBean {
/**分页*/
1: optional BlnPageBean   page;
/**设备信息*/
2: optional string device;        
/**平台  1android 2ios 3微信公众号 */
3: optional i16    platform;      
/**版本  客户端版本*/
4: optional string version;    	  
/**渠道*/
5: optional string chl;   
}

/**返回ack对象*/
struct  BlnAckBean {
/**分页*/
1: optional BlnPageBean   page; 
/** 状态，400错误  200成功*/
2: optional i32 	 status;  
/**状态码**/            
3: optional string   ackCode;           
/**状态描述*/  
4: optional string   ackDesc;   
/**拓展字段*/
5: optional map<string,string>   extramap;  	   
}

/*********************************************************************************/
/**测试请求*/
struct  BlnTestBeanReq {
/**头信息 (固定)*/
1: optional BlnHeadBean hb;        
/** string */
2: optional  string    s;      
/** int */
3: optional i32 i;    	 
/** list*/
4: optional list<string> ls;
}
/**测试结果返回 */
struct  BlnTestResult{
/**ack  (固定)*/
1: optional BlnAckBean ack;        
/** string */
2: optional string  s;      
/** int */
3: optional i32 i;
/** list*/
4: optional list<string> ls;          
}
/*********************************************************************************/
/*********************************************************************************/
service IBlnServices{
/** 测试 */
BlnTestResult   blntest(1:BlnTestBeanReq btb)
}