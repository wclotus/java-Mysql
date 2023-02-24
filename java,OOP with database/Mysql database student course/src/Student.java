public class Student {

   private int testOneScore;
   private int testTwoScore;
   private int testThreeScore;

   public Student(int testOneScore, int testTwoScore, int testThreeScore) {
       super();
       this.testOneScore = testOneScore;
       this.testTwoScore = testTwoScore;
       this.testThreeScore = testThreeScore;
   }

   public Student() {
       this.testOneScore = 0;
       this.testTwoScore = 0;
       this.testThreeScore = 0;
   }

   public void setTestScore(int testNumber, int score) {
       if (testNumber == 1) {
           this.testOneScore = score;
       } else if (testNumber == 2) {
           this.testTwoScore = score;
       } else {
           this.testThreeScore = score;
       }
   }

   public int getTestScore(int testNumber) {
       if (testNumber == 1) {
           return this.testOneScore;
       } else if (testNumber == 2) {
           return this.testTwoScore;
       }
       return this.testThreeScore;
   }

   public int average() {
       return (this.testOneScore + this.testTwoScore + this.testThreeScore) / 3;
   }

   @Override
   public String toString() {
       return "Test One Score: " + this.testOneScore + " Test Two Score: " + this.testTwoScore + " Test Three Score: "
               + this.testThreeScore + " Avarage: " + average();
   }

}
