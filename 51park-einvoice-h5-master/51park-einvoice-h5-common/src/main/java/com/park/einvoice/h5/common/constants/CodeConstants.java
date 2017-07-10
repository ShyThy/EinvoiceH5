package com.park.einvoice.h5.common.constants;


public enum CodeConstants {
	
	成功("成功", "200"), 
	签名验证失败("签名验证失败", "401"),
	用户名或密码错误("用户名或密码错误","402"),
	参数为空("参数为空","403"),
	用户已退出("用户已退出","405"),
	用户不存在("用户不存在","406"),
	参数错误("参数错误","407"),
	参数解析错误("参数解析错误","408"),
	服务器异常("服务器异常", "500"),
	cron表达式有误("cron表达式有误，不能被解析", "600"),
	cron更新失败("cron更新失败", "601"),
	任务状态改变失败("任务状态改变失败","602"),
	未找到目标类("未找到目标类","603"),
	未找到目标方法("未找到目标方法","604"),
	保存失败("保存失败","605"),
	删除失败("删除失败","606"),
	任务存在("任务存在","607"),
	发票金额不能为零("发票金额不能为零","810"),
	子订单已全部开票("子订单已全部开票","811"),
	企业未注册("企业未注册","713"),
	订单号不正确("订单号不正确","714"),
	电子发票成功("成功", "0000"),
	电子发票等待("请等待", "8994"),
	电子发票失败("系统内部异常", "9999");
	

	
	private final String content;
	private final String code;

	private CodeConstants(String content, String code) {
		this.content = content;
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public String getCode() {
		return code;
	}

	public static String getName(String code) {
		for (CodeConstants p : CodeConstants.values()) {
			if (code.equals(p.getCode())) {
				return p.content;
			}
		}
		return null;
	}

	public static String getCode(String name) {
		for (CodeConstants p : CodeConstants.values()) {
			if (name.equals(p.getContent())) {
				return p.code;
			}
		}
		return "";
	}

}
