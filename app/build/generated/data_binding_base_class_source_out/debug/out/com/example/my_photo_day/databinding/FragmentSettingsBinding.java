// Generated by view binder compiler. Do not edit!
package com.example.my_photo_day.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.my_photo_day.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RadioButton optionGreyTheme;

  @NonNull
  public final RadioButton optionOrangeTheme;

  @NonNull
  public final RadioGroup themeGroup;

  @NonNull
  public final TextView themeText;

  private FragmentSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RadioButton optionGreyTheme, @NonNull RadioButton optionOrangeTheme,
      @NonNull RadioGroup themeGroup, @NonNull TextView themeText) {
    this.rootView = rootView;
    this.optionGreyTheme = optionGreyTheme;
    this.optionOrangeTheme = optionOrangeTheme;
    this.themeGroup = themeGroup;
    this.themeText = themeText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.option_grey_theme;
      RadioButton optionGreyTheme = ViewBindings.findChildViewById(rootView, id);
      if (optionGreyTheme == null) {
        break missingId;
      }

      id = R.id.option_orange_theme;
      RadioButton optionOrangeTheme = ViewBindings.findChildViewById(rootView, id);
      if (optionOrangeTheme == null) {
        break missingId;
      }

      id = R.id.theme_group;
      RadioGroup themeGroup = ViewBindings.findChildViewById(rootView, id);
      if (themeGroup == null) {
        break missingId;
      }

      id = R.id.theme_text;
      TextView themeText = ViewBindings.findChildViewById(rootView, id);
      if (themeText == null) {
        break missingId;
      }

      return new FragmentSettingsBinding((ConstraintLayout) rootView, optionGreyTheme,
          optionOrangeTheme, themeGroup, themeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
