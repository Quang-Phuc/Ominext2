package fix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class myMain {

	public static void main(String[] args) {
		Time time = new Time();
		Users users = new Users();
		List<Time> times = time.insertTime();
		List<Users> usersList = users.insertUser();
		List<String> userName = usersList.stream().map(Users::getName).collect(Collectors.toList());
		myMain myMain = new myMain();

		List<String> dateList = Arrays.asList("2019");

		System.out.println(myMain.showTime(times, dateList, userName));
		System.out.println("===========");
		
		myMain.TestA();

	}

	public List<Time> showTime(List<Time> times, List<String> dateList, List<String> user) {
		List<Time> timeList = new ArrayList<Time>();

		for (String date : dateList) {
			timeList = times.stream().filter(x -> date.equals(x.getStartDate())).collect(Collectors.toList());
			List<String> userTimeList = timeList.stream().map(Time::getUserDay).collect(Collectors.toList());
			List<String> results = user.stream().filter(object -> !userTimeList.contains(object))
					.collect(Collectors.toList());
			for (String result : results) {
				timeList.add(new Time(result));
			}
		}

		return timeList;

	}

	public void TestA() {
		List<String> aList = Arrays.asList("l", "e", "t", "'", "s", "g");
		List<String> bList = Arrays.asList("", "o", "e", "s", "t");

		List<String> result = aList.stream().filter(aObject -> {
			return bList.contains(aObject);
		}).collect(Collectors.toList());

		// or more reduced without curly braces and return
		List<String> result2 = aList.stream().filter(aObject -> !bList.contains(aObject)).collect(Collectors.toList());

		System.out.println(result2);

	}

}
