// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLElement
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * The event argument that will be used by [DropTarget] to notify handlers of the various events during a drag and drop operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs">Online Documentation</a>
 */
external open class DragEventArgs  : EventArgs {

/**
 * Gets or sets the effects that the current handler can realize.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23dropEffect">Online Documentation</a>
 */
final var dropEffect: DragDropEffects
/**
 * Gets the allowed effects for the current drag operation as specified by the [DragSource].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23effectAllowed">Online Documentation</a>
 */
final val effectAllowed: DragDropEffects
/**
 * Gets or sets a value indicating whether this [DragEventArgs] has been handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets the data that is associated with the drag.
 * @see [DragSource.startDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23item">Online Documentation</a>
 */
final val item: DragDropItem
/**
 * Gets the key states relevant during the drag and drop operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23keyStates">Online Documentation</a>
 */
final val keyStates: DragDropKeyStates
/**
 * Gets the position of the current drag operation in the coordinates system of the provided element.
 * @param [element] The element for which the coordinates should be used.
 * @return The position in the coordinates system of `element`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragEventArgs%23DragEventArgs-method-getPosition">Online Documentation</a>
 */
 final   fun getPosition( element: HTMLElement? ):Point

companion object : ClassMetadata<DragEventArgs> {
}
}
