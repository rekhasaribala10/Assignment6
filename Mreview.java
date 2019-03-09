package Assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {

	private String title;
	private ArrayList<Integer> ratings = new ArrayList<>();

	public Mreview() {

	}

	public Mreview(String title) {
		this.title = title;
	}

	public Mreview(String title, int firstRating) {
		this.title = title;
		ratings.add(firstRating);
	}

	public void addRating(int rating) {
		ratings.add(rating);
	}

	public double aveRating() {
		int rating = 0;
		for (int i = 0; i < ratings.size(); i++) {
			rating = rating + ratings.get(i);
		}
		return rating / ratings.size();
	}

	public String getTitle() {
		return title;
	}

	public int numberOfRatings() {
		return ratings.size();
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < ratings.size(); i++) {
			s = s + ratings.get(i) + " ";
		}
		return "Title " + this.title + " List of Ratings " + s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mreview other = (Mreview) obj;
		if (aveRating() == other.aveRating()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Mreview o) {
		if (aveRating() > o.aveRating()) {
			return 1;
		}
		return -1;
	}
}
