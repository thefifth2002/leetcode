package reverseBits_190;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int reverseBits1(int n) {
    int res = 0;
    for (int i = 0; i < 32; i++) {
      res += n & 1;
      n >>>= 1;
      if (i < 31) {
        res <<= 1;
      }
    }
    return res;
  }

  public int reverseBits(int n) {
    int res = 0;
    for (int i = 0; i < 4; i++) {
      byte temp = (byte)(n >>> i * 8 & 0xFF);
      res += reverseByte(temp);
      if( i < 3) {
        res <<= 8;
      }
    }
    return res;
  }
  private Map<Byte, Integer> cache = new HashMap<>();
  private int reverseByte(byte temp) {
    if (cache.containsKey(temp)) {
      return cache.get(temp);
    } else {
      Integer val = 0;
      for (int i = 0; i < 8; i++) {
        val += temp >>> i & 1;
        if (i < 7) {
          val <<= 1;
        }
      }
      cache.put(temp, val);
      return val;
    }
  }
}
