package com.tuguang.search.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tuguang.search.model.entity.Post;
import com.tuguang.search.model.entity.PostFavour;
import org.apache.ibatis.annotations.Param;
/**
 * 帖子收藏数据库操作
* @author chen
* @description 针对表【post_favour(帖子收藏)】的数据库操作Mapper
* @createDate 2023-08-25 11:12:37
* @Entity com.tuguang.search.model.entity.PostFavour
*/
public interface PostFavourMapper extends BaseMapper<PostFavour> {

    /**
     * 分页查询收藏帖子列表
     *
     * @param page
     * @param queryWrapper
     * @param favourUserId
     * @return
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, @Param(Constants.WRAPPER) Wrapper<Post> queryWrapper,
                                    long favourUserId);
}




