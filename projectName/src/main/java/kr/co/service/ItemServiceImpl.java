package kr.co.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.ItemVO;
import kr.co.repository.ItemDAO;

@Service
public class ItemServiceImpl implements ItemService{

	@Inject
	private ItemDAO iDAO;
	
	@Override
	public void insertItem(ItemVO vo) {
		iDAO.insertItem(vo);
	}

	@Override
	public ItemVO updateUI(String itemid) {
		return iDAO.updateUI(itemid);
	}

	@Override
	public void update(ItemVO vo) {
		iDAO.update(vo);
	}

	@Override
	public ItemVO read(String itemid) {
		// TODO Auto-generated method stub
		return iDAO.read(itemid);
	}

}
