package _Solution.StringCalculator;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {

	public int add(String numbers) throws Exception {
		if (numbers.isEmpty()) {
			return 0;
		}
		String delemiter = getDelemiter(numbers);
		String[] listOfNumber = getSplit(numbers, delemiter);
		haveOtherDelemiter(listOfNumber, delemiter, numbers);

		return stringArrayToSumInt(listOfNumber);
	}

	private Integer stringArrayToSumInt(String[] stringArray) {
		return Arrays.stream(stringArray)
			 .map(Integer::parseInt)
			 .reduce(Integer::sum)
			 .orElseThrow(RuntimeException::new);
	}

	private String[] getSplit(String numbers, String delemiter) throws Exception {
		if (numbers.startsWith("//")) {
			String[] split = numbers.split("\n");
			numbers = split[1];
		}
		checkNoDelemiterAtEnd(delemiter, numbers);
		return numbers.split(delemiter);
	}

	private void checkNoDelemiterAtEnd(String delemiter, String numbers) throws Exception{
		if (Pattern.compile(".*" + delemiter + "$").matcher(numbers).find()) {
			throw new Exception("cant have a delemiter at end");
		}
	}

	private void haveOtherDelemiter(String[] listOfNumber, String delemiter, String initialNumbers) throws Exception {
		for (String s : listOfNumber) {
			String stringWitchoutNumber = s.replaceAll("\\d", "");
			if (!stringWitchoutNumber.isEmpty()) {
				throw new Exception(
					 "'" + delemiter + "' expected but '" + stringWitchoutNumber + "' found at position " + initialNumbers.indexOf(stringWitchoutNumber));
			}
		}
	}

	private String getDelemiter(String s) {
		if (s.startsWith("//")) {
			return s.split("\n")[0].replace("//", "");
		}
		return "[,\n]";
	}
}
