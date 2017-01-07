package cn.pepper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.pepper.model.User;
import cn.pepper.service.UserService;
import cn.pepper.util.MyConstants;
import cn.pepper.util.ReturnData;

@RestController
@RequestMapping("/redis")
public class RedisController {

	
	public static final Logger logger =  LoggerFactory.getLogger(RedisController.class);
	
	
	
	@Autowired  
	private UserService userService;  
  
	
	/**
	 * 测试redis缓存
	 * @Description 
	 * @author niepei
	 * @return
	 */
    @RequestMapping("/testCache")  
    public ReturnData<User> testCache(){  
    	
    	logger.debug("【****************     testCache    has  begin       ***************】");
    	ReturnData<User> rd = new ReturnData<>();
    	User user = userService.findUser(1); 
    	rd.setCode(MyConstants.SUCCESS);
    	rd.setMsg("success");
    	rd.setData(user);
    	logger.debug("【****************     testCache    has  end         ***************】");
        return rd;  
        
    }  
    

    

}
