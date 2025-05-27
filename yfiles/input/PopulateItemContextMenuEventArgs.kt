// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.view.PopulateContextMenuEventArgs

/**
 * A specialized subclass of [PopulateContextMenuEventArgs] that carries the [item][PopulateItemContextMenuEventArgs] for which the context menu should be populated.
 * @param [TModelItem] The type of the model [item][PopulateItemContextMenuEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateItemContextMenuEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PopulateItemContextMenuEventArgs] class.
 * @param [context] The context to populate the menu for.
 * @param [queryLocation] The query location.
 * @param [item] The item for which the context menu should be populated, may be `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateItemContextMenuEventArgs%23PopulateItemContextMenuEventArgs-constructor-PopulateItemContextMenuEventArgs">Online Documentation</a>
 * 
 * @property item
 * Gets the item for which the context menu is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateItemContextMenuEventArgs%23item">Online Documentation</a>
 */
external class PopulateItemContextMenuEventArgs<TModelItem> (
context: IInputModeContext,
queryLocation: Point,
final val item: TModelItem?) : PopulateContextMenuEventArgs {
  
  companion object : ClassMetadata<PopulateItemContextMenuEventArgs<*>> {
  }
}
