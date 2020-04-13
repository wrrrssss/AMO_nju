package nju.slby.amo.service.Impl;

import nju.slby.amo.mapper.DemoMapper;
import nju.slby.amo.model.Demo;
import nju.slby.amo.model.ResultMessage;
import nju.slby.amo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public ResultMessage register(Demo demo) {
        //判断是否有重复 todo
        demoMapper.insert(demo);
        return new ResultMessage(true,"注册成功");
    }

    @Override
    public ResultMessage login(Demo demo) {
        return null;
    }

    @Override
    public Demo getDemo(int id) {
        return null;
    }

    @Override
    public ResultMessage updateDemo(Demo demo) {
        return null;
    }

    @Override
    public ResultMessage deleteDemo(int id) {
        return null;
    }
}
