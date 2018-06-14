package jp.co.axiz.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.SelectForm;
import jp.co.axiz.web.entity.UserInfo;
import jp.co.axiz.web.service.SelectService;

@Controller
public class SelectController {

	@Autowired
	SelectService ss;

	@RequestMapping(value="/select", method =RequestMethod.GET)
	public String select(@ModelAttribute("form") SelectForm form, Model model) {
		return "select";
	}

	@RequestMapping(value="/list", method =RequestMethod.POST)
	public String list(@ModelAttribute("form") SelectForm form, Model model) {
		List<UserInfo> list = new ArrayList<UserInfo>();
		list = ss.find(form);
		model.addAttribute("userList", list);
		return "selectResult";
	}
}
