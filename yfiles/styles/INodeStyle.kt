// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ICloneable
import yfiles.lang.InterfaceMetadata

/**
 * Style implementation for [INode][yfiles.graph.INode] instances in an [IGraph][yfiles.graph.IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyle">Online Documentation</a>
 */
external interface INodeStyle : ICloneable<INodeStyle> {
  /**
   * Gets the renderer implementation that can be queried for implementations that provide details about the visual appearance and visual behavior for a given node and this style instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyle%23renderer">Online Documentation</a>
   */
  val renderer: INodeStyleRenderer

  
  companion object : InterfaceMetadata<INodeStyle> {
    /**
     * A void implementation of a node style that does nothing and behaves like an invisible style.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/INodeStyle%23VOID_NODE_STYLE">Online Documentation</a>
     */
     val VOID_NODE_STYLE: INodeStyle
  }
}
