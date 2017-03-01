1. public string weightedFlip()
   {
      int randInt = (int)(Math.random()*(2));
      if(randInt > 0)
      {
        return "heads";
      }
      else
      return "tails";
   }

2. public boolean arePermutations(int[] a, int[] b)
   {
      boolean c = false;
      for(int i = 0; i < a.length(); i ++)
      {
        c = false;
        for(int j = 0; j < b.length(); j++)
        {
          if(a[i] = b[j])
          c = true;
        }  
      }
      return c;
    }
  
3. {1,2,3,4}
   {2,1,3,4} 2
   {2,3,1,4} 3
   {1,3,2,4} 2
   {4,3,2,1} 4
