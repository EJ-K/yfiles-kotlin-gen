// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

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
import yfiles.layout.LayoutStageStack
import yfiles.layout.RadialEdgeLabelPlacement
import yfiles.layout.RadialNodeLabelPlacement

/**
 * This layout algorithm arranges a graph on a disk packing the nodes as dense as possible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CompactDiskLayout] instance with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-constructor-CompactDiskLayout">Online Documentation</a>
 */
open external class CompactDiskLayout () : ILayoutAlgorithm {
  /**
   * Gets or sets how the layout handles the position of edge labels.
   * 
   * Default value - [RadialEdgeLabelPlacement.IGNORE]. Edge labels are placed by an independent labeling algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: RadialEdgeLabelPlacement
  
  /**
   * Gets or sets whether or not to take the coordinates of the input diagram into account when arranging the nodes on the disk.
   * 
   * Default value - `false`. The layout algorithm does not consider the initial coordinates of the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23fromSketchMode">Online Documentation</a>
   */
  final var fromSketchMode: Boolean
  
  /**
   * Gets the mutable stack of [ILayoutStage][yfiles.layout.ILayoutStage] that will be applied to this layout.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23layoutStages">Online Documentation</a>
   */
  final val layoutStages: LayoutStageStack
  
  /**
   * Gets or sets the minimum node distance that this algorithm should enforce between all pairs of nodes.
   * 
   * Default value - `0`
   * @throws ArgumentError if the specified minimum node distance is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets how the layout handles the position of node labels.
   * 
   * Default value - [NodeLabelPlacement.CONSIDER][yfiles.layout.NodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: RadialNodeLabelPlacement
  
  /**
   * Gets or sets the spacing used for node labels when integrated node labeling is enabled.
   * 
   * Default value - `4.0`
   * @throws ArgumentError if the given spacing value is negative
   * @see [nodeLabelPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23nodeLabelSpacing">Online Documentation</a>
   */
  final var nodeLabelSpacing: Double
  
  /**
   * Calculates a radial arrangement for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-method-applyLayout">Online Documentation</a>
   */
  override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Calculates a radial arrangement for the given graph.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-method-applyLayoutCore">Online Documentation</a>
   */
  protected fun applyLayoutCore(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [CompactDiskLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CompactDiskLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): CompactDiskLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [CompactDiskLayout].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CompactDiskLayout].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompactDiskLayout%23CompactDiskLayout-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): CompactDiskLayoutData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<CompactDiskLayout> {
  }
}

inline fun CompactDiskLayout(
    block: CompactDiskLayout.() -> Unit
): CompactDiskLayout {
    return CompactDiskLayout()
        .apply(block)
}
