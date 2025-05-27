// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A [ModelManager] implementation that manages the visual decorations of highlighted elements in a canvas.
 * @param [T] The type of the items.
 * @see [HighlightIndicatorManager]
 * @see [FocusIndicatorManager]
 * @see [SelectionIndicatorManager]
 * @see [GraphHighlightIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-constructor-HighlightIndicatorManager">Online Documentation</a>
 */
external open class HighlightIndicatorManager<T : IModelItem>  () : ModelManager<T> {

/**
 * Gets or sets the item collection that determines which items are highlighted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23selectionModel">Online Documentation</a>
 */
final var selectionModel: ISelectionModel<T>?
/**
 * Adds another highlight.
 * @param [item] The item to highlight.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-addHighlight">Online Documentation</a>
 */
 open   fun addHighlight( item: T )
/**
 * Removes all highlights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-clearHighlights">Online Documentation</a>
 */
 open   fun clearHighlights()
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find a canvas object group for.
 * @return An [ICanvasObjectGroup] or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-getCanvasObjectGroup">Online Documentation</a>
 */
 override   fun getCanvasObjectGroup( item: T ):ICanvasObjectGroup?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-getInstaller">Online Documentation</a>
 */
 override   fun getInstaller( item: T ):ICanvasObjectInstaller<T>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-install">Online Documentation</a>
 */
 override   fun install( canvas: CanvasComponent )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-onDisabled">Online Documentation</a>
 */
 override   fun onDisabled()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-onEnabled">Online Documentation</a>
 */
 override   fun onEnabled()
/**
 * Removes an item from the current highlight selection.
 * @param [item] The item whose highlight decorator will be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-removeHighlight">Online Documentation</a>
 */
 open   fun removeHighlight( item: T )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HighlightIndicatorManager%23HighlightIndicatorManager-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( canvas: CanvasComponent )

companion object : ClassMetadata<HighlightIndicatorManager<*>> {
}
}
