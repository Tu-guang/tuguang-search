package com.tuguang.search.controller;

import com.tuguang.search.common.BaseResponse;
import com.tuguang.search.common.ResultUtils;
import com.tuguang.search.manager.SearchFacade;
import com.tuguang.search.model.dto.search.SearchRequest;
import com.tuguang.search.model.vo.SearchVO;
import com.tuguang.search.service.PictureService;
import com.tuguang.search.service.PostService;
import com.tuguang.search.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }

}
