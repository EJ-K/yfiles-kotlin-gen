// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * This is the event argument that is used by the [IWriteEvents] interface that can be queried from the [writeEvents][IWriteContext] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WriteEventArgs">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [WriteEventArgs] class.
 * @param [context] The context to assign to [context][WriteEventArgs].
 * @param [item] The item to assign to [item][WriteEventArgs].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WriteEventArgs%23WriteEventArgs-constructor-WriteEventArgs">Online Documentation</a>
 * 
 * @property context
 * Gets the context that is being used for writing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WriteEventArgs%23context">Online Documentation</a>
 * 
 * @property item
 * Gets the item that is currently being written or `null` if nothing is applicable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WriteEventArgs%23item">Online Documentation</a>
 */
external class WriteEventArgs (
final val context: IWriteContext,
final val item: Any?) : EventArgs {
  
  companion object : ClassMetadata<WriteEventArgs> {
  }
}
