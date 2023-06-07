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

	private String[] getSplit(String string, String delemiter) throws Exception {
		if (string.startsWith("//")) {
			String[] split = string.split("\n");
			string = split[1];
		}
		if (Pattern.compile(".*" + delemiter + "$").matcher(string).find()) {
			throw new Exception("cant have a delemiter at end");
		}
		return string.split(delemiter);
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
