// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IObservableCollection
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata

/**
 * A [ModelManager] implementation that manages the visual decorations of selected elements in a canvas.
 * @param [T] The type of the items in the collection and selection model.
 * @see [SelectionIndicatorManager]
 * @see [FocusIndicatorManager]
 * @see [HighlightIndicatorManager]
 * @see [GraphSelectionIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance that for all selected items in the model dynamically installs a selection indicator visualization.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-constructor-SelectionIndicatorManager">Online Documentation</a>
 */
external open class SelectionIndicatorManager<T : IModelItem>  () : ModelManager<T> {

/**
 * Gets or sets the model that describes the domain for the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23model">Online Documentation</a>
 */
final var model: IObservableCollection<T>?
/**
 * Gets or sets the selection model that determines which items are selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23selectionModel">Online Documentation</a>
 */
final var selectionModel: ISelectionModel<T>?
/**
 * Adds an item to the current selection.
 * @param [item] The item whose selection indicator will added.
 * @return The newly created canvas object for the selection indicator or `null` if nothing was installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-addSelection">Online Documentation</a>
 */
 open   fun addSelection( item: T ):ICanvasObject?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find a canvas object group for.
 * @return An [ICanvasObjectGroup] or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-getCanvasObjectGroup">Online Documentation</a>
 */
 override   fun getCanvasObjectGroup( item: T ):ICanvasObjectGroup?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-getInstaller">Online Documentation</a>
 */
 override   fun getInstaller( item: T ):ICanvasObjectInstaller<T>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-onDisabled">Online Documentation</a>
 */
 override   fun onDisabled()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-onEnabled">Online Documentation</a>
 */
 override   fun onEnabled()
/**
 * Removes an item from the current selection.
 * @param [item] The item whose selection indicator will be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SelectionIndicatorManager%23SelectionIndicatorManager-method-removeSelection">Online Documentation</a>
 */
 open   fun removeSelection( item: T )

companion object : ClassMetadata<SelectionIndicatorManager<*>> {
}
}
