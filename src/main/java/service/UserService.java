package service;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public void updateUser(String name,int id) throws Exception {
        int i = userMapper.updateUser(name, id);
        if(i==1){
            throw new Exception("111");
        }
    }

}