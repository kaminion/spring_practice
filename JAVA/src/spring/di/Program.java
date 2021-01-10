package spring.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlectExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
	      /*Exam exam = new NewlectExam();
	      //ExamConsole console = new InlineExamConsole(exam); // DI
	      ExamConsole console = new GridExamConsole();
	      console.setExam(exam);*/
	      
	      // ApplicationContext 종류
	      // classPathXML = 어플리케이션의 루트로부터
	      // FileSystemXML = 현재 파일시스템의 루트로부터 시작
	      // XMLWeb = 웹을 통해 지정
	      // AnnotationConfig 파일이 아닌 어노테이션으로 두었다
	      ApplicationContext context =
	            new ClassPathXmlApplicationContext("spring/di/setting.xml");
	      
	      // 스프링에게 지시하는 코드로 변경
	      // Object 형으로 나오기때문에 형변환하고, 이름으로 꺼낼 수있다(id)
//	      ExamConsole console = (ExamConsole) context.getBean("console");
	      // 형변환 X 클래스명 깔끔하게 설정가능, 대신 지시서에 선언되어있어야함
	      Exam exam = context.getBean(Exam.class);
	      System.out.println(exam.toString());
	      
	      ExamConsole console = context.getBean(ExamConsole.class);
	      console.print();
		
	}

}
