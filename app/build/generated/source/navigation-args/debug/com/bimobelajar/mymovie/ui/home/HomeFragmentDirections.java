package com.bimobelajar.mymovie.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.bimobelajar.mymovie.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToDetailFragment actionHomeFragmentToDetailFragment(int movieId) {
    return new ActionHomeFragmentToDetailFragment(movieId);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  public static class ActionHomeFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailFragment(int movieId) {
      this.arguments.put("movieId", movieId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailFragment setMovieId(int movieId) {
      this.arguments.put("movieId", movieId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("movieId")) {
        int movieId = (int) arguments.get("movieId");
        __result.putInt("movieId", movieId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMovieId() {
      return (int) arguments.get("movieId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailFragment that = (ActionHomeFragmentToDetailFragment) object;
      if (arguments.containsKey("movieId") != that.arguments.containsKey("movieId")) {
        return false;
      }
      if (getMovieId() != that.getMovieId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMovieId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "movieId=" + getMovieId()
          + "}";
    }
  }
}
