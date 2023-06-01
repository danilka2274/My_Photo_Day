// Generated by view binder compiler. Do not edit!
package com.example.my_photo_day.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.my_photo_day.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemEarthBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView caption;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final MaterialTextView date;

  @NonNull
  public final MaterialTextView identifier;

  @NonNull
  public final AppCompatImageView photoEarth;

  private ItemEarthBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialTextView caption,
      @NonNull MaterialCardView card, @NonNull MaterialTextView date,
      @NonNull MaterialTextView identifier, @NonNull AppCompatImageView photoEarth) {
    this.rootView = rootView;
    this.caption = caption;
    this.card = card;
    this.date = date;
    this.identifier = identifier;
    this.photoEarth = photoEarth;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemEarthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemEarthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_earth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemEarthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.caption;
      MaterialTextView caption = ViewBindings.findChildViewById(rootView, id);
      if (caption == null) {
        break missingId;
      }

      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.date;
      MaterialTextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.identifier;
      MaterialTextView identifier = ViewBindings.findChildViewById(rootView, id);
      if (identifier == null) {
        break missingId;
      }

      id = R.id.photo_earth;
      AppCompatImageView photoEarth = ViewBindings.findChildViewById(rootView, id);
      if (photoEarth == null) {
        break missingId;
      }

      return new ItemEarthBinding((ConstraintLayout) rootView, caption, card, date, identifier,
          photoEarth);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
