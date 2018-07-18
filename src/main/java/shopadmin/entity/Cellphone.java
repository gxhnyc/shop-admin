package shopadmin.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Cellphone {
	private String cp_id;
	
	@Size(min=2,max=128)
	private String cp_brand;
	@Size(min=2,max=128)
	private String cp_model;
	@Size(min=2,max=128)
	private String cp_os;
	@Size(min=2,max=128)
	private String cp_cpu;
	@Min(1024)
	private Integer cp_ram;//以M为单位
	@Min(1024)
	private Integer cp_storage;//以M为单位
	@Size(min=2,max=128)
	private String cp_color;
	@Size(max=1024)
	private String cp_description;
	@Min(100)
	private Integer cp_price;//单位：元
	public String getCp_id() {
		return cp_id;
	}
	public void setCp_id(String cp_id) {
		this.cp_id = cp_id;
	}
	public String getCp_brand() {
		return cp_brand;
	}
	public void setCp_brand(String cp_brand) {
		this.cp_brand = cp_brand;
	}
	public String getCp_model() {
		return cp_model;
	}
	public void setCp_model(String cp_model) {
		this.cp_model = cp_model;
	}
	public String getCp_os() {
		return cp_os;
	}
	public void setCp_os(String cp_os) {
		this.cp_os = cp_os;
	}
	public String getCp_cpu() {
		return cp_cpu;
	}
	public void setCp_cpu(String cp_cpu) {
		this.cp_cpu = cp_cpu;
	}
	public Integer getCp_ram() {
		return cp_ram;
	}
	public void setCp_ram(Integer cp_ram) {
		this.cp_ram = cp_ram;
	}
	public Integer getCp_storage() {
		return cp_storage;
	}
	public void setCp_storage(Integer cp_storage) {
		this.cp_storage = cp_storage;
	}
	public String getCp_color() {
		return cp_color;
	}
	public void setCp_color(String cp_color) {
		this.cp_color = cp_color;
	}
	public String getCp_description() {
		return cp_description;
	}
	public void setCp_description(String cp_description) {
		this.cp_description = cp_description;
	}
	public Integer getCp_price() {
		return cp_price;
	}
	public void setCp_price(Integer cp_price) {
		this.cp_price = cp_price;
	}
	
}
