package com.hpe.ovp.component.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.hpe.ovp.component.model.PostApplianceDto;
import com.hpe.ovp.component.model.ServerHardware;

@Component
public class OvpServiceImpl implements OvpServiceInterface {

	private static final Logger logger = Logger.getLogger(OvpServiceImpl.class);
	
	@PostConstruct
	public void postConstruct() {
		logger.info("This is the postConstruct");
	}
	
	public List<ServerHardware> getServers() {
		List<ServerHardware> ret = new ArrayList<ServerHardware>();
		ret.add(new ServerHardware("server 1"));
		ret.add(new ServerHardware("server 2"));
		return ret;
	}

	public void importAppliance(PostApplianceDto dto) {
	
	}

}
