// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ILookup
import yfiles.lang.InterfaceMetadata

/**
 * The interface for the context that is passed by the [GraphClipboard] implementation to the [IClipboardHelper] methods and [IClipboardIdProvider].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphClipboardContext">Online Documentation</a>
 */
external interface IGraphClipboardContext : ILookup {
  /**
   * Gets the clipboard that created this context and is used during the current operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphClipboardContext%23clipboard">Online Documentation</a>
   */
  val clipboard: GraphClipboard
  
  /**
   * Gets the source graph for the current operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphClipboardContext%23sourceGraph">Online Documentation</a>
   */
  val sourceGraph: IGraph
  
  /**
   * Gets the target graph for the current operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraphClipboardContext%23targetGraph">Online Documentation</a>
   */
  val targetGraph: IGraph

  
  companion object : InterfaceMetadata<IGraphClipboardContext> {
  }
}
