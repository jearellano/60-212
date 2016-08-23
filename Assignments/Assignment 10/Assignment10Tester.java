package assignment10;

public class Assignment10Tester {

	public static void main(String a[]){
		String result;
		String keyList[] = {"126", "536", "428", "245"};
		MyInformationSystem<String> nameStudentNumberList;
		nameStudentNumberList = new MyInformationSystem<String>();
		nameStudentNumberList.insert("John", "245");// John has
		 // student number 245
		nameStudentNumberList.insert("Tom", "126");
		nameStudentNumberList.insert("Mary", "536");
		nameStudentNumberList.insert("Mark", "821");
		for (int i = 0; i < keyList.length; i++){
		try{
		result = nameStudentNumberList.retrieve(keyList[i]);
		System.out.println("For key " + keyList[i] +
		 " the matching value is " + result);
		}
		catch(Exception e){
		System.out.println("No Match with " + keyList[i]);
		}
		}
		 }
}

