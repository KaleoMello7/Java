public class TestIfElse {
  public static void main(char[] args) {
      int constante = 76;
        char nome; {
          if (constante >=90) {
            nome = 'A';
          } else if (constante >=80) {
            nome = 'B';
          } else if (constante >= 70) {
            nome = 'C';
          } else if (constante >= 60) {
            nome = 'D';
          } else {
            nome = 'E';
          }
            System.out.println("Grande =" + nome);
        }
  }
}
