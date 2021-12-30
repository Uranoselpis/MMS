package kr.co.repository;

import kr.co.domain.ItemVO;

public interface ItemDAO {

		public void insertItem(ItemVO vo);

		public ItemVO updateUI(String itemid);

		public ItemVO update(ItemVO vo);

		public ItemVO read(String itemid);
}
