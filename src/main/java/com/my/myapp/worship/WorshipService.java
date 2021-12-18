package com.my.myapp.worship;

import java.util.List;

public interface WorshipService {
	public int insertWorship(WorshipVO vo);
	public int deleteWorship(int id);
	public int updateWorship(WorshipVO vo);
	public WorshipVO getWorship(int seq);
	public List<WorshipVO>getWorshipList();
}
