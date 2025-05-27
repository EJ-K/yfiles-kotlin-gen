// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.layout.BasicEdgeLabelPlacement
import yfiles.layout.BasicNodeLabelPlacement
import yfiles.layout.EdgeDataKey
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase

/**
 * [CurveRoutingStage] replaces polyline edge paths with curved segments using cubic bezier splines.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage">Online Documentation</a>
 * 
 * @constructor Creates a new [CurveRoutingStage] instance using the given optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-constructor-CurveRoutingStage">Online Documentation</a>
 */
open external class CurveRoutingStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets the default [CurveRoutingEdgeDescriptor] which provides settings that are considered when adding curves to the edge path for edges that have no [individual descriptor][CurveRoutingStageData] assigned.
   * 
   * Default value - [CurveRoutingEdgeDescriptor]
   * @see [CurveRoutingStageData.edgeDescriptors]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23defaultEdgeDescriptor">Online Documentation</a>
   */
  final var defaultEdgeDescriptor: CurveRoutingEdgeDescriptor
  
  /**
   * Gets or sets whether or not edge labels are considered when determining curved edge routes.
   * 
   * Default value - [BasicEdgeLabelPlacement.CONSIDER]. Edge labels are considered
   * @see [EdgeLabelPreferredPlacement][yfiles.layout.EdgeLabelPreferredPlacement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23edgeLabelPlacement">Online Documentation</a>
   */
  final var edgeLabelPlacement: BasicEdgeLabelPlacement
  
  /**
   * Gets or sets whether or not node labels are considered by the layout stage.
   * 
   * Default value - [BasicNodeLabelPlacement.CONSIDER]. Node labels are considered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23nodeLabelPlacement">Online Documentation</a>
   */
  final var nodeLabelPlacement: BasicNodeLabelPlacement
  
  /**
   * Adds curved segments to the edge routes produced by the [coreLayout][LayoutStageBase].
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to define the edges affected by the [CurveRoutingStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CurveRoutingStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): EdgeScopeData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel, Boolean>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to define the edges affected by the [CurveRoutingStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [CurveRoutingStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23CurveRoutingStage-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?,
  ): EdgeScopeData<INode, IEdge, ILabel, ILabel, Boolean>
  
  companion object : ClassMetadata<CurveRoutingStage> {
    /**
     * A [data key][EdgeDataKey] for specifying individual edge layout information.
     * @see [CurveRoutingStageData.edgeDescriptors]
     * @see [CurveRoutingEdgeDescriptor]
     * @see [defaultEdgeDescriptor]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CurveRoutingStage%23EDGE_DESCRIPTOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_DESCRIPTOR_DATA_KEY: EdgeDataKey<CurveRoutingEdgeDescriptor>
  }
}

inline fun CurveRoutingStage(
    block: CurveRoutingStage.() -> Unit
): CurveRoutingStage {
    return CurveRoutingStage()
        .apply(block)
}
