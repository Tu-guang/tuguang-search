package com.tuguang.search.model.dto.postfavour;

import java.io.Serializable;

import com.tuguang.search.common.PageRequest;
import com.tuguang.search.model.dto.post.PostQueryRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
