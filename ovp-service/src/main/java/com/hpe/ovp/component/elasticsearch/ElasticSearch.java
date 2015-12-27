package com.hpe.ovp.component.elasticsearch;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hpe.ovp.component.model.UserEntity;

public class ElasticSearch {
	
	private static final String SETTING_KEY_CLUSTER_NAME = "cluster.name";
	private static final String SETTING_VALUE_CLUSTER_NAME = "ovp_elasticsearch";
	private static final String HOST = "192.168.1.10";
	private static final int PORT = 9300;
	private static final String INDEX = "ovp";
	private static final String TYPE_USER = "user";

	private ObjectMapper mapper = new ObjectMapper();
	private TransportClient transportClient;
	
	public ElasticSearch() throws UnknownHostException {
		Settings settings = Settings.settingsBuilder()
				.put(SETTING_KEY_CLUSTER_NAME, SETTING_VALUE_CLUSTER_NAME)
				.put("client.transport.ignore_cluster_name", true)
				.put("client.transport.sniff", true)
				.put("client.transport.ping_timeout", 20, TimeUnit.SECONDS)
				.build();
		transportClient = TransportClient.builder().settings(settings).build();
		
		transportClient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(HOST), PORT));
	}
	
	public void indexUser(UserEntity entity) throws JsonProcessingException {
		String jsonString = mapper.writeValueAsString(entity);
		IndexRequestBuilder builder = transportClient.prepareIndex(INDEX, TYPE_USER, entity.getId());
		builder.setSource(jsonString);
		IndexResponse response = builder.get(); 
		System.out.println(response.toString());
	}
	
	public UserEntity getUser(String id) throws JsonParseException, JsonMappingException, IOException {
		return null;
	}
}
