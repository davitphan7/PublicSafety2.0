
public class Detective {
	private String name;
	private int badgeNumber;
	public Detective(String name, int badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}

	@Override
	public String toString() {
		return "Detective [" +
				"Badge=" + badgeNumber +
				"Name=" + name  +
				']';
	}
}
