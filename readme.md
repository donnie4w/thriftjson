**让thrift兼容原生json数据调用的部分解决方案**
<br/>通常使用thrift时，服务端与客户端都依赖thrift提供的方法，有一些场景没办法直接引入thrift提供的文件，只能使用如 json之类格式传输，可能导致之前的thrift接口需要修改来支持。
<br/>这里使用服务端采用java编写，与客户端也是采用了thrift协议调用，同时我做了一些封装来支持原生json调用。

**1. 先看看使用场景**

<br/>		struct  UserInfo {
<br/>			1: optional string   name; 
<br/>			2: optional i32 	 age; 	   
<br/>		}
<br/>		service Services{
<br/>            UserInfo   blntest(1:UserInfo ui)
<br/>        }		
		
<br/>		客户端调用blntest方法时需要能发送对应的json数据如： {"name":"wxd","age":19}  ，服务端不修改原来的thrift实现，并能正常解析json数据调用blntest并返回json数据。
		
**2. 思路：**

<br/>1)：{"name":"wxd","age":19}转为对应的UserInfo请求对象。
<br/>2)：利用thrift 提供的TServiceClient 调用 blntest 方法，这里只需将原来的远程调用修改一下，也就是修改不做远程调用，直接把流对接到服务端的输入输出流。
<br/>3)：返回数据UserInfo转为json数据。
				
				
**3. 讲解：**
<br/>1与3 这一步相对简单，很多第三方json工具都能做到。
<br/>主要修改点在是第二点：在service生成的client类中，有send_*** 方法，如blntest方法，客户需要调用 send_blntest方法发送请求数据，所以获取send_***方法输出的数据，
作为服务端process的输入流数据。
service中有***__result类 用在process返回数据后读取返回的数据。