package com.it.service.impl;

import com.it.service.IWorkerNodeService;
import com.xfvape.uid.UidGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkerNodeServiceImpl implements IWorkerNodeService {
    @Resource
    private UidGenerator uidGenerator;

    @Override
    public long genUid() {
        return uidGenerator.getUID();
    }
}
