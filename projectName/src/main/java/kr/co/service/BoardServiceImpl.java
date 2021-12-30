package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.BoardVO;
import kr.co.domain.PageTO;
import kr.co.repository.BoardDAO;

	@Service
	public class BoardServiceImpl implements BoardService {
		
			@Inject
			private BoardDAO bDao;

			@Override
			public void insert(BoardVO vo) {
				bDao.insert(vo);
			}

			@Override
			public BoardVO read(int bno) {
				bDao.increaseViewcnt(bno);
				
				return bDao.read(bno);
			}
			
			@Override
			public PageTO<BoardVO> list(PageTO<BoardVO> pt) {
				
				int amount = bDao.getAmount();
				pt.setAmount(amount);
				
				List<BoardVO> list = bDao.list(pt);
				pt.setList(list);
				
				return pt;
			}

			@Override
			public BoardVO updateui(int bno) {
				return bDao.updateui(bno);
			}

			@Override
			public void update(BoardVO vo) {
				bDao.update(vo);
			}

			@Override
			public void delete(int bno) {
				bDao.delete(bno);
				
			}
}
