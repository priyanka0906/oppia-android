package org.oppia.android.app.home.recentlyplayed

import android.view.View
import androidx.lifecycle.ViewModel
import org.oppia.android.app.model.PromotedStory

// TODO(#297): Add download status information to promoted-story-card.

/** [ViewModel] for displaying a promoted story. */
class PromotedViewModel(
  val promotedStory: PromotedStory,
  val entityType: String,
  private val promotedStoryClickListener: PromotedStoryClickListener
) : RecentlyPlayedItemViewModel() {
  fun clickOnOngoingStoryTile(@Suppress("UNUSED_PARAMETER") v: View) {
    promotedStoryClickListener.onPromotedStoryClicked(promotedStory)
  }
}
