// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A general interface for iterating over a collection of objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor">Online Documentation</a>
 */
external interface ICursor<out T : YObject> : YObject {
/**
 * Gets the object currently pointed on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23current">Online Documentation</a>
 */
val current: T
/**
 * Gets `true` if the current cursor position is valid.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23ok">Online Documentation</a>
 */
val ok: Boolean
/**
 * Gets the number of elements that can be accessed with this cursor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23size">Online Documentation</a>
 */
val size: Int
/**
 * Moves this cursor one position forward.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23ICursor-method-next">Online Documentation</a>
 */
   fun next()
/**
 * Moves this cursor one position backward (optional).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23ICursor-method-prev">Online Documentation</a>
 */
   fun prev()
/**
 * Moves this cursor to the first valid cursor position (optional).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23ICursor-method-toFirst">Online Documentation</a>
 */
   fun toFirst()
/**
 * Moves this cursor to the last valid cursor position (optional).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICursor%23ICursor-method-toLast">Online Documentation</a>
 */
   fun toLast()

companion object : InterfaceMetadata<ICursor<*>> {
}
}
