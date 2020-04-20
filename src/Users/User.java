package Users;



public class User {
		private String name;
		private String user_id;
		private String password;
		private String securityAnswer ;
		private String securityQuestion ;
		private String introduction ;
		public User() {}
		public User(String user_id,String password) {
			this.setId(user_id);
			this.setPassword(password);
			
		}
		public String getIntroduction() {
			return introduction;
		}
		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return user_id;
		}
		public void setId(String user_id) {
			this.user_id = user_id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSecurityAnswer() {
			return securityAnswer;
		}
		public void setSecurityAnswer(String securityAnswer) {
			this.securityAnswer = securityAnswer;
		}
		public String getSecurityQuestion() {
			return securityQuestion;
		}
		public void setSecurityQuestion(String securityQuestion) {
			this.securityQuestion = securityQuestion;
		}
}
