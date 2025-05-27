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

/**
 * This interface can be used to customize the clipboard behavior for individual [IModelItem]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper">Online Documentation</a>
 */
external interface IClipboardHelper<in T : IModelItem, D>  {
  /**
   * This method is called during the copy operation of the given item.
   * @param [context] The context in which this interface is used.
   * @param [item] The item to copy to the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-onCopied">Online Documentation</a>
   */
  fun onCopied(
    context: IGraphClipboardContext,
    item: T,
  )
  
  /**
   * This method is called during the cut operation of the given item.
   * @param [context] The context in which this interface is used.
   * @param [item] The item to cut to the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-onCut">Online Documentation</a>
   */
  fun onCut(
    context: IGraphClipboardContext,
    item: T,
  )
  
  /**
   * This method is called after the item has been duplicated in the graph.
   * @param [context] The context in which this interface is used.
   * @param [original] The original item which is duplicated.
   * @param [duplicate] The duplicate of the original item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-onDuplicated">Online Documentation</a>
   */
  fun onDuplicated(
    context: IGraphClipboardContext,
    original: IModelItem,
    duplicate: IModelItem,
  )
  
  /**
   * This method is called after the item has been pasted from the clipboard.
   * @param [context] The context in which this interface is used.
   * @param [item] The item that has been created during the paste operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-onPasted">Online Documentation</a>
   */
  fun onPasted(
    context: IGraphClipboardContext,
    item: T,
  )
  
  /**
   * Determines whether the given item can or should be copied to the clipboard.
   * @param [context] The context in which this interface is used.
   * @param [item] The item in question.
   * @return Whether this item should be copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldCopy">Online Documentation</a>
   */
  fun shouldCopy(
    context: IGraphClipboardContext,
    item: T,
  ): Boolean
  
  /**
   * Determines whether the given item can or should be cut to the clipboard.
   * @param [context] The context in which this interface is used.
   * @param [item] The item in question.
   * @return Whether this item should be cut.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldCut">Online Documentation</a>
   */
  fun shouldCut(
    context: IGraphClipboardContext,
    item: T,
  ): Boolean
  
  /**
   * Determines whether the given item can or should be duplicated in the source graph.
   * @param [context] The context in which this interface is used.
   * @param [item] The item in the source graph.
   * @return Whether this item should be duplicated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldDuplicate">Online Documentation</a>
   */
  fun shouldDuplicate(
    context: IGraphClipboardContext,
    item: T,
  ): Boolean
  
  /**
   * Determines whether the given item can or should be pasted from the clipboard to the target graph.
   * @param [context] The context in which this interface is used.
   * @param [item] The item in the clipboard graph.
   * @return Whether this item should be pasted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IClipboardHelper%23IClipboardHelper-method-shouldPaste">Online Documentation</a>
   */
  fun shouldPaste(
    context: IGraphClipboardContext,
    item: T,
  ): Boolean

  
  companion object : InterfaceMetadata<IClipboardHelper<*, *>> {
  }
}
