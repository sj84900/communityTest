/*Table: board
Columns:
bno int AI PK 
bno varchar(45) 
content varchar(45) 
id varchar(45) 
reddate datetime 
readcnt int 
etc varchar(45)
 * 
 */
package kr.co.dong.board;

public class BoardDTO {
	private int bno;
	private String title;
	private String id;
	private String regdate;
	private int readcnt;
	private String etc;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", id=" + id + ", regdate=" + regdate + ", readcnt="
				+ readcnt + ", etc=" + etc + "]";
	}
	
	

}
