package tat.mukhutdinov.lesson17.ui.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * ViewModel to retrieve, update and delete an item from the [ItemsRepository]'s data source.
 */
class ItemDetailsViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val itemId: Int = checkNotNull(savedStateHandle[ItemDetailsDestination.ITEM_ID_ARG])

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * UI state for ItemDetailsScreen
 */
data class ItemDetailsUiState(
    val outOfStock: Boolean = true,
    val itemDetails: ItemDetails = ItemDetails()
)
