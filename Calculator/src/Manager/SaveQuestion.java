package Manager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Beans.QuestionTO;

import com.thoughtworks.xstream.XStream;

public class SaveQuestion {
	List<QuestionTO> questionTOList = new ArrayList<QuestionTO>();

	public List<QuestionTO> getQuestionTOList() {
		return questionTOList;
	}

	public void setQuestionTOList(List<QuestionTO> questionTOList) {
		this.questionTOList = questionTOList;
	}

	QuestionTO questionTO = new QuestionTO();

	public QuestionTO getQuestionTO() {
		return questionTO;
	}

	public void setQuestionTO(QuestionTO questionTO) {
		this.questionTO = questionTO;
	}

	public SaveQuestion() {
		QuestionTO questionTO = new QuestionTO();
		questionTO
				.setQuestion("This is the temporary question for testing done now");
		questionTO.setOptionOne("optionOne");
		questionTO.setOptionTwo("optionTwo");
		questionTO.setOptionThree("optionThree");
		questionTO.setOptionFour("optionFour");
		questionTO.setCorrectAns(1);
		XStream xstream = new XStream();
		xstream.alias("questionTO", QuestionTO.class);
		String xml = xstream.toXML(questionTO);
		System.out.println(xml);
		System.out.println("done");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("question.xml"));
			writer.write(xml);

		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}

		// TODO Auto-generated constructor stub
	}

	public String saveQuestion() {
/*		XStream xstream = new XStream();
		// questionTOList =
		// (ArrayList<QuestionTO>)xstream.fromXML("question.xml");
		questionTOList.add(questionTO);
		xstream.alias("questionTO", QuestionTO.class);
		String xml = xstream.toXML(questionTOList);
		System.out.println(xml);
		System.out.println("done");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("question.xml"));
			writer.write(xml);

		} catch (IOException e) {
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}*/
		return "sucess";
	}

}
