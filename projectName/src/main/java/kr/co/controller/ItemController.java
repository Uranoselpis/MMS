package kr.co.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.domain.ItemVO;
import kr.co.service.ItemService;

@Controller
@RequestMapping("item")

public class ItemController {
	
	@Inject
	private ItemService iService;
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(ItemVO vo) {
		iService.update(vo);
		
		return "redirect:/item/read"+vo.getItemid();
	}
	
	
	@RequestMapping(value = "/update/{itemid}", method = RequestMethod.GET)
	public String updateUI(@PathVariable("itemid") String itemid, Model model) {
		
		ItemVO vo = iService.updateUI(itemid);
		model.addAttribute("vo", vo);
		
		return "/item/update";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
		public void insertItemUI() {
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertItem(ItemVO vo) {
		iService.insertItem(vo);
		
		return "redirect:/item/read/"+vo.getItemid();
	}
	
	@RequestMapping(value = "/read/{itemid}", method = RequestMethod.GET)
	public String read(@PathVariable("itemid") String itemid, Model model) {
		ItemVO vo = iService.read(itemid);
		
		model.addAttribute("vo", vo);
		
		return "item/read";
	}
	
}
