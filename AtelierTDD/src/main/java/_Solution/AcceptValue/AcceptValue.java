package _Solution.AcceptValue;

import java.util.HashMap;
import java.util.Map;

public class AcceptValue {

	private Map<String, Boolean> boolFlag = new HashMap<String, Boolean>() {
		{
			put("no", false);
			put("yes", true);
			put("off", false);
			put("on", true);
			put("start", true);
			put("stop", false);
		}
	};

	public Boolean asBoolean(String flag) {
		if (boolFlag.containsKey(flag)) {
			return boolFlag.get(flag);
		}
		return null;
	}
}
