class DistributingPens{
	public static void main(String[] args){
		int totalPens = 14;
		int totalStudents = 3;
		int penPerStudent = totalPens / totalStudents;
		int remainingPens = totalPens % totalStudents;
		System.out.println("The pen per student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}
