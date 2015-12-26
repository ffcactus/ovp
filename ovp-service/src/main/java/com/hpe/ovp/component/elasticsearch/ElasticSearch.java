package com.hpe.ovp.component.elasticsearch;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hpe.ovp.component.model.UserEntity;
import com.hpe.ovp.component.service.RestClient;

@Component
public class ElasticSearch {
	
	private static final String ELASTICSEARCH_HOST = "192.168.1.10";
	private static final String PORT = "9200";
	private static final String SERVER = "http://" + ELASTICSEARCH_HOST + ":" + PORT + "/";
	private static final String INDEX = "ovp";
	private static final String TYPE_USER = INDEX + "/" + "user";
	
	private RestClient restClient;
	private ObjectMapper mapper;
	
	public ElasticSearch() {		
		restClient = new RestClient(SERVER);
		mapper = new ObjectMapper();
	}
	
	public void postUser(UserEntity entity) throws JsonProcessingException {
		String uri = TYPE_USER + "/" + entity.getId();
		String json = mapper.writeValueAsString(entity);
		restClient.post(uri, json);
	}
	
	public UserEntity getUser(String id) throws JsonParseException, JsonMappingException, IOException {
		String uri = TYPE_USER + "/" + id;
		String jsonString = restClient.get(uri);
		UserEntity ret = mapper.readValue(jsonString, UserEntity.class);
		return ret;
	}
}
