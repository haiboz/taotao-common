package com.taotao.common.pojo;

/**
 * 图片上传下载对象
 * @author 浮生若梦
 * 2016年9月30日 下午6:08:55
 */
public class MulitPictureFile {
	/**
	 * 成功标记
	 */
	private int error;
	/**
	 * 图片路径
	 */
	private String url;
	/**
	 * 错误信息
	 */
	private String message;
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
