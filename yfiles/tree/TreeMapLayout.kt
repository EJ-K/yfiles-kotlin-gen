// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.geometry.Size
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.NodeDataKey

/**
 * This layout algorithm produces tree map layouts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TreeMapLayout] class with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-constructor-TreeMapLayout">Online Documentation</a>
 */
open external class TreeMapLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets the target aspect ratio of the [SQUARIFIED][TilingStrategy] tiling strategy.
   * 
   * Default value - `1`. The target is to draw square nodes.
   * @throws ArgumentError if the given aspect ratio is smaller than `1`
   * @see [TilingStrategy.SQUARIFIED]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23aspectRatio">Online Documentation</a>
   */
  final var aspectRatio: Double
  
  /**
   * Gets or sets the minimum size (height and width) a node in the tree map must have.
   * 
   * Default value - [Size]. Minimum width and height are `10.0`.
   * @throws ArgumentError if the width or height of the given size is smaller than `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23minimumNodeSize">Online Documentation</a>
   */
  final var minimumNodeSize: Size
  
  /**
   * Gets or sets the desired dimension of the root rectangle into which all nodes are placed.
   * 
   * Default value - [Size]. Preferred width and height are `600`.
   * @throws ArgumentError if width/height value of the given size is less than or equal to `zero`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23preferredSize">Online Documentation</a>
   */
  final var preferredSize: Size
  
  /**
   * Gets or sets the spacing between nodes of the same hierarchy.
   * 
   * Default value - `5`
   * @throws ArgumentError if the given spacing is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23spacing">Online Documentation</a>
   */
  final var spacing: Double
  
  /**
   * Gets or sets the [TilingStrategy] that defines how the input is divided into sub-rectangles.
   * 
   * Default value - [TilingStrategy.SQUARIFIED]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23tilingStrategy">Online Documentation</a>
   */
  final var tilingStrategy: TilingStrategy
  
  /**
   * Arranges the given input graph as a tree map.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeMapLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeMapLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): TreeMapLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [TreeMapLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [TreeMapLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23TreeMapLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): TreeMapLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<TreeMapLayout> {
    /**
     * A [data key][NodeDataKey] for specifying the weight of the nodes.
     * @see [TreeMapLayoutData.nodeWeights]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeMapLayout%23NODE_WEIGHT_DATA_KEY">Online Documentation</a>
     */
     val NODE_WEIGHT_DATA_KEY: NodeDataKey<Number>
  }
}

inline fun TreeMapLayout(
    block: TreeMapLayout.() -> Unit
): TreeMapLayout {
    return TreeMapLayout()
        .apply(block)
}
