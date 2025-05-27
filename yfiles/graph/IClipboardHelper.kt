// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * This interface can be used to customize the clipboard behavior for individual [IModelItem]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper">Online Documentation</a>
 */
external interface IClipboardHelper<in T : IModelItem, D> : YObject {
/**
 * This method is called during the copy operation of the given item to retrieve additional state that can be later used during a [paste] operation.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item to copy to the clipboard.
 * @return A custom user object that will later be provided to [paste].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-copy">Online Documentation</a>
 */
   fun copy( context: IGraphClipboardContext? ,
 item: T ):D
/**
 * This method is called during the cut operation of the given item to retrieve additional state that can be later used during a [paste] operation.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item to cut to the clipboard.
 * @return A custom user object that will later be provided to [paste].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-cut">Online Documentation</a>
 */
   fun cut( context: IGraphClipboardContext? ,
 item: T ):D
/**
 * This method is called after the item has been pasted from the clipboard.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item that has been created during the paste operation.
 * @param [userData] The data that had been queried during [cut] or [copy] respectively.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-paste">Online Documentation</a>
 */
   fun paste( context: IGraphClipboardContext? ,
 item: T ,
 userData: D )
/**
 * Determines whether the given item can or should be copied to the clipboard.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item in question.
 * @return Whether this item should be copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldCopy">Online Documentation</a>
 */
   fun shouldCopy( context: IGraphClipboardContext? ,
 item: T ):Boolean
/**
 * Determines whether the given item can or should be cut to the clipboard.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item in question.
 * @return Whether this item should be cut.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldCut">Online Documentation</a>
 */
   fun shouldCut( context: IGraphClipboardContext? ,
 item: T ):Boolean
/**
 * Determines whether the given item can or should be pasted from the clipboard to the target graph.
 * @param [context] The context in which this interface is used, can be `null`
 * @param [item] The item in the clipboard graph.
 * @param [userData] The state memento that had been created during [cut] or [copy].
 * @return Whether this item should be pasted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldPaste">Online Documentation</a>
 */
   fun shouldPaste( context: IGraphClipboardContext? ,
 item: T ,
 userData: D ):Boolean

companion object : InterfaceMetadata<IClipboardHelper<*, *>> {
}
}
