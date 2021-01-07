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
		
		// ApplicationContext ����
		// classPathXML = ���ø����̼��� ��Ʈ�κ���
		// FileSystemXML = ���� ���Ͻý����� ��Ʈ�κ��� ����
		// XMLWeb = ���� ���� ����
		// AnnotationConfig ������ �ƴ� ������̼����� �ξ���
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		// ���������� �����ϴ� �ڵ�� ����
		ExamConsole console = ?
		console.print();
		
	}

}
