// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * The event argument class that is used by [DragSource.QueryContinueDrag] during drags.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs">Online Documentation</a>
 */
external  class QueryContinueDragEventArgs  : EventArgs {

/**
 * Gets or sets the action.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs%23action">Online Documentation</a>
 */
final var action: DragAction
/**
 * Gets the current [dropTarget] or null of there is no drop target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs%23dropTarget">Online Documentation</a>
 */
final val dropTarget: DropTarget?
/**
 * Gets a value indicating whether the escape key had been pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs%23escapePressed">Online Documentation</a>
 */
final val escapePressed: Boolean
/**
 * Gets or sets a value indicating whether this [QueryContinueDragEventArgs] is handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs%23handled">Online Documentation</a>
 */
final var handled: Boolean
/**
 * Gets the current state of the keys.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/QueryContinueDragEventArgs%23keyStates">Online Documentation</a>
 */
final val keyStates: DragDropKeyStates

companion object : ClassMetadata<QueryContinueDragEventArgs> {
}
}
