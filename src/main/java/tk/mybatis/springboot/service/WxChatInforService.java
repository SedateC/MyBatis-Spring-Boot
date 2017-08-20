/**
 * 
 */
package tk.mybatis.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.springboot.mapper.WxChatInfoMapper;
import tk.mybatis.springboot.model.WxChatInfo;
import com.github.pagehelper.PageHelper;

/**
 * @author SedateC
 * @date 2017年8月20日下午6:08:20
 * 
 */

@Service
public class WxChatInforService {

    @Autowired
    private WxChatInfoMapper wxChatInfoMapper;

    public List<WxChatInfo> getAll(WxChatInfo wxChatInfo) {
        if (wxChatInfo.getPage() != null && wxChatInfo.getRows() != null) {
            PageHelper.startPage(wxChatInfo.getPage(), wxChatInfo.getRows());
        }
        return wxChatInfoMapper.selectAll();
    }

    public WxChatInfo getById(Integer id) {
        return wxChatInfoMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
    	wxChatInfoMapper.deleteByPrimaryKey(id);
    }

    public void save(WxChatInfo wxChatInfo) {
        if (wxChatInfo.getId() != null) {
        	wxChatInfoMapper.updateByPrimaryKey(wxChatInfo);
        } else {
        	wxChatInfoMapper.insert(wxChatInfo);
        }
    }
}
