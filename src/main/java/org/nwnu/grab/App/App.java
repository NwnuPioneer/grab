package org.nwnu.grab.App;

import org.apache.log4j.Logger;
import org.nwnu.grab.client.DyBulletScreenClient;
import org.nwnu.grab.domain.UserFans;
import org.nwnu.grab.repository.SysContentRepository;
import org.nwnu.grab.repository.UserAnchorRepository;
import org.nwnu.grab.repository.UserFansRepository;
import org.nwnu.grab.utils.KeepAlive;
import org.nwnu.grab.utils.KeepGetMsg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = Logger.getLogger(App.class);
	
	//设置需要访问的房间ID信息
	private static final int roomId = 520;//606118    301712 71017 288016  122402周星驰 96291大鹌鹑 520啊冷
	//弹幕池分组号，海量模式使用-9999
	private static final int groupId = -9999;
	
    public static void main( String[] args )
    {
        
		//初始化弹幕Client
        DyBulletScreenClient danmuClient = DyBulletScreenClient.getInstance();
        //设置需要连接和访问的房间ID，以及弹幕池分组号
        danmuClient.init(roomId, groupId);
        
        //保持弹幕服务器心跳
        KeepAlive keepAlive = new KeepAlive();
        keepAlive.start();
        
        //获取弹幕服务器发送的所有信息
        KeepGetMsg keepGetMsg = new KeepGetMsg();
        keepGetMsg.start();
    }
}
