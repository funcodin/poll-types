/**
 * 
 */
package com.multi.enterprise.types.poll.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.multi.enterprise.types.poll.OptionDTO;
import com.multi.enterprise.types.poll.OptionType;
import com.multi.enterprise.types.poll.QuestionDTO;
import com.multi.enterprise.types.poll.QuestionListDTO;

/**
 * @author Robot
 *
 */
public class DtoUtils {

	public static QuestionListDTO createQuestionListDTO() {
		final QuestionListDTO questionListDto = new QuestionListDTO();
		questionListDto.setLastPage(true);
		questionListDto.setLimit(10);
		questionListDto.setLastQuestionIndex(51);
		final List<QuestionDTO> questionDtos = new ArrayList<>();
		questionDtos.add(createQuestionDTO("This is a test Question", OptionType.BINARY));
		questionDtos.add(createQuestionDTO("This is a multiple choice Question", OptionType.MULTIPLE));
		questionListDto.setQuestions(questionDtos);
		return questionListDto;
	}

	public static QuestionDTO createQuestionDTO(final String question, final OptionType type) {
		final QuestionDTO questionDto = new QuestionDTO();
		questionDto.setPollQuestion(question);
		questionDto.setOptionType(type.name());
		questionDto.setTotalVotes(new Random().nextInt(50));
		List<OptionDTO> optionDtos = new ArrayList<>();
		optionDtos.add(createOptionDTO("Yes"));
		optionDtos.add(createOptionDTO("No"));
		questionDto.setOptions(optionDtos);
		return questionDto;
	}

	public static OptionDTO createOptionDTO(final String optionValue) {
		final OptionDTO optionDto = new OptionDTO();
		optionDto.setOptionId(UUID.randomUUID().toString());
		optionDto.setOptionValue(OptionType.BINARY.name());
		optionDto.setVoteCount(new Random().nextInt(50));
		return optionDto;
	}

}