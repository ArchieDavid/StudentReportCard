# StudentReportCard
Report card class created using BuilderPattern.
This is one of the ABND project.

# StudentReportCard
Use Eclipse to test the class. Example:

```java
public class TestStudentReportCard {

	public static void main(String[] args) {

		StudentReportCard reportCard = new StudentReportCard.Builder(120)
				.studentName("Mike")
				.englishGrade(90).mathGrade(99)
				.scienceGrade(100)
                .build();
		
		System.out.println(reportCard);
	}

}

Example output:
```java
StudentReportCard{studentId='120', mathGrade='99', scienceGrade= '100', englishGrade= '90', studentName= 'Mike'}


