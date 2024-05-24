package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*  
 * 1. PostDto 클래스를 만들어 보세요
 *    PostDto 에는 글번호, 작성자, 제목을 담을수 있어야 합니다.
 *    즉 3개의 필드를 만드세요
 *    필드명은 마음데로, 필드의 data type 은 잘 생각해서 결정
 *    dto 작성 규약에 맞게 만들어 주세요( eclipse generate 기능 활용)
 *    test.mypac 페키지에 만들기 
 * 
 * 2. PostDto 객체에 임의의 글 3개의 정보를 담아 보세요. 
 *    총 3개의 PostDto 객체가 생성이 되어야 합니다.
 * 
 * 3. PostDto 객체를 담을수 있는 ArrayList 객체를 생성해서 위에서 생성한 PostDto 
 *    객체를 ArrayList 에 담아 보세요.
 *    
 * 4. 반복문 돌면서 ArrayList 에 담긴 글 목록을 콘솔창에 이쁘게 출력해 보세요.
 *  
 */
public class QuizMain3 {
	public static void main(String[] args) {
		//2.
		PostDto p1=new PostDto();
		p1.setNum(1);
		p1.setWriter("김구라");
		p1.setTitle("html");
		
		PostDto p2=new PostDto();
		p2.setNum(2);
		p2.setWriter("해골");
		p2.setTitle("javascript");
		
		PostDto p3=new PostDto(3, "원숭이", "css");
		//3.
		List<PostDto> posts = new ArrayList<>();
		//ArrayList 는 순서가 있는 데이터이기 때문에 담긴 순서대로 저장되어 있다. 
		posts.add(p1);
		posts.add(p2);
		posts.add(p3);
		//4.
		for(PostDto tmp:posts) {
			String info = String.format("글번호:%d , 작성자:%s, 제목:%s", 
					tmp.getNum(), tmp.getWriter(), tmp.getTitle());
			System.out.println(info);
		}
	}
}















