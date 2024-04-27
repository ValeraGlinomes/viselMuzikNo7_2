public class DrawHangman
{
  String pizdaDodiky = """
            __________
            |     ||
            |     ()
            |    /[]/
            |    / /
            |   / /
            """;

  public void drawHangman(int mistakes) {
    if (mistakes ==0) {
      System.out.println("""
                    ___________
                    |   \\    |
                    |
                    |
                    |
                    |
                    ___________
                    """);}
    else if(mistakes ==1) {System.out.println("""
                    ___________
                    |   \\    |
                    |   ()
                    |
                    |
                    |
                    ___________
                    """);}
    else if(mistakes ==2){ System.out.println("""
                    ___________
                    |   \\    |
                    |   ()
                    |   []
                    |
                    |
                    ___________
                    """);}
    else if(mistakes ==3){ System.out.println("""
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]
                    |
                    |
                    ___________
                    """);}
    else if(mistakes ==4){ System.out.println("""
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]\
                    |
                    |
                    ___________
                    """);}
    else if(mistakes ==5){ System.out.println("""
                    ___________
                    |   \\    |
                    |   ()
                    |  /[]\
                    |  /
                    |
                    ___________
                    """);}
    else if(mistakes ==6){ System.out.println("""
                    ___________
                    |   \\   |
                    |   ()
                    |  /[]\
                    |  /  \
                    |
                    ___________
                    """);}
  }
}
