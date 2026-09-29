class Solution {
    public boolean isPalindrome(String s) {
    int l  = 0; 
    int r = s.length()-1;

    while(l<r)
    {
        if(l<r||!Character.isLetterOrDigit(s.charAt(l)))
        {
            l++;
            continue;

        }

        if(r>l||!Character.isLetterOrDigit(s.charAt(r)))
        {
            r--;
            continue;
        }

        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
    }

    return true;


    }

}
