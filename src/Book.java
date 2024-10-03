public class Book
{
    private String name;
    private String magic;
    
    public Book(String name, String magic)
    {
        this.name = name;
        this.magic = magic;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getMagic()
    {
        return magic;
    }
    
    @Override
    public Book clone()
    {
        return new Book(name, magic);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        if (obj.getClass() != this.getClass())
        {
            return false;
        }
        Book book = (Book) obj;
        return book.name.equals(name) && book.magic.equals(magic);
    }
    
    public int getScore()
    {
        int res = 0;
        int length = magic.length();
        
        for (int l = 0; l < length; l++)
        {
            for (int r = l + 1; r < length; r++)
            {
                String s = magic.substring(l, r);
                if (isValidSubString(s))
                {
                    res++;
                }
            }
        }
        return res;
    }
    
    private boolean isValidSubString(String s)
    {
        if (s.length() < 3 || s.charAt(0) != '#' || s.charAt(s.length() - 1) != '#')
        {
            return false;
        }
        
        int numCount = 0;
        int alphCount = 0;
        int jingCount = 0;
        
        for (int i = 1; i < s.length() - 1; i++)
        { // Exclude the first and last '#'
            char c = s.charAt(i);
            if (Character.isDigit(c))
            {
                numCount++;
            } else if (Character.isAlphabetic(c))
            {
                alphCount++;
            } else if (c == '#')
            {
                jingCount++;
            }
        }
        
        return jingCount == 0 && numCount > 0 && numCount >= alphCount;
    }
    
    public void addMagic(String magic)
    {
        this.magic += magic;
    }
    
    public void subMagic(int a, int b)
    {
        if (a > b)
        {
            magic = "";
        }
        else if (a >= magic.length())
        {
            magic = "";
        }
        else
        {
            magic = magic.substring(a, Integer.min(b + 1, magic.length()));
        }
    }
    
    public boolean contains(String s)
    {
        return magic.contains(s);
    }
}
