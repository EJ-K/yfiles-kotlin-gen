// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.InterfaceMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode

/**
 * This interface determines the minimum distances between elements that belong to the same layer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator">Online Documentation</a>
 */
external interface IDrawingDistanceCalculator  {
  /**
   * Disposes of internal data structures.
   * @param [graph] the input graph that contains all elements that are used during the node placement
   * @param [layoutContext] the [HierarchicalLayoutContext] instance which provides access to the [HierarchicalLayoutNodeContext] and [HierarchicalLayoutEdgeContext] instances, as well as the [layers][HierarchicalLayoutContext] instance that will be used during subsequent calls.
   * @see [initialize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-dispose">Online Documentation</a>
   */
  fun dispose(
    graph: LayoutGraph,
    layoutContext: HierarchicalLayoutContext,
  )
  
  /**
   * Main interface method called by [ICoordinateAssigner] instances to determine the minimum distance between [LayoutNode]s of the same layer.
   * @param [graph] the input graph
   * @param [layer] the layer object that will be used during subsequent calls
   * @param [layoutContext] the [HierarchicalLayoutContext] instance which provides access to the [HierarchicalLayoutNodeContext] and [HierarchicalLayoutEdgeContext] instances
   * @param [left] the left of the two [LayoutNode]s whose minimum distance is to be determined or `null` if only the left border of the right [LayoutNode] is of interest
   * @param [right] the right of the two [LayoutNode]s whose minimum distance is to be determined or `null` if only the right border of the left [LayoutNode] is of interest
   * @return the minimum distance between two [LayoutNode]s of the same layer
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-getMinimumDistance">Online Documentation</a>
   */
  fun getMinimumDistance(
    graph: LayoutGraph,
    layer: HierarchicalLayoutLayer,
    layoutContext: HierarchicalLayoutContext,
    left: LayoutNode?,
    right: LayoutNode?,
  ): Double
  
  /**
   * Initializes internal data structures.
   * @param [graph] the input graph that contains all elements that are used during the node placement
   * @param [layoutContext] The [HierarchicalLayoutContext] instance which provides access to context information for the graph elements.
   * @see [dispose]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-initialize">Online Documentation</a>
   */
  fun initialize(
    graph: LayoutGraph,
    layoutContext: HierarchicalLayoutContext,
  )

  
  companion object : InterfaceMetadata<IDrawingDistanceCalculator> {
  }
}
