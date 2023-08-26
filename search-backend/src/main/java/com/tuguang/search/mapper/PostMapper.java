package com.tuguang.search.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tuguang.search.model.entity.Post;

import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
* @author chen
* @description 针对表【post(帖子)】的数据库操作Mapper
* @createDate 2023-08-25 11:12:21
* @Entity com.tuguang.searchbackend.model.entity.Post
*/
public interface PostMapper extends BaseMapper<Post> {
    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);
}




