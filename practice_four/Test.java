// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set;
// class Person {
// private String name;
// private int id;
// Person(String name,int id) {
// this.name = name;
// this.id = id;
// }
// public void setName(String name){
// this.name = name;
// }
// public String getName(){
// return name;
// }
// public void setId(int id){
// this.id = id;
// }
// public int getId(){
// return id;
// }
// public int hashCode(){
// return name.hashCode()+id; //使用字符串哈希值与Integer的哈希值的组合
//                                               //这样会产生重码，实际上重码率很高
// }
// public boolean equals(Object obj){
// if(obj instanceof Person){ //
// Person p = (Person)obj;
// return(name.equals(p.name) && id == p.id);
// }
// return super.equals(obj);
// }
// }
// public class TestHashSet2 {
// public static void main(String[] args) {
// Person p1 = new Person("a",1);
// Person p2 = new Person("b",0);
// Set<Person> set = new HashSet<Person>();
// set.add(p1);
// set.add(p2);
// Iterator<Person> it = set.iterator();
// while(it.hasNext()){
// System.out.println(it.next().getName());
// }
// }
// }
