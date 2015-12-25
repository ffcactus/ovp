package com.hpe.ovp.component.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.ovp.component.model.PostApplianceDto;
import com.hpe.ovp.component.model.ServerHardware;
import com.hpe.ovp.component.service.OvpServiceInterface;

@RestController
@RequestMapping("/ovp")
public class OvpController {
	
	@Autowired
	private OvpServiceInterface service;
	
	@RequestMapping("/import-ov")
	public void importOneView(
			final HttpServletRequest request,
            final HttpServletResponse response)
	{
		
	}

	
	@RequestMapping("/server")
	public List<ServerHardware> getServers(
			final HttpServletRequest request,
            final HttpServletResponse response,
            @RequestBody final PostApplianceDto dto) 
	{
		return service.getServers(); 
	}
	
	
}
