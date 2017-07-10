package com.park.einvoice.h5.common.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("invoiceh5")
public class Invoiceh5 {
	@Value("${preUrl}")
	private String preUrl;
	@Value("${h5PreUrl}")
	private String h5PreUrl;
	@Value("${url4Main}")
	private String url4Main;
	@Value("${url4OrdInv}")
	private String url4OrdInv;
	@Value("${url4HasInv}")
	private String url4HasInv;
	@Value("${url4HasInvDetail}")
	private String url4HasInvDetail;
	@Value("${url4AppInv}")
	private String url4AppInv;
	@Value("${url4Wait}")
	private String url4Wait;
	@Value("${url4Email}")
	private String url4Email;
	public String getPreUrl() {
		return preUrl;
	}
	public void setPreUrl(String preUrl) {
		this.preUrl = preUrl;
	}
	
	public String getH5PreUrl() {
		return h5PreUrl;
	}
	public void setH5PreUrl(String h5PreUrl) {
		this.h5PreUrl = h5PreUrl;
	}
	public String getUrl4Main() {
		return url4Main;
	}
	public void setUrl4Main(String url4Main) {
		this.url4Main = url4Main;
	}
	public String getUrl4OrdInv() {
		return url4OrdInv;
	}
	public void setUrl4OrdInv(String url4OrdInv) {
		this.url4OrdInv = url4OrdInv;
	}
	public String getUrl4HasInv() {
		return url4HasInv;
	}
	public void setUrl4HasInv(String url4HasInv) {
		this.url4HasInv = url4HasInv;
	}
	public String getUrl4HasInvDetail() {
		return url4HasInvDetail;
	}
	public void setUrl4HasInvDetail(String url4HasInvDetail) {
		this.url4HasInvDetail = url4HasInvDetail;
	}
	public String getUrl4AppInv() {
		return url4AppInv;
	}
	public void setUrl4AppInv(String url4AppInv) {
		this.url4AppInv = url4AppInv;
	}
	public String getUrl4Wait() {
		return url4Wait;
	}
	public void setUrl4Wait(String url4Wait) {
		this.url4Wait = url4Wait;
	}
	public String getUrl4Email() {
		return url4Email;
	}
	public void setUrl4Email(String url4Email) {
		this.url4Email = url4Email;
	}
}
