package LinkedList;

public class Song {
	private String Title;
	private double duration;

	public Song(String title, double duration) {
		//super();
		Title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return Title;
	}
	public double getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return this.Title + ": " + this.duration;
	}


}
