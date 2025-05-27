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
 * Style implementation for [IEdge][yfiles.graph.IEdge] instances in an [IGraph][yfiles.graph.IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyle">Online Documentation</a>
 */
external interface IEdgeStyle : ICloneable<IEdgeStyle> {
  /**
   * Gets the renderer implementation that can be queried for implementations that provide details about the visual appearance and visual behavior for a given edge and this style instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyle%23renderer">Online Documentation</a>
   */
  val renderer: IEdgeStyleRenderer

  
  companion object : InterfaceMetadata<IEdgeStyle> {
    /**
     * A void implementation of an edge style that does nothing and behaves like an invisible style.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgeStyle%23VOID_EDGE_STYLE">Online Documentation</a>
     */
     val VOID_EDGE_STYLE: IEdgeStyle
  }
}
