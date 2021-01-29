//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

	//add constructors
  public TenToAny()
  {
    base10 = 0;
    newBase = 2;
  }
  public TenToAny(int orig, int base)
  {
    base10 = orig;
    newBase = base;
  }
	//add a set method
  public void setBase10(int num)
  {
    base10 = num;
  }
  public void setNewBase(int base)
  {
    newBase = base;
  }
	public String getNewNum()
	{
    int orig = base10;
    char[] letters = new char[]{'A','B','C','D','E','F'};
		String newNum="";
    while(orig>0)
    {
      int remainder = orig%newBase;
      if (remainder<10)
        newNum = (orig%newBase) + newNum;
      else
        newNum = (Character.toString(letters[remainder%10])) + newNum;
      orig/=newBase;
    }
		return newNum;
	}

	//add a toString method	
	public String toString()
  {
    return base10 + " base 10 is " + getNewNum() + " in base " + newBase;
  }
}
