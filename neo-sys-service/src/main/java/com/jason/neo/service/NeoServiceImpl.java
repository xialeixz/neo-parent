package com.jason.neo.service;

import com.jason.neo.dao.ITmUserDao;
import com.jason.neo.dao.dto.TmUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NeoServiceImpl {

    private Logger logger = LoggerFactory.getLogger("MainLogger");

    @Autowired
    private ITmUserDao iTmUserDao;

    @Transactional
    public void service(){
        System.out.println(iTmUserDao.selectByPrimaryKey("111111"));
        init();
        System.out.println(iTmUserDao.selectByPrimaryKey("22222"));

        logger.info("come on baby let's rock~@@#");
    }

    @Transactional
    public void init(){
        TmUser user = new TmUser();
        user.setIdNo("22222");
        user.setName("李磊");
        user.setJpaVersion(0);
        iTmUserDao.insert(user);
    }

    /**
     * ImportNew Java 8 函数式编程探秘 ( 上 )
     * @param functions
     * @param list
     * @param <T>
     * @param <R>
     * @return
     */
    /*public static <T,R> List<R> multiGetResult(List<Function<List<T>, R>> functions, List<T> list) {
        return functions.stream().map(f -> f.apply(list)).collect(Collectors.toList());
    }*/
}