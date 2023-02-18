package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.repository.StudentRepo;

@RestController
public class StudentController {
//
//	@Autowired
//	private StudentRepo sRepo;
//
//	@PostMapping("/students")
//	public Student saveStudent(@RequestBody Student student) {
//
//		return sRepo.save(student);
//
//	}
//////
//	@GetMapping("/students")
//	public List<Student> getAllStudents() {
//		Iterable<Student> itr = sRepo.findAll();
//
//		List<Student> students = new ArrayList<>();
//		itr.forEach(students::add);
//
//		return students;
//
//	}
//
//	@GetMapping("/getPercentage/{semester}")
//	public Integer getPercent(@PathVariable Integer semester) {
//		int sum = 0;
//		int c = 0;
//		List<Student> st = sRepo.findBySemester(semester);
//		for (Student sts : st) {
//			c++;
//			sum = sum + sts.getMathematics() + sts.getEnglish() + sts.getScience();
//		}
//		sum = sum / c;
//		return sum * 100 / 300;
//	}
//
//	@GetMapping("/avgMarks/{subject}")
//	public Integer avgMarks(@PathVariable String subject) {
//		Iterable<Student> itr = sRepo.findAll();
//
//		List<Student> students = new ArrayList<>();
//		itr.forEach(students::add);
//		int c = 0;
//		int sum = 0;
//		for (Student st : students) {
//			System.out.println(st);
//			c++;
//			if (subject.equalsIgnoreCase("mathematics")) {
//				sum += st.getMathematics();
//			} else if (subject.equalsIgnoreCase("english")) {
//				sum += st.getEnglish();
//			} else if (subject.equalsIgnoreCase("science")) {
//				sum += st.getScience();
//			}
//		}
//		return sum / c;
//	}
//
//	@GetMapping("/top2")
//	public List<String> top2() {
//		Iterable<Student> itr = sRepo.findAll();
//
//		List<Student> students = new ArrayList<>();
//		itr.forEach(students::add);
//		HashMap<String, Integer> map = new HashMap<>();
//		for (Student st : students) {
//			map.put(st.getStudentName(), (st.getMathematics() + st.getEnglish() + st.getScience())/3);
//		}
//
//		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//
//		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//				return (o1.getValue()).compareTo(o2.getValue());
//			}
//		});
//
//		List<String> st = new ArrayList<>();
//		int c = 1;
//		for (Map.Entry<String, Integer> sts : map.entrySet()) {
//			if (c <= 2) {
//				st.add(sts.getKey());
//				c++;
//			}
//
//		}
//		return st;
//	}
}
