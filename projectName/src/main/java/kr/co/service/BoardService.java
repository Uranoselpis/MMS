package kr.co.service;

import java.util.List;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;

public interface BoardService {

	PageTO<BoardVO> list(PageTO<BoardVO> pt);

	public void insert(BoardVO vo);

	public BoardVO read(int bno);

	public BoardVO updateui(int bno);

	public void update(BoardVO vo);

	public void delete(int bno);

}
