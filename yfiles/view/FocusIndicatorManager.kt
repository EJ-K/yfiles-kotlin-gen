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
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler

/**
 * A [ModelManager] implementation that manages the visual decoration of the focused element in a canvas.
 * @param [T] The type of the items.
 * @see [FocusIndicatorManager]
 * @see [HighlightIndicatorManager]
 * @see [SelectionIndicatorManager]
 * @see [GraphFocusIndicatorManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-constructor-FocusIndicatorManager">Online Documentation</a>
 */
external open class FocusIndicatorManager<T : IModelItem>  () : ModelManager<T>, IPropertyObservable {

/**
 * Gets or sets a value indicating whether the [container][CanvasComponent] this manager is installed in currently is focused.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23focused">Online Documentation</a>
 */
final var focused: Boolean
/**
 * Gets or sets the focused item, updates the canvas and fires the corresponding property change event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23focusedItem">Online Documentation</a>
 */
final var focusedItem: T?
/**
 * Gets or sets the show focus policy.
 * 
 * The default is [ShowFocusPolicy.ONLY_WHEN_FOCUSED].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23showFocusPolicy">Online Documentation</a>
 */
final var showFocusPolicy: ShowFocusPolicy
/**
 * Overridden to do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-addItem">Online Documentation</a>
 */
 override   fun addItem( item: T ):ICanvasObject?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find a canvas object group for.
 * @return An [ICanvasObjectGroup] or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-getCanvasObjectGroup">Online Documentation</a>
 */
 override   fun getCanvasObjectGroup( item: T ):ICanvasObjectGroup?
/**
 * Called by [ModelManager.installItem] to retrieve the installer for a given item.
 * @param [item] The item to find an installer for.
 * @return An installer or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-getInstaller">Online Documentation</a>
 */
 override   fun getInstaller( item: T ):ICanvasObjectInstaller<T>?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onDisabled">Online Documentation</a>
 */
 override   fun onDisabled()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onEnabled">Online Documentation</a>
 */
 override   fun onEnabled()
/**
 * Called when the [focused] property has changed.
 * @see [focused]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onFocusedChanged">Online Documentation</a>
 */
 open protected   fun onFocusedChanged()
/**
 * Called when the focused item has changed.
 * @param [event] a description of the event
 * @see [focusedItem]
 * @see [addPropertyChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Overridden to do nothing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23FocusIndicatorManager-method-removeItem">Online Documentation</a>
 */
 override   fun removeItem( item: T )
/**
 * Occurs when the [focusedItem] property has been changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FocusIndicatorManager%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<FocusIndicatorManager<*>> {
}
}
