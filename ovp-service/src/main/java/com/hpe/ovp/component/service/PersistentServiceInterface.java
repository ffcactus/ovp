package com.hpe.ovp.component.service;

import com.hpe.ovp.component.model.DeleteUserDto;
import com.hpe.ovp.component.model.PostApplianceDto;
import com.hpe.ovp.component.model.PostUserDto;
import com.hpe.ovp.component.model.PutUserDto;

public interface PersistentServiceInterface {

	public void postUser(PostUserDto dto);
	
	public void deleteUser(DeleteUserDto dto);
	
	public void putUser(PutUserDto dto);
	
	public void postAppliance(PostApplianceDto dto);
	
	public void deleteAppliance(PostApplianceDto dto);

}
