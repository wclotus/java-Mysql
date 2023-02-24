
	import java.util.ArrayList;
	import java.util.List;

	public class customer extends account {
		List<item> mycart = new ArrayList<>();

		public customer(String username, String password) {
			super(username, password);
			
		}

		public List<item> getMyCart() {
			return mycart;
		}

		public void setMycart(List<item> mycart) {
			this.mycart = mycart;
		}

		@Override
		public String toString() {
			return "[Username: " + getUsername() + " Password: " + getPassword() + "] ";
		}
}
