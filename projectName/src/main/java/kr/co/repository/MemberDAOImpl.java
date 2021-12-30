package kr.co.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private String NS = "kr.co.member";
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(NS+".insertMember", vo);
		
	}

	@Override
	public MemberVO read(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".read", userid);
	}

	@Override
	public MemberVO updateUI(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".updateUI", userid);
	}

	@Override
	public MemberVO update(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".update", vo);
	}

	@Override
	public MemberVO delete(MemberVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".delete", vo);
	}

	@Override
	public List<MemberVO> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+".list");
	}

	@Override
	public List<MemberVO> searchByName(String username) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NS+".searchByName", username);
	}

	@Override
	public MemberVO idcheck(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".idcheck", userid);
	}


	

	

}
