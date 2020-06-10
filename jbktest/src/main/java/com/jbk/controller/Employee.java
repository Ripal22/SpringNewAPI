package com.jbk.controller;

import org.springframework.stereotype.Component;

@Component
// you can use lombok to generate fields like setter..getter..noargs
// arguments..etc
public class Employee {
	String QuestionText;
	String option1;
	String option2;
	String option3;
	String option4;
	String option5;
	String correctOption;
	String explanation;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String questionText, String option1, String option2, String option3, String option4, String option5,
			String correctOption, String explanation) {
		super();
		QuestionText = questionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
		this.correctOption = correctOption;
		this.explanation = explanation;
	}

	public String getQuestionText() {
		return QuestionText;
	}

	public void setQuestionText(String questionText) {
		QuestionText = questionText;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((QuestionText == null) ? 0 : QuestionText.hashCode());
		result = prime * result + ((correctOption == null) ? 0 : correctOption.hashCode());
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		result = prime * result + ((option5 == null) ? 0 : option5.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (QuestionText == null) {
			if (other.QuestionText != null)
				return false;
		} else if (!QuestionText.equals(other.QuestionText))
			return false;
		if (correctOption == null) {
			if (other.correctOption != null)
				return false;
		} else if (!correctOption.equals(other.correctOption))
			return false;
		if (explanation == null) {
			if (other.explanation != null)
				return false;
		} else if (!explanation.equals(other.explanation))
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		if (option5 == null) {
			if (other.option5 != null)
				return false;
		} else if (!option5.equals(other.option5))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [QuestionText=" + QuestionText + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + ", option5=" + option5 + ", correctOption=" + correctOption
				+ ", explanation=" + explanation + "]";
	}
}
