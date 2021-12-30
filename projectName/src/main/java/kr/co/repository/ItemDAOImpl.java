package kr.co.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.ItemVO;

@Repository
public class ItemDAOImpl implements ItemDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private String NS = "kr.co.item";
	
	@Override
	public void insertItem(ItemVO vo) {
		sqlSession.insert(NS+".insertItem", vo);
	}

	@Override
	public ItemVO updateUI(String itemid) {
		return sqlSession.selectOne(NS+".updateUI", itemid);
	}

	@Override
	public ItemVO update(ItemVO vo) {
		return sqlSession.selectOne(NS+".update", vo);
		
	}

	@Override
	public ItemVO read(String itemid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+"read", itemid);
	}

}
