// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.collections

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Provides methods to iterate over a collection or list of elements of the same type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerator">Online Documentation</a>
 */
external interface IEnumerator<out T> : YObject {
/**
 * Gets the element at the enumerator's current position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerator%23current">Online Documentation</a>
 */
val current: T
/**
 * Moves this enumerator to the next element.
 * @return `true` if the enumerator was moved to a valid position
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerator%23IEnumerator-method-moveNext">Online Documentation</a>
 */
   fun moveNext():Boolean
/**
 * Resets the enumerator to its starting state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEnumerator%23IEnumerator-method-reset">Online Documentation</a>
 */
   fun reset()

companion object : InterfaceMetadata<IEnumerator<*>> {
}
}
