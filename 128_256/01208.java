/**
 * 更新RecyclerView的方法
 */
protected void notifyDataSetChanged(){
    if (mAdapter != null) {
        mAdapter.notifyDataSetChanged();
    }
}