package com.hpe.ovp.component.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hpe.ovp.component.model.ServerHardware;

@Component
public class OvpServiceImpl implements OvpServiceInterface {

	public List<ServerHardware> getServerHardwares() {
		List<ServerHardware> ret = new ArrayList<ServerHardware>();
		ret.add(new ServerHardware("server 1"));
		ret.add(new ServerHardware("server 2"));
		return ret;
	}

}
