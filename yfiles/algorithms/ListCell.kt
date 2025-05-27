// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a so-called "cell" or "link" of the doubly linked list implementation [YList].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListCell">Online Documentation</a>
 */
external  class ListCell<T : YObject>  : YObject {

/**
 * Gets or sets the element stored in this cell.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListCell%23info">Online Documentation</a>
 */
final var info: T?
/**
 * Returns the predecessor cell of this cell.
 * 
 * If there is no predecessor, then `null` is returned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListCell%23ListCell-method-pred">Online Documentation</a>
 */
 final   fun pred():ListCell<T>?
/**
 * Returns the successor cell of this cell.
 * 
 * If there is no successor, then `null` is returned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ListCell%23ListCell-method-succ">Online Documentation</a>
 */
 final   fun succ():ListCell<T>?

companion object : ClassMetadata<ListCell<*>> {
}
}
