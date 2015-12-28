package com.hp.ci.oneviewplus.model;

/**
 * The full representation of a user.
 *
 */
public class UserEntity
{

    private String id;
    private String name;
    private String password;

    public static UserEntity generateFromPutDto(PutUserDto dto)
    {
        UserEntity ret = new UserEntity();
        ret.setId(dto.getId());
        ret.setName(dto.getName());
        ret.setPassword(dto.getPassword());
        return ret;
    }

    public static UserEntity generateFromPostDto(PostUserDto dto)
    {
        UserEntity ret = new UserEntity();
        ret.setId(dto.getId());
        ret.setName(dto.getName());
        ret.setPassword(dto.getPassword());
        return ret;
    }

    @Override
    public String toString()
    {
        StringBuffer ret = new StringBuffer();
        ret.append("ID = " + id);
        ret.append(" , name = " + name);
        return ret.toString();
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
