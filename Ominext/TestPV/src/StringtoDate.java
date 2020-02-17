import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import modle.Student;

/**
 * @author User
 *
 */
public class StringtoDate {
	Untils untils = new Untils();

	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		List<Student> students = student.insert();
		StringtoDate stringtoDate = new StringtoDate();

		System.out.println(stringtoDate.studentSort(students));
		/*
		 * System.out.println("======== Find All Student by Month ============");
		 * System.out.println("Input month : "); String month = sc.nextLine();
		 * System.out.println(stringtoDate.findStudentByMonth(students,month));
		 * System.out.println("======== BirthDay < 20191012 ============");
		 * System.out.println(stringtoDate.studentBirthDay(students, "20191012"));
		 * System.out.println("======== Start save file to csv ");
		 * System.out.println("======== End save file to csv ");
		 * System.out.println("======== Use Map ====================");
		 * System.out.println(stringtoDate.UpperCaseName(students));
		 * System.out.println("======== Use Name Edit Map ====================");
		 * System.out.println(stringtoDate.EditName(students));
		 * System.out.println("======== Count gpa====================");
		 * System.out.println(stringtoDate.CountGpa(students));
		 * */
		 stringtoDate.saveCSV(students);
		 
		System.out.println("==========Len dau=============");
		System.out.println(stringtoDate.findSortName2(students));
	}

	public List<Student> studentSort(List<Student> students) {
		List<Student> studentSort = students.stream().sorted(Comparator.comparing(Student::getBirthday))
				.collect(Collectors.toList());
		return studentSort;
	}

	public List<String> UpperCaseName(List<Student> students) {
		List<String> stringName = students.stream().map(x -> x.getName()).map(String::toUpperCase)
				.collect(Collectors.toList());
		return stringName;
	}

	public List<String> EditName(List<Student> students) {
		List<String> stringEdit = students.stream().map(x -> "Ten :" + x.getName()).collect(Collectors.toList());
		return stringEdit;
	}

	public float CountGpa(List<Student> students) {
		Float count = students.stream().map(Student::getGpa).reduce(0.0f, Float::sum);
		return count;
	}

	public List<Student> findStudentByMonth(List<Student> students, String month) {
		List<Student> studentBirthMonth = students.stream().sorted(Comparator.comparing(Student::getName))
				.filter(x -> String.valueOf(month.charAt(0)).equals(String.valueOf(x.getBirthday().charAt(4)))
						&& String.valueOf(month.charAt(1)).equals(String.valueOf(x.getBirthday().charAt(5))))
				.collect(Collectors.toList());
		return studentBirthMonth;

	}

	public float TbGpa(List<Student> students) {
		float sumGpa = this.CountGpa(students);
		Long count = students.stream().map(Student::getGpa).count();
		float tb = sumGpa / count;
		return tb;
	}

	public List<Student> studentBirthDay(List<Student> students, String birthDay) {
		List<Student> listBirthDay = new ArrayList<Student>();
		List<Student> studentBirthMonth = students.stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		LocalDate localstartDate = LocalDate.parse(birthDay, DateTimeFormatter.BASIC_ISO_DATE);
		for (Student student : studentBirthMonth) {
			LocalDate localendDate = LocalDate.parse(student.getBirthday(), DateTimeFormatter.BASIC_ISO_DATE);
			long numOfDaysBetween = ChronoUnit.DAYS.between(localstartDate, localendDate);
			if (numOfDaysBetween < 0) {
				listBirthDay.add(student);
			}
		}
		return listBirthDay;
	}

	public List<Student> findSortName(List<Student> students, int id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				Student student = students.get(i);
				students.remove(i);
				students.add(0, student);
			}
		}

		return students;
	}

	public List<Student> findSortName2(List<Student> students) {
		List<Student> listPacksortName = students
				.stream().sorted(
						Comparator
								.comparing(Student::getName,
										Comparator.comparing((String s) -> !s.toUpperCase().contains("S"))
												.thenComparing(Comparator.naturalOrder())))
				.collect(Collectors.toList());

		return listPacksortName;
	}

	public void saveCSV(List<Student> students) throws IOException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhap ten file :");
		String nameFile = sc2.nextLine();
		FileWriter csvWriter = new FileWriter("D:/" + nameFile + ".csv");
		csvWriter.append("Id");
		csvWriter.append(",");
		csvWriter.append("" + "Name");
		csvWriter.append(",");
		csvWriter.append("Birthday");
		csvWriter.append(",");
		csvWriter.append("Pga");
		csvWriter.append("\n");
		for (Student student : students) {
			String strGpa = String.valueOf(student.getGpa());
			String strId = String.valueOf(student.getId());
			csvWriter.append(String.join(",", strId, student.getName(), student.getBirthday(), strGpa,
					Untils.convertSecondsToHHmm(student.getDateInsert())));
			csvWriter.append("\n");
		}
		csvWriter.append("Tb :");
		csvWriter.append(",");
		csvWriter.append(",");
		csvWriter.append(",");
		String strGpa = String.valueOf(this.TbGpa(students));
		csvWriter.append(strGpa);

		csvWriter.flush();
		csvWriter.close();
	}
}
