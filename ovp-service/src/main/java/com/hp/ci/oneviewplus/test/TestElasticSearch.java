package com.hp.ci.oneviewplus.test;

import java.io.IOException;
import java.net.UnknownHostException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hp.ci.oneviewplus.elasticsearch.ElasticSearch;
import com.hp.ci.oneviewplus.model.PostUserDto;
import com.hp.ci.oneviewplus.model.UserEntity;

public class TestElasticSearch
{

    public static void main(String arg[])
    {
        ElasticSearch search;
        try
        {
            search = new ElasticSearch();
            PostUserDto userDto = new PostUserDto();
            userDto.setId("0001");
            userDto.setName("Bai, Bin");
            userDto.setPassword("iforgot");
            UserEntity entity = UserEntity.generateFromPostDto(userDto);
            System.out.println(entity);

            try
            {
                search.indexUser(entity);
            }
            catch (JsonProcessingException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch (UnknownHostException e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }
}
