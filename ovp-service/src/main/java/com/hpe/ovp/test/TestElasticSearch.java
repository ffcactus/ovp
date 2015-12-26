package com.hpe.ovp.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hpe.ovp.component.elasticsearch.ElasticSearch;
import com.hpe.ovp.component.model.PostUserDto;
import com.hpe.ovp.component.model.UserEntity;

public class TestElasticSearch {

	public static void main(String arg[]) {
		ElasticSearch search = new ElasticSearch();
		PostUserDto userDto = new PostUserDto();
		userDto.setId("0001");
		userDto.setName("Bai, Bin");
		userDto.setPassword("iforgot");
		UserEntity entity = UserEntity.generateFromPostDto(userDto);
		System.out.println(entity);
		
		try {
			search.postUser(entity);
			search.getUser(userDto.getId());
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
