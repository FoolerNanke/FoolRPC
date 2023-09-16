package com.scj.foolRpcClient.testConsumer;

import com.scj.foolRpcBase.entity.FoolRemoteResp;
import org.springframework.stereotype.Component;

/**
 * @author suchangjie.NANKE
 * @Title: CallBack
 * @date 2023/8/22 21:24
 * @description 回调函数
 */

@Component
public class CallBack {

    public void callBack1(FoolRemoteResp foolResponse){
        System.out.println(foolResponse.getFullClassName());
    }
}
