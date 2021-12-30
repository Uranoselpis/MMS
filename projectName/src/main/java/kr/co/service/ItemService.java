package kr.co.service;

import kr.co.domain.ItemVO;

public interface ItemService {

	public void insertItem(ItemVO vo);

	public ItemVO updateUI(String itemid);

	public void update(ItemVO vo);

	public ItemVO read(String itemid);

}
