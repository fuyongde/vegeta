package com.sunflower.piccolo.provider.rpc;

import com.sunflower.piccolo.api.HelloRpc;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author fuyongde
 * @date 2019/9/16 21:57
 */
@Service
public class HelloRpcImpl implements HelloRpc {
    @Override
    public String hello(String name) {
        return "Hello" + name;
    }
}
