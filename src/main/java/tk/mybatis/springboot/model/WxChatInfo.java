/**
 * 
 */
package tk.mybatis.springboot.model;

import javax.persistence.Column;
import javax.persistence.Table;


/**
 * @AUTHOR SEDATEC
 * @DATE 2017年8月15日下午9:17:50
 * 
 */
@Table(name = "wxchatinfo")
public class WxChatInfo extends BaseEntity  {
	
	@Column(name = "wxuserid")//外键
	private String wxuserid;
	@Column(name = "chatName")//聊天对象名
	private String chatName;
	@Column(name = "chatContent")
	private String chatContent; //聊天记录
	public String getChatName() {
		return chatName;
	}
	public void setChatName(String chatName) {
		this.chatName = chatName;
	}
	public String getChatContent() {
		return chatContent;
	}
	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	public String getWxuserid() {
		return wxuserid;
	}
	public void setWxuserid(String wxuserid) {
		this.wxuserid = wxuserid;
	}
	
}