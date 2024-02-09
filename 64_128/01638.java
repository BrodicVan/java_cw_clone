//  public boolean checkIfCloser(float t_new, int item_idx, BvhNode node, float hit_backface, float u, float v){
//    if( t_min < t_new && t_new < t){
//      this.t            = t_new;
//      this.u            = u;
//      this.v            = v;
//      this.item_idx     = item_idx;
//      this.node         = node;
//      this.hit_backface = hit_backface;
//      this.got_hit      = true;
//      return true;
//    }
//    return false;
//  }
public boolean checkIfCloser(float[] tuv, int item_idx, BvhNode node, float hit_backface){
    if( t_min < tuv[0] && tuv[0] < t){
      this.t            = tuv[0];
      this.u            = tuv[1];
      this.v            = tuv[2];
      this.item_idx     = item_idx;
      this.node         = node;
      this.hit_backface = hit_backface;
      this.got_hit      = true;
      return true;
    }
    return false;
  }