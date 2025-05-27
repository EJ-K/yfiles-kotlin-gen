// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata

/**
 * [ILayoutAlgorithm] describes the general interface for algorithms that perform a layout process on a [LayoutGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutAlgorithm">Online Documentation</a>
 */
external interface ILayoutAlgorithm  {
  /**
   * Main layout routine that assigns new layout information to the given graph.
   * @param [graph] the input graph to process
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutAlgorithm%23ILayoutAlgorithm-method-applyLayout">Online Documentation</a>
   */
  fun applyLayout(
    graph: LayoutGraph,
  )

  
  companion object : InterfaceMetadata<ILayoutAlgorithm> {
  }
}
