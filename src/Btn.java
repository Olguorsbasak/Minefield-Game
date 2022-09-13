import javax.swing.JButton;

public class Btn extends JButton {
	
	private int row,col,count; // count etrafındaki hücre sayısı
	private boolean mine,flag;
	public Btn(int row, int col) {
		super();
		this.row = row;
		this.col = col;
		this.count = 0;
		this.mine = false;
		this.flag = false;
	}
	public int getRow() {
		return this.row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return this.col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isMine() {
		return this.mine;
	}
	public void setMine(boolean mine) {
		this.mine = mine;
	}
	public boolean isFlag() {
		return this.flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	

}
