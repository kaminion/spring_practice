package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("===================================================");
		System.out.printf("total %d, avg %f\n", exam.total(), exam.avg());
		System.out.println("===================================================");
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
