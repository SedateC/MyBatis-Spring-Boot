/**
 * 
 */
package tk.mybatis.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.springboot.mapper.WxUserMapper;
import tk.mybatis.springboot.model.WxUser;

import com.github.pagehelper.PageHelper;

/**
 * @author SedateC
 * @date 2017年8月20日下午6:08:20
 * 
 */

@Service
public class WxUserService {

    @Autowired
    private WxUserMapper wxUserMapper;

    public List<WxUser> getAll(WxUser wxUser) {
        if (wxUser.getPage() != null && wxUser.getRows() != null) {
            PageHelper.startPage(wxUser.getPage(), wxUser.getRows());
        }
        return wxUserMapper.selectAll();
    }

    public WxUser getById(Integer id) {
        return wxUserMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
    	wxUserMapper.deleteByPrimaryKey(id);
    }

    public void save(WxUser wxUser) {
        if (wxUser.getId() != null) {
        	wxUserMapper.updateByPrimaryKey(wxUser);
        } else {
        	wxUserMapper.insert(wxUser);
        }
    }
}
