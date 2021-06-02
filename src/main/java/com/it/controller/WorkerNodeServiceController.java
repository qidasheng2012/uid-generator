package com.it.controller;

import com.it.service.IWorkerNodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class WorkerNodeServiceController {
    @Resource
    private IWorkerNodeService workerNodeService;
    /**
     * 集成百度uid-generator生成id
     * @return
     */
    @GetMapping("/baidu/uid")
    public long baiduUid(){
        return workerNodeService.genUid();
    }
}
