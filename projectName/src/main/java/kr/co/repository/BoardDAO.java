package kr.co.repository;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardDAO {

	public List<BoardVO> list(PageTO<BoardVO> to);

	public void insert(BoardVO vo);

	public BoardVO read(int bno);

	public void increaseViewcnt(int bno);

	public int getAmount();

	public BoardVO updateui(int bno);

	public void update(BoardVO vo);

	public void delete(int bno);
	


}
