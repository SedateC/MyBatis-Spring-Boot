/**
 * 
 */
package tk.mybatis.springboot.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * @AUTHOR SEDATEC
 * @DATE 2017年8月15日下午9:17:50
 * 
 */
@Table(name = "WxUser")
public class WxUser extends BaseEntity  {
	@Column(name = "weiXinNumber")
	private String weiXinNumber;
	@Column(name = "telephoneNumber")
	private String telephoneNumber;
	@Column(name = "userName")
	private String userName;//昵称
	@Column(name = "password")
    private String password;
	@Column(name = "email")
    private String email;
	public String getWeiXinNumber() {
		return weiXinNumber;
	}
	public void setWeiXinNumber(String weiXinNumber) {
		this.weiXinNumber = weiXinNumber;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

    
    
}
