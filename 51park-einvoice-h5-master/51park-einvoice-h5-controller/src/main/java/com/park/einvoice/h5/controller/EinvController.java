package com.park.einvoice.h5.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.park.einvoice.h5.common.Base64Tools;
import com.park.einvoice.h5.common.DataChangeTools;
import com.park.einvoice.h5.common.ResultTools;
import com.park.einvoice.h5.common.constants.CodeConstants;
import com.park.einvoice.h5.common.properties.Invoiceh5;

@Controller
public class EinvController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Invoiceh5 invoiceh5;
	
	private String preUrl;
	private String url4Main;
	
	@ResponseBody
	@RequestMapping("/einv")
	public String eiDoor(HttpServletRequest request){
		logger.info("** eiDoor请求成功");
		try {
			//获取基本信息
			getInvoiceh5Info();
			String requestStr = request.getParameter("params");
			logger.info("** eiDoor入参：" + requestStr);
			Map<String, String> requestMap = DataChangeTools.json2Map(requestStr);
			String tradeNo = requestMap.get("tradeNo");
			//组合并加密url
			String url = preUrl + url4Main + "?params={'tradeNo':'" + tradeNo + "'}";
			String invoiceUrl = Base64Tools.encode2String(url);
			//返回数据invoiceUrl
			Map<String, String> returnMap = new HashMap<String, String>();
			returnMap.put("invoiceUrl", invoiceUrl);
			logger.info("** eiDoor返回：" + ResultTools.setObjectResponse(CodeConstants.成功.getCode(), returnMap));
			return ResultTools.setObjectResponse(CodeConstants.成功.getCode(), returnMap);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultTools.setResponse(CodeConstants.服务器异常.getCode());
		}
	}
	
	private void getInvoiceh5Info(){
		preUrl = invoiceh5.getH5PreUrl();
		url4Main = invoiceh5.getUrl4Main();
	}
	
}
