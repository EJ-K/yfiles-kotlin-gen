// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.Rect
import yfiles.lang.InterfaceMetadata

/**
 * Interface for implementations that can calculate the bounds of a group node in a grouped graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator">Online Documentation</a>
 */
external interface IGroupBoundsCalculator  {
  /**
   * Calculates the bounds of the [layout][INode] for the group node whose lookup returned this provider.
   * @param [graph] The graph which holds the group node.
   * @return The minimum bounds to use for the group node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator%23IGroupBoundsCalculator-method-calculateBounds">Online Documentation</a>
   */
  fun calculateBounds(
    graph: IGraph,
  ): Rect

  
  companion object : InterfaceMetadata<IGroupBoundsCalculator> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGroupBoundsCalculator%23IGroupBoundsCalculator-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      calculateBounds: (graph: IGraph) -> Rect
    ): IGroupBoundsCalculator
  }
}
