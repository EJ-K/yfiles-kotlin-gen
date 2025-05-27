// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.geometry.IPoint
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata

/**
 * [AlignmentStage] places the nodes of the given layout on automatically determined horizontal and/or vertical lines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage">Online Documentation</a>
 * 
 * @constructor Creates a new [AlignmentStage] with the given algorithm as [coreLayout][LayoutStageBase] or `null` if no core layout should be applied prior to the alignment stage.
 * @param [coreLayout] the core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-constructor-AlignmentStage">Online Documentation</a>
 */
open external class AlignmentStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets the axis, parallel to which the nodes are aligned by the algorithm.
   * 
   * Default value - [AlignmentStageAlignmentPolicy.SNAP_XY]. Nodes are aligned horizontally and vertically.
   * @throws ArgumentError if an unknown alignment policy is given
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23alignmentPolicy">Online Documentation</a>
   */
  final var alignmentPolicy: AlignmentStageAlignmentPolicy
  
  /**
   * Gets or sets the distance between two adjacent grid lines to which the nodes can be snapped, or zero if nodes are aligned on an irregular grid.
   * 
   * Default value - `0.0`. Nodes are aligned on an irregular grid.
   * @throws ArgumentError if a negative value is specified
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23gridSpacing">Online Documentation</a>
   */
  final var gridSpacing: Double
  
  /**
   * Gets or sets the minimum horizontal and vertical distance between two nodes.
   * 
   * Default value - `15.0`
   * @throws ArgumentError if the given value is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23minimumNodeDistance">Online Documentation</a>
   */
  final var minimumNodeDistance: Double
  
  /**
   * Gets or sets whether node labels are taken into account for snapping nodes on common lines.
   * 
   * Default value - [BasicNodeLabelPlacement.CONSIDER]. Node labels are considered for resolving overlaps when determining the alignment of the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: BasicNodeLabelPlacement
  
  /**
   * Gets or sets whether nodes are placed in strictly separated rows and strictly separated columns.
   * 
   * Default value - `false`. Rows and Columns are not strictly separated and may overlap.
   * @see [minimumNodeDistance]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23separateStripes">Online Documentation</a>
   */
  final var separateStripes: Boolean
  
  /**
   * Gets or sets the maximum distance between two nodes that can be aligned on the same line.
   * 
   * Default value - `50.0`
   * @throws ArgumentError if the given value is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23snapDistance">Online Documentation</a>
   */
  final var snapDistance: Double
  
  /**
   * Aligns the nodes of the graph into a grid-like structure.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [AlignmentStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [AlignmentStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): AlignmentStageData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [AlignmentStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [AlignmentStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23AlignmentStage-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): AlignmentStageData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<AlignmentStage> {
    /**
     * A [data key][NodeDataKey] for specifying the points of the nodes that are aligned.
     * @see [AlignmentStageData.snapOffsets]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AlignmentStage%23SNAP_OFFSET_DATA_KEY">Online Documentation</a>
     */
     val SNAP_OFFSET_DATA_KEY: NodeDataKey<IPoint>
  }
}

inline fun AlignmentStage(
    block: AlignmentStage.() -> Unit
): AlignmentStage {
    return AlignmentStage()
        .apply(block)
}
