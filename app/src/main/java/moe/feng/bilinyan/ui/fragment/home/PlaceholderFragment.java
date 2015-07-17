package moe.feng.bilinyan.ui.fragment.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ScrollView;

import moe.feng.bilinyan.R;

@SuppressLint("ValidFragment")
public class PlaceholderFragment extends BaseHomeFragment {

	private ScrollView mScrollView;

	public static PlaceholderFragment newInstance() {
		PlaceholderFragment fragment = new PlaceholderFragment();
		return fragment;
	}

	@Override
	public int getLayoutResId() {
		return R.layout.fragment_tab_placeholder;
	}

	@Override
	public void finishCreateView(Bundle state) {
		mScrollView = $(R.id.scrollable);

	}

	@Override
	public void scrollToTop() {
		mScrollView.smoothScrollTo(mScrollView.getScrollX(), 0);
	}

}
