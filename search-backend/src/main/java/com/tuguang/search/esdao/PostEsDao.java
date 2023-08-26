package com.tuguang.search.esdao;

import java.util.List;

import com.tuguang.search.model.dto.post.PostEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);

    List<PostEsDTO> findByTitle(String title);
}
