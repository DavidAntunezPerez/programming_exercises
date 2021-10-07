public class HorarioColor {
  public static void main(String[] args) {
    System.out.println(" Lunes    Martes    Miércoles  Jueves    Viernes   ");
    System.out.println("----------------------------------------------------------");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[33mPRO", "\033[95mPRO", "\033[90mSINF", "\033[32mPRO" ,"\033[93mSINF");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[36mPRO", "\033[92mPRO", "\033[97mSINF", "\033[34mPRO", "\033[92mSINF");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[32mLM ", "\033[97mPRO", "\033[36mSINF", "\033[95mPRO" ,"\033[31mSINF");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[90mED ", "\033[96mBDD", "\033[33mLM  ", "\033[34mBDD", "\033[92mFOL ");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[93mED ", "\033[92mBDD", "\033[34mLM  ", "\033[95mBDD" ,"\033[96mFOL ");
    System.out.printf(" %-2s      %-2s       %-2s        %4s      %4s\n", "\033[34mED ", "\033[91mBDD", "\033[32mLM  ", "\033[93mBDD", "\033[33mFOL ");
 }
}

