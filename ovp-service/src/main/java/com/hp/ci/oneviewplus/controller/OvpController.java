package com.hp.ci.oneviewplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.ci.oneviewplus.model.PostApplianceDto;
import com.hp.ci.oneviewplus.model.ServerHardware;
import com.hp.ci.oneviewplus.service.OvpServiceInterface;

@RestController
@RequestMapping("/ovp")
public class OvpController
{

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
            final HttpServletResponse response)
    {
        return service.getServers();
    }

}
