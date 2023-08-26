package com.tuguang.search.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuguang.search.model.entity.PostThumb;
import com.tuguang.search.model.entity.User;

/**
 * 帖子点赞服务
* @author chen
* @description 针对表【post_thumb(帖子点赞)】的数据库操作Service
* @createDate 2023-08-25 11:12:45
*/
public interface PostThumbService extends IService<PostThumb> {
    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
