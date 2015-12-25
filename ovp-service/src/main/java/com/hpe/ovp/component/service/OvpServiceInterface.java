package com.hpe.ovp.component.service;

import java.util.List;

import com.hpe.ovp.component.model.PostApplianceDto;
import com.hpe.ovp.component.model.ServerHardware;

public interface OvpServiceInterface {
	
	/**
	 * Get all the servers
	 * @return
	 */
	public List<ServerHardware> getServers();
	
	public void importAppliance(PostApplianceDto dto);
	
}
