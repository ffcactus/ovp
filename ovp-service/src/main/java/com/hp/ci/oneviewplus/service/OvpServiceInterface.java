package com.hp.ci.oneviewplus.service;

import java.util.List;

import com.hp.ci.oneviewplus.model.PostApplianceDto;
import com.hp.ci.oneviewplus.model.ServerHardware;

public interface OvpServiceInterface
{

    /**
     * Get all the servers
     * 
     * @return
     */
    public List<ServerHardware> getServers();

    public void importAppliance(PostApplianceDto dto);

}
