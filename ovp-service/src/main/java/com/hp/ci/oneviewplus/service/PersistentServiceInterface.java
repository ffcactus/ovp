package com.hp.ci.oneviewplus.service;

import com.hp.ci.oneviewplus.model.DeleteUserDto;
import com.hp.ci.oneviewplus.model.PostApplianceDto;
import com.hp.ci.oneviewplus.model.PostUserDto;
import com.hp.ci.oneviewplus.model.PutUserDto;

public interface PersistentServiceInterface
{

    public void postUser(PostUserDto dto);

    public void deleteUser(DeleteUserDto dto);

    public void putUser(PutUserDto dto);

    public void postAppliance(PostApplianceDto dto);

    public void deleteAppliance(PostApplianceDto dto);

}
