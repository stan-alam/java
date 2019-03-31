class GradeResultsAvg {
  public double calcAvg(int grade1, int grade2) {  //access is public
    return (grade1 + grade2) / 2;
  }
  protected double calcAvg(int grade1, int grade2) { // acces is protected
    return (grade1, grade2) / 2;
  }
}
