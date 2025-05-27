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
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.PortPlacementStage

/**
 * This edge routing algorithm routes edges as straight lines considering the specified [LayoutPortCandidate][yfiles.layout.LayoutPortCandidate]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [StraightLineEdgeRouter] with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-constructor-StraightLineEdgeRouter">Online Documentation</a>
 */
open external class StraightLineEdgeRouter (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets a [LayoutStageBase] that provides support for [EdgePortCandidates][yfiles.layout.EdgePortCandidates], [NodePortCandidates][yfiles.layout.NodePortCandidates] or port groups.
   * @see [StraightLineEdgeRouterData.ports]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23portPlacementStage">Online Documentation</a>
   */
  final val portPlacementStage: PortPlacementStage
  
  /**
   * Routes the edges as straight lines from their source to their target after invoking the [coreLayout][LayoutStageBase].
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [StraightLineEdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [StraightLineEdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): StraightLineEdgeRouterData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [StraightLineEdgeRouter].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [StraightLineEdgeRouter].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StraightLineEdgeRouter%23StraightLineEdgeRouter-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): StraightLineEdgeRouterData<INode, IEdge, ILabel, ILabel>
  
  companion object : ClassMetadata<StraightLineEdgeRouter> {
  }
}

inline fun StraightLineEdgeRouter(
    block: StraightLineEdgeRouter.() -> Unit
): StraightLineEdgeRouter {
    return StraightLineEdgeRouter()
        .apply(block)
}
