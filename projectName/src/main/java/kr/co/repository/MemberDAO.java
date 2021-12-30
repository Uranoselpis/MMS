package kr.co.repository;

import java.util.List;

import kr.co.domain.MemberVO;

public interface MemberDAO {
	
	public void insertMember(MemberVO vo);

	public MemberVO read(String userid);

	public MemberVO updateUI(String userid);

	public MemberVO update(MemberVO vo);

	public MemberVO delete(MemberVO vo);

	public List<MemberVO> list();

	public List<MemberVO> searchByName(String username);

	public MemberVO idcheck(String userid);


}
