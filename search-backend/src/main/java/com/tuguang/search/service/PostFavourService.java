package com.tuguang.search.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tuguang.search.model.entity.Post;
import com.tuguang.search.model.entity.PostFavour;
import com.tuguang.search.model.entity.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

/**
 * 帖子收藏服务
* @author chen
* @description 针对表【post_favour(帖子收藏)】的数据库操作Service
* @createDate 2023-08-25 11:12:37
*/
public interface PostFavourService extends IService<PostFavour> {
    /**
     * 帖子收藏
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostFavour(long postId, User loginUser);

    /**
     * 分页获取用户收藏的帖子列表
     *
     * @param page
     * @param queryWrapper
     * @param favourUserId
     * @return
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, Wrapper<Post> queryWrapper,
                                    long favourUserId);

    /**
     * 帖子收藏（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostFavourInner(long userId, long postId);
}
