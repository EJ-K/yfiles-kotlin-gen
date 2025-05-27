// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * The default implementation of a data object for the [DropInputMode][yfiles.input.DropInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropItem">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DragDropItem] class and sets the provided data item for the specified format.
 * @param [format] The format.
 * @param [data] The data item.
 * @see [setData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropItem%23DragDropItem-constructor-DragDropItem">Online Documentation</a>
 */
external  class DragDropItem  ( format: String?  = definedExternally,
 data: DragDropData?  = definedExternally) : YObject {

/**
 * Gets the types of the data items stored in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropItem%23types">Online Documentation</a>
 */
final val types: ReadonlyArray<String>?
/**
 * Gets the data item for the given format.
 * @param [format] The format.
 * @return The data item that is stored for this format, or `null` if no such item exists.
 * @see [setData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropItem%23DragDropItem-method-getData">Online Documentation</a>
 */
 final   fun getData( format: String ):DragDropData?
/**
 * Sets the data item for the given format.
 * @param [format] The format.
 * @param [data] The data item.
 * @see [getData]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DragDropItem%23DragDropItem-method-setData">Online Documentation</a>
 */
 final   fun setData( format: String ,
 data: DragDropData )

companion object : ClassMetadata<DragDropItem> {
}
}
