package com.wangshuo.senior2.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Goods 
 * @Description: 创建Goods类
 * @author: 王硕
 * @date: 2019年10月14日 上午8:56:22
 */
public class Goods implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//共有ID
	private String name;//商品名称
	private BigDecimal price;//商品价格需要为BigDecimal类型
	private String count;//已售百分比
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	
	
	
}
