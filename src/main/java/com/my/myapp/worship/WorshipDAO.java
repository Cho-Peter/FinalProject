package com.my.myapp.worship;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorshipDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertWorship(WorshipVO vo) {
		int result = sqlSession.insert("Worship.insertWorship", vo);
		return result;
	}
	
	public int deleteWorship(int id) {
		int result = sqlSession.delete("Worship.deleteWorship", id);
		return result;
	}
	
	public int updateWorship(WorshipVO vo) {
		int result = sqlSession.update("Worship.updateWorship", vo);
		return result;
	}
	
	public WorshipVO getWorship(int seq) {
		WorshipVO one = sqlSession.selectOne("Worship.getWorship", seq);
		return one;
	}
	
	public List<WorshipVO> getWorshipList(){
		List<WorshipVO> list = sqlSession.selectList("Worship.getWorshipList");
		return list;
	}
}
