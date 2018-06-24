package org.nwnu.grab.client;

import java.util.Map;

import org.nwnu.grab.domain.SysContent;
import org.nwnu.grab.domain.UserFans;
import org.nwnu.grab.repository.SysContentRepository;
import org.nwnu.grab.repository.UserAnchorRepository;
import org.nwnu.grab.repository.UserFansRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 * 弹幕批处理类
 * @author dusk
 *
 */
public class BatchInsert {
	
	private static BatchInsert instance;
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-new.xml");
	UserFansRepository userFansRepository = ctx.getBean(UserFansRepository.class);
	UserAnchorRepository userAnchorRepository = ctx.getBean(UserAnchorRepository.class);
	SysContentRepository sysContentRepository = ctx.getBean(SysContentRepository.class);
	
    public BatchInsert(){}
    
    /**
     * 单例获取方法，客户端单例模式访问
     * @return
     */
    public static BatchInsert getInstance(){
    	if(null == instance){
    		instance = new BatchInsert();
    	}
    	return instance;
    }
    /**
	 * 单个处理弹幕
	 * @param msg
	 */
    public void insert(Map<String, Object> msg){
		//判断消息类型
		if(msg.get("type").equals("chatmsg")){//弹幕消息

/*			Integer temp=Integer.parseInt(msg.get("uid").toString());
			System.out.println("*****************"+temp);
			UserFans fans=userFansRepository.findByUid(temp);
			System.out.println("*****************"+fans);
			if(userFansRepository.findByUid(temp)==null){*/
				//{
	    		UserFans uFans=new UserFans();
	    		Integer temp=Integer.parseInt(msg.get("uid").toString());
	    		uFans.setUid(temp);
	    		uFans.setNamme((String) msg.get("nn"));
	    		uFans.setBnn((String) msg.get("bnn"));
	    		Integer temp1=Integer.parseInt(msg.get("level").toString());
	    		uFans.setLevel(temp1);
	    		userFansRepository.save(uFans);
	    	//}
	   
			SysContent sysContent=new SysContent();
			sysContent.setFid((Integer) msg.get("uid"));
			sysContent.setPid((Integer) msg.get("rid"));
			sysContent.setTxt((String) msg.get("txt"));
			sysContent.setType((String) msg.get("type"));
			sysContentRepository.save(sysContent);
		} else if(msg.get("type").equals("dgb")){//赠送礼物信息
/*			Integer temp=Integer.parseInt(msg.get("uid").toString());
			System.out.println("*****************"+temp);
			UserFans fans=userFansRepository.findByUid(temp);
			System.out.println("*****************"+fans);
			
			
			if(userFansRepository.findByUid(temp)==null){*/
	    		UserFans uFans=new UserFans();
	    		Integer temp=Integer.parseInt(msg.get("uid").toString());
	    		uFans.setUid(temp);
	    		uFans.setNamme((String) msg.get("nn"));
	    		uFans.setBnn((String) msg.get("bnn"));
	    		Integer temp1=Integer.parseInt(msg.get("level").toString());
	    		uFans.setLevel(temp1);
	    		System.out.println("*****"+uFans.getBnn());
	    		userFansRepository.save(uFans);
	    	//}
	
			SysContent sysContent=new SysContent();
			sysContent.setFid((Integer) msg.get("uid"));
			sysContent.setPid((Integer) msg.get("rid"));
			sysContent.setType((String) msg.get("type"));
			sysContentRepository.save(sysContent);
		}

    }
}
