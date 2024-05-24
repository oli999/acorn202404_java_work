package test.mypac;

public class PostDto {
	//글번호를 저장할 필드
	private int num;
	//작성자를 저장할 필드
	private String writer;
	//제목을 저장할 필드 
	private String title;
	
	//기본 생성자 
	public PostDto() {}

	public PostDto(int num, String writer, String title) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}









