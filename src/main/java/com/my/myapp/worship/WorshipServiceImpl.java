package com.my.myapp.worship;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorshipServiceImpl implements WorshipService{
	
	@Autowired
	WorshipDAO worshipDAO;
	
	@Override
	public int insertWorship(WorshipVO vo) {
		return worshipDAO.insertWorship(vo);
	}
	
	@Override
	public int deleteWorship(int id) {
		return worshipDAO.deleteWorship(id);
	}
	
	@Override
	public int updateWorship(WorshipVO vo) {
		return worshipDAO.updateWorship(vo);
	}
	
	@Override
	public WorshipVO getWorship(int seq) {
		return worshipDAO.getWorship(seq);
	}
	
	public List<WorshipVO> getWorshipList(){
		return worshipDAO.getWorshipList();
	}
}
