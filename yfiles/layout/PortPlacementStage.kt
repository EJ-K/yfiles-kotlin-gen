// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * The [PortPlacementStage] assigns edges to the ports specified by [LayoutPortCandidate]s or [NodePortCandidates] after calling the [coreLayout][LayoutStageBase].
 * @see [LayoutPortCandidate]
 * @see [NodePortCandidates]
 * @see [routeCorrectionPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage">Online Documentation</a>
 * 
 * @constructor Creates a new [PortPlacementStage] instance with an optional [coreLayout][LayoutStageBase].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23PortPlacementStage-constructor-PortPlacementStage">Online Documentation</a>
 */
open external class PortPlacementStage (
  coreLayout: ILayoutAlgorithm?  = definedExternally,
) : LayoutStageBase {
  /**
   * Gets or sets how this [ILayoutStage] corrects the edge paths after moving the ports to the locations specified by the [LayoutPortCandidate]s.
   * 
   * Default value - [RouteCorrectionPolicy.MOVE_PORTS_TO_BORDER]. The ports are just moved.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23routeCorrectionPolicy">Online Documentation</a>
   */
  final var routeCorrectionPolicy: RouteCorrectionPolicy
  
  /**
   * Corrects the ports of the edges considering [LayoutPortCandidate]s, [NodePortCandidates], and port groups.
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23PortPlacementStage-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData] that can be used to perform item-specific configurations for the [PortPlacementStage].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][LayoutData] that can be used to perform item-specific configurations for the given [PortPlacementStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23PortPlacementStage-defaultmethod-createLayoutData">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): BasicPortData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  companion object : ClassMetadata<PortPlacementStage> {
  }
}

inline fun PortPlacementStage(
    block: PortPlacementStage.() -> Unit
): PortPlacementStage {
    return PortPlacementStage()
        .apply(block)
}
