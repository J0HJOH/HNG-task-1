// Generated by view binder compiler. Do not edit!
package com.example.shoptry.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shoptry.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOrderSuccessfulBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView succesTotal;

  @NonNull
  public final ImageView successfulImage;

  private FragmentOrderSuccessfulBinding(@NonNull FrameLayout rootView,
      @NonNull TextView succesTotal, @NonNull ImageView successfulImage) {
    this.rootView = rootView;
    this.succesTotal = succesTotal;
    this.successfulImage = successfulImage;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOrderSuccessfulBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOrderSuccessfulBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_order_successful, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOrderSuccessfulBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.succes_total;
      TextView succesTotal = ViewBindings.findChildViewById(rootView, id);
      if (succesTotal == null) {
        break missingId;
      }

      id = R.id.successful_image;
      ImageView successfulImage = ViewBindings.findChildViewById(rootView, id);
      if (successfulImage == null) {
        break missingId;
      }

      return new FragmentOrderSuccessfulBinding((FrameLayout) rootView, succesTotal,
          successfulImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
