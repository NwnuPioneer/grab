package org.nwnu.grab.domain;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>
 * 
 * </p>
 *
 * @author dushik
 * @since 2018-05-08
 */

@Entity
public class SysContent{

	/**
	 * 主键
	 */
    @GeneratedValue
    @Id
	private Integer id;

	/**
	 * 主播id
	 */
	private Integer pid;

	/**
	 * 粉丝id
	 */
	private Integer fid;

	/**
	 * 类型
	 */
	private String type;
	
	/**
	 * 弹幕
	 */
	private String txt;

	/**
	 * 发送时间
	 */
	private Date sendtime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public Date getSendtime() {
		return sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

}
