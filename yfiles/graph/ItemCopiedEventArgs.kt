// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * Event arguments for the events in [GraphCopier].
 * @param [T] The logical base type of the copied item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCopiedEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new argument for the given item and its original.
 * @param [original] The [original] of the copied item.
 * @param [copy] The [copied item][copy].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCopiedEventArgs%23ItemCopiedEventArgs-constructor-ItemCopiedEventArgs">Online Documentation</a>
 * 
 * @property original
 * Gets the original of the [copied item][copy].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCopiedEventArgs%23original">Online Documentation</a>
 * 
 * @property copy
 * Gets the copied item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemCopiedEventArgs%23copy">Online Documentation</a>
 */
external open class ItemCopiedEventArgs<T : Any>  (
final val original: T,
final val copy: T) : EventArgs {

companion object : ClassMetadata<ItemCopiedEventArgs<*>> {
}
}
