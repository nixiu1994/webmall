package com.yootk.mall.action.front;

import com.yootk.common.action.abs.AbstractAction;
import com.yootk.common.mvc.annotation.Controller;
import com.yootk.common.mvc.annotation.RequestMapping;
import com.yootk.common.mvc.util.ResourceUtil;
import com.yootk.common.servlet.ModelAndView;

@Controller
@RequestMapping("/pages/front/center/orders/")
public class OrdersActionFront extends AbstractAction {
	public static final String ACTION_TITLE = "订单" ;
	/**
	 * 实现订单创建处理
	 * @return 订单创建页面
	 */
	@RequestMapping("orders_add")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView(super.getForwardPage()) ;
		mav.add(AbstractAction.PATH_ATTRIBUTE_NAME,super.getPage("list.action"));
		mav.add(AbstractAction.MSG_ATTRIBUTE_NAME, ResourceUtil.getMessage("vo.add.success",ACTION_TITLE));
		return mav ;
	}
	/**
	 * 查看订单详情信息
	 * @return 订单详情显示
	 */
	@RequestMapping("orders_details_show")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView(super.getPage("show.page")) ;
		return mav ;
	}
	/**
	 * 实现订单创建前的处理
	 * @return 订单创建页面
	 */
	@RequestMapping("orders_add_pre")
	public ModelAndView addPre() {
		ModelAndView mav = new ModelAndView(super.getPage("add.page")) ;
		return mav ;
	}
	/**
	 * 实现订单信息列表显示
	 * @return 跳转到订单列表页
	 */
	@RequestMapping("orders_list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView(super.getPage("list.page")) ;
		return mav ;
	}

	@Override
	public String getUploadPath() {
		return "/upload/orders";
	}
}
