/**
 * Locate an existing instance of this Fragment or if not found, create and
 * add it using FragmentManager.
 *
 * @param fm The FragmentManager manager to use.
 * @return The existing instance of the Fragment or the new instance if just
 *         created.
 */
public static RetainFragment findOrCreateRetainFragment(FragmentManager fm){
    // Check to see if we have retained the worker fragment.
    RetainFragment mRetainFragment = (RetainFragment) fm.findFragmentByTag(TAG);

    // If not retained (or first time running), we need to create and add it.
    if (mRetainFragment == null) {
        mRetainFragment = new RetainFragment();
        fm.beginTransaction().add(mRetainFragment, TAG).commit();
    }

    return mRetainFragment;
}