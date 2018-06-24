package org.nwnu.grab.domain;


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
public class UserAnchor{

	/**
	 * 主键
	 */
    @GeneratedValue
    @Id
	private Integer id;

	/**
	 * 房间号
	 */
	private Integer rid;

	/**
	 * 名字
	 */
	private String name;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
