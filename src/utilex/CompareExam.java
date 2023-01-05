package utilex;

import java.util.TreeSet;

class	Person implements Comparable<Person>{
	int		score;
	String	name;
	
	public	Person(int score, String name) {
		this.score	=	score;
		this.name	=	name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.score < o.score) return -1;
		else if(this.score == o.score) return 0;
		else	return 1;
	}
}

public class CompareExam {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1	=	new Person(98, "기제");
		Person p2	=	new Person(99, "진우");
		Person p3	=	new Person(100, "동환");
		
		TreeSet<Person> tset	=	new	TreeSet<Person>();
		tset.add(p1);
		tset.add(p2);
		tset.add(p3);
		
		for(Person p : tset) {
//			System.out.println(tset);
			System.out.println(p.name + " : " + p.score);
		}
		
	}

}
