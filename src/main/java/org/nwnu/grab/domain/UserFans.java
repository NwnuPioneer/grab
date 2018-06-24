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
public class UserFans{

	/**
	 * 主键
	 */
    @GeneratedValue
    @Id
	private Integer id;

	/**
	 * uid
	 */
	private Integer uid;

	/**
	 * 昵称
	 */
	private String namme;

	/**
	 * 徽章昵称
	 */
	private String bnn;

	/**
	 * 用户等级
	 */
	private Integer level;



	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamme() {
		return namme;
	}

	public void setNamme(String namme) {
		this.namme = namme;
	}

	public String getBnn() {
		return bnn;
	}

	public void setBnn(String bnn) {
		this.bnn = bnn;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
