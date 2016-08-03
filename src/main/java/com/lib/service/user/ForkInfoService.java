package com.lib.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.lib.dto.ForkFileInfoVo;
import com.lib.entity.ForkInfo;

public interface ForkInfoService {
	/**
	 * 插入收藏
	 * @param forkInfo
	 * @return
	 */
	int insert(ForkInfo forkInfo);
	
	/**
	 * 删除收藏
	 * @param forkId
	 * @return
	 */
	int delete(Long forkId);
	
	/**
	 * 修改收藏
	 * @param forkId
	 * @return
	 */
	int modify(ForkInfo forkInfo);
	
	/**
	 * 查找收藏
	 * @param forkId
	 * @return
	 */
	ForkInfo findByForkId(Long forkId);
	/**
	 * 查找收藏
	 * @param docId
	 * @return
	 */
	List<ForkInfo> findByDocId(Long docId);
	/**
	 * 查找用户全部收藏
	 * @return
	 */
	List<ForkFileInfoVo> findAll(Long docUserId);
	
	/**
	 * 查询用户一个文件夹下的收藏
	 * @param docId
	 * @return
	 */
	List<ForkInfo> findAllByDocId(@Param("docId")Long docId,@Param("docUserId")Long docUserId);
	/**
	 * 分页查询
	 * @param pageNo
	 * @param userId
	 * @param userName
	 * @param order
	 * @return
	 */
	PageInfo<ForkFileInfoVo> getFileForkInfoPageByUserId(int pageNo, Long userId,String userName);
}
