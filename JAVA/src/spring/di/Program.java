package spring.di;


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
		ExamConsole console = ?
		console.print();
		
	}

}
