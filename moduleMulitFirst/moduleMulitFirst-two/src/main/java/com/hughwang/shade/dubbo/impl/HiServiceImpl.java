package com.hughwang.shade.dubbo.impl;

import com.hughwang.shade.dubbo.HiService;
import com.hughwang.shade.utils.L;

/**
 * Created by wanghuan on 2017/10/25.
 */
public class HiServiceImpl implements HiService{


    public void hi(String msg) {
        L.info("HiServiceImpl : " + msg);
    }

}
