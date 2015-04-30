package mybatis;

public class PageVO {

	int nowPage  = 1 ; 
	int nowBlock = 1 ; 
	int totalRecord = 0 ; 
	int numPerPage = 5 ; 
	int pagePerBlock = 5 ; 
	int totalPage = 0 ; 
	int totalBlock =0 ; 
	int beginPerPage = 0 ; 
	int endPerPage = 0 ; 
	int startPage = 0 ;
	int endPage = 0 ;
	
	public void setTotalPage(){
		totalPage = totalRecord / numPerPage ;
		if(totalRecord%numPerPage != 0) {
			totalPage ++ ;
		}
	}
	public int getTotalPage(){
		return totalPage;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNowBlock() {
		return nowBlock;
	}
	public void setNowBlock(int nowBlock) {
		this.nowBlock = nowBlock;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getBeginPerPage() {
		return beginPerPage;
	}
	public void setBeginPerPage(int beginPerPage) {
		this.beginPerPage = beginPerPage;
	}
	public int getEndPerPage() {
		return endPerPage;
	}
	public void setEndPerPage(int endPerPage) {
		this.endPerPage = endPerPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	
}
