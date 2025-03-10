// Generated code from Butter Knife. Do not modify!
package com.meanu.sijangseoul.Backdrop;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.button.MaterialButton;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meanu.sijangseoul.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BackdropMainFragment_ViewBinding implements Unbinder {
  private BackdropMainFragment target;

  private View view2131296294;

  private View view2131296295;

  private View view2131296296;

  @UiThread
  public BackdropMainFragment_ViewBinding(final BackdropMainFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.backdrop_A, "field 'mMaterialButton1' and method 'setBackdropClick'");
    target.mMaterialButton1 = Utils.castView(view, R.id.backdrop_A, "field 'mMaterialButton1'", MaterialButton.class);
    view2131296294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBackdropClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.backdrop_B, "method 'setBackdropClick'");
    view2131296295 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBackdropClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.backdrop_C, "method 'setBackdropClick'");
    view2131296296 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.setBackdropClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BackdropMainFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mMaterialButton1 = null;

    view2131296294.setOnClickListener(null);
    view2131296294 = null;
    view2131296295.setOnClickListener(null);
    view2131296295 = null;
    view2131296296.setOnClickListener(null);
    view2131296296 = null;
  }
}
