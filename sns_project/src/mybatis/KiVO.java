package mybatis;

import org.springframework.web.multipart.MultipartFile;

public class KiVO {

	private String k_idx, u_idx, k_kind, k_content, k_max, k_hit, k_regdate, u_name, u_image, k_image;
	private MultipartFile mf_image;

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_image() {
		return u_image;
	}

	public void setU_image(String u_image) {
		this.u_image = u_image;
	}

	public String getK_image() {
		return k_image;
	}

	public void setK_image(String k_image) {
		this.k_image = k_image;
	}

	public MultipartFile getMf_image() {
		return mf_image;
	}

	public void setMf_image(MultipartFile mf_image) {
		this.mf_image = mf_image;
	}

	public String getK_idx() {
		return k_idx;
	}

	public void setK_idx(String k_idx) {
		this.k_idx = k_idx;
	}

	public String getU_idx() {
		return u_idx;
	}

	public void setU_idx(String u_idx) {
		this.u_idx = u_idx;
	}

	public String getK_kind() {
		return k_kind;
	}

	public void setK_kind(String k_kind) {
		this.k_kind = k_kind;
	}

	public String getK_content() {
		return k_content;
	}

	public void setK_content(String k_content) {
		this.k_content = k_content;
	}

	public String getK_max() {
		return k_max;
	}

	public void setK_max(String k_max) {
		this.k_max = k_max;
	}

	public String getK_hit() {
		return k_hit;
	}

	public void setK_hit(String k_hit) {
		this.k_hit = k_hit;
	}

	public String getK_regdate() {
		return k_regdate;
	}

	public void setK_regdate(String k_regdate) {
		this.k_regdate = k_regdate;
	}
	
	
}
