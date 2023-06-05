class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       int m=0;String wd="";
        for(int i=0;i<s.length();i++)
        {
            wd=wd+s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                if(wd.indexOf(s.charAt(j))==-1)
                {   
                	wd=wd+s.charAt(j);
                    m=Math.max(wd.length(),m);
                }
                else
                {
                	wd="";
                    break;
                }
            }
        }
       
     if(wd.length()==1 && m==0)
        return 1;
    else
    {
        return m;
    }
    }
}
