// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ItemEventArgs
import yfiles.lang.ClassMetadata

/**
 * A specialized subclass of the [ItemEventArgs] class that is bound to the [IBend] type and carries additional [owner][IEdge] and index information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [BendEventArgs] class.
 * @param [bend] The bend to assign to the [ItemEventArgs.item] property.
 * @param [owner] The previous owner of the bend.
 * @param [index] The previous index of the bend in the [IEdge.bends] list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendEventArgs%23BendEventArgs-constructor-BendEventArgs">Online Documentation</a>
 * 
 * @property owner
 * Gets the owner of the bend that owned the bend before the event happened.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendEventArgs%23owner">Online Documentation</a>
 * 
 * @property index
 * Gets the former index of the bend in the [IEdge.bends] list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BendEventArgs%23index">Online Documentation</a>
 */
external  class BendEventArgs  (
 bend: IBend ,
final val owner: IEdge,
final val index: Int) : ItemEventArgs<IBend> {

companion object : ClassMetadata<BendEventArgs> {
}
}
