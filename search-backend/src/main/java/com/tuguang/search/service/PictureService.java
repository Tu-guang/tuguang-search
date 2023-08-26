package com.tuguang.search.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tuguang.search.model.entity.Picture;

/**
 * 图片服务
 *
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}