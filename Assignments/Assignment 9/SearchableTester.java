package assignment9;
public class SearchableTester {
public static void main(String a[]){
SearchableList<SearchableDate> myList;
SearchableList<SearchableDate>.SearchingIterator myIterator;// Line 4
Object matchingDate;
myList = new SearchableList<SearchableDate>(); // Line 6
SearchableDate aDate;
myList. insert(new SearchableDate("20/5/2012"));// Line 8
myList. insert(new SearchableDate("21/2/2013"));
myList. insert(new SearchableDate("11/9/2010"));
myList. insert(new SearchableDate("16/1/2013"));
myList. insert(new SearchableDate("12/1/2013"));
myList. insert(new SearchableDate("13/1/2012"));
myList. insert(new SearchableDate("6/5/2010"));
myList. insert(new SearchableDate("13/5/2012"));// Line 15
aDate = myList.getFirst();// Line 17
while (!(aDate== null)){
System.out.println(aDate);
aDate = myList.getNext();
} // Line 21
myIterator = myList.getIterator(new Integer(2010)); // Line 22
matchingDate = myIterator.findFirstMatch(); // Line 23
while (!(matchingDate == null)){ // Line 24
System.out.println(matchingDate); // Line 25
matchingDate = myIterator.findNextMatch(); // Line 26
} // Line 27
}
}