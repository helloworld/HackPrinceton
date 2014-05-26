HashMap<String, Integer> hm = new HashMap<String, Integer>();
HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

public HashMap<String, Integer> createMap(String word, HashMap<String, Integer> hm)
{
   for (char ch: word.toCharArray()) 
    {
        String s = "" + ch;
        if(hm.containsKey(s))
        {
        	hm.put(s, hm.get(s)+1); 
    	}
       	else
    	{
        	hm.put(s, 1);
    	}
    } 
    
    return hm;
}

hm = createMap(s1, hm);
hm = createMap(s2, hm);
hm2 = createMap(s3, hm2);

if(hm2.equals(hm))
    return true;
else
    return false;




