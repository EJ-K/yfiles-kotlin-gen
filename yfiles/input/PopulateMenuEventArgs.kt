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

/**
 * Event arguments for the [ContextMenuInputMode.PopulateMenu] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateMenuEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PopulateMenuEventArgs] class.
 * @param [context] The context.
 * @param [queryLocation] The query location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateMenuEventArgs%23PopulateMenuEventArgs-constructor-PopulateMenuEventArgs">Online Documentation</a>
 * 
 * @property queryLocation
 * Gets the queried location in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateMenuEventArgs%23queryLocation">Online Documentation</a>
 */
external open class PopulateMenuEventArgs  (
 context: IInputModeContext ,
final val queryLocation: Point) : InputModeEventArgs {

/**
 * Gets or sets a value indicating whether this [PopulateMenuEventArgs] has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateMenuEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets or sets a value indicating whether to actually display the context menu.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PopulateMenuEventArgs%23showMenu">Online Documentation</a>
 */
final var showMenu: Boolean

companion object : ClassMetadata<PopulateMenuEventArgs> {
}
}
