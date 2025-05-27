// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import js.core.Void
import yfiles.collections.IEnumerable
import yfiles.collections.IMapper
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.TimeSpan
import yfiles.layout.EdgeLabelDataKey
import yfiles.layout.LayoutEdge
import yfiles.layout.LayoutEdgeLabel
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutNode
import yfiles.layout.LayoutNodeLabel
import yfiles.layout.LayoutStageBase
import yfiles.layout.NodeLabelDataKey

/**
 * A generic labeling algorithm for placing the labels of a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GenericLabeling] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-constructor-GenericLabeling">Online Documentation</a>
 */
open external class GenericLabeling () : LayoutStageBase {
  /**
   * Gets or sets the default [LabelingCosts] for edge labels.
   * 
   * Default value - [LabelingOptimizationStrategy.BALANCED]. The different types of preferences for the placement of the edge labels are balanced.
   * @throws ArgumentError if the [LabelingCosts] are `null`
   * @see [GenericLabelingData.edgeLabelingCosts]
   * @see [EdgeLabelCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23defaultEdgeLabelingCosts">Online Documentation</a>
   */
  final var defaultEdgeLabelingCosts: LabelingCosts
  
  /**
   * Gets or sets the default [LabelingCosts] for node labels.
   * 
   * Default value - [LabelingOptimizationStrategy.BALANCED]. The different types of preferences for the placement of the node labels are balanced.
   * @throws ArgumentError if the [LabelingCosts] are `null`
   * @see [GenericLabelingData.nodeLabelingCosts]
   * @see [NodeLabelCandidates]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23defaultNodeLabelingCosts">Online Documentation</a>
   */
  final var defaultNodeLabelingCosts: LabelingCosts
  
  /**
   * Gets or sets whether or not this algorithm behaves deterministically.
   * 
   * Default value - `true`. Labeling results are deterministic.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23deterministic">Online Documentation</a>
   */
  final var deterministic: Boolean
  
  /**
   * Get or sets a value that specifies whether the algorithm should consider all labels to be in scope
   * 
   * Default value - `true`. Without any scope specification all labels are interpreted as being in scope
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23fillEmptyScope">Online Documentation</a>
   */
  final var fillEmptyScope: Boolean
  
  /**
   * Gets or sets whether or not *internal* node labels are allowed to move.
   * 
   * Default value - `false`. Internal node labels will not be moved.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23moveInternalNodeLabels">Online Documentation</a>
   */
  final var moveInternalNodeLabels: Boolean
  
  /**
   * Gets or sets the ratio of label placement quality versus running time.
   * 
   * Default value - `1.0`
   * @throws ArgumentError if the specified ratio is outside the interval `[0,1]`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23qualityTimeRatio">Online Documentation</a>
   */
  final var qualityTimeRatio: Double
  
  /**
   * Gets or sets whether or not a post-processing step is applied to further reduce the number of label overlaps.
   * 
   * Default value - `false`. Post-processing to reduce overlaps is disabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23reduceLabelOverlaps">Online Documentation</a>
   */
  final var reduceLabelOverlaps: Boolean
  
  /**
   * Gets or sets which labels may be placed.
   * 
   * Default value - [LabelingScope.ALL]. All labels are affected.
   * @see [GenericLabelingData.scope]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23scope">Online Documentation</a>
   */
  final var scope: LabelingScope
  
  /**
   * Gets or sets the time limit for this algorithm.
   * 
   * Default value - [TimeSpan.MAX_VALUE]. There is no time limit.
   * @throws ArgumentError if the given stop duration is negative
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23stopDuration">Online Documentation</a>
   */
  final var stopDuration: TimeSpan
  
  /**
   * Places the labels in the graph after first executing the [coreLayout][LayoutStageBase].
   * @param [graph] the input graph
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-method-applyLayoutImpl">Online Documentation</a>
   */
  override fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [GenericLabeling].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [GenericLabeling].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-defaultmethod-createLayoutData(LayoutGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: LayoutGraph,
  ): GenericLabelingData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Returns an instance of [LayoutData][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the [GenericLabeling].
   * @param [graph] the graph that determines the generic type arguments of the created layout data
   * @return an instance of [layout data][yfiles.layout.LayoutData] that can be used to perform item-specific configurations for the given [GenericLabeling].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-defaultmethod-createLayoutData(IGraph)">Online Documentation</a>
   */
  fun createLayoutData(
    graph: IGraph?  = definedExternally,
  ): GenericLabelingData<INode, IEdge, ILabel, ILabel>
  
  /**
   * Can be used in custom implementations of [modifyWeights][GenericLabeling] to query the calculated overlap costs for the given [LabelCandidate]s.
   * @param [candidate1] one of the two label candidates
   * @param [candidate2] the other of the two label candidates
   * @return the degree to which the candidates should be considered overlapping
   * @see [modifyWeights]
   * @see [setOverlapCost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-method-getOverlapCost">Online Documentation</a>
   */
  fun getOverlapCost(
    candidate1: LabelCandidate,
    candidate2: LabelCandidate,
  ): Double
  
  /**
   * Callback method to influence the label candidates available to the labeling algorithm before the algorithm is applied.
   * @param [graph] the input graph
   * @param [nodeLabelToCandidates] a mapping from node labels to their respective label candidates
   * @param [edgeLabelToCandidates] a mapping from edge labels to their respective label candidates
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-method-modifyCandidates">Online Documentation</a>
   */
  protected open fun modifyCandidates(
    graph: LayoutGraph,
    nodeLabelToCandidates: IMapper<LayoutNodeLabel, IEnumerable<LabelCandidate>>,
    edgeLabelToCandidates: IMapper<LayoutEdgeLabel, IEnumerable<LabelCandidate>>,
  )
  
  /**
   * Callback method to influence the choice of [LabelCandidate]s immediately before the final label positions are chosen.
   * @param [graph] the input graph
   * @param [nodeLabelToCandidates] a mapping from node labels to their respective label candidates
   * @param [edgeLabelToCandidates] a mapping from edge labels to their respective label candidates
   * @see [getOverlapCost]
   * @see [setOverlapCost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-method-modifyWeights">Online Documentation</a>
   */
  protected open fun modifyWeights(
    graph: LayoutGraph,
    nodeLabelToCandidates: IMapper<LayoutNodeLabel, IEnumerable<LabelCandidate>>,
    edgeLabelToCandidates: IMapper<LayoutEdgeLabel, IEnumerable<LabelCandidate>>,
  )
  
  /**
   * Can be used in custom implementations of [modifyWeights][GenericLabeling] to set custom overlap penalties for the given [LabelCandidate]s.
   * @param [candidate1] one of the two label candidates
   * @param [candidate2] the other of the two label candidates
   * @param [value] the degree to which the candidates should be considered overlapping
   * @see [modifyWeights]
   * @see [getOverlapCost]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-method-setOverlapCost">Online Documentation</a>
   */
  fun setOverlapCost(
    candidate1: LabelCandidate,
    candidate2: LabelCandidate,
    value: Double,
  )
  
  companion object : ClassMetadata<GenericLabeling> {
    /**
     * The [EdgeLabelDataKey] key to specify [LabelingCosts] for each edge label.
     * @see [GenericLabelingData.edgeLabelingCosts]
     * @see [EdgeLabelCandidates]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23EDGE_LABELING_COSTS_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABELING_COSTS_DATA_KEY: EdgeLabelDataKey<LabelingCosts>
    
    /**
     * The [EdgeLabelDataKey] key to specify [candidates][EdgeLabelCandidates] for each edge label.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23EDGE_LABEL_CANDIDATES_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABEL_CANDIDATES_DATA_KEY: EdgeLabelDataKey<EdgeLabelCandidates>
    
    /**
     * The [EdgeLabelDataKey] key used to associate an edge label candidate processor delegate with an edge label to modify the weights calculated during the [GenericLabeling].
     * @see [GenericLabelingData.edgeLabelCandidateProcessors]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23EDGE_LABEL_CANDIDATE_PROCESSOR_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABEL_CANDIDATE_PROCESSOR_DATA_KEY: EdgeLabelDataKey<(IEnumerable<LabelCandidate>, LayoutEdgeLabel) -> Void>
    
    /**
     * A [data key][EdgeLabelDataKey] for publishing the chosen candidates for all affected edge labels.
     * @see [NODE_LABEL_CANDIDATE_RESULT_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23EDGE_LABEL_CANDIDATE_RESULT_DATA_KEY">Online Documentation</a>
     */
     val EDGE_LABEL_CANDIDATE_RESULT_DATA_KEY: EdgeLabelDataKey<LabelCandidate>
    
    /**
     * The [NodeLabelDataKey] key to specify [LabelingCosts] for each node label.
     * @see [GenericLabelingData.nodeLabelingCosts]
     * @see [NodeLabelCandidates]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23NODE_LABELING_COSTS_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABELING_COSTS_DATA_KEY: NodeLabelDataKey<LabelingCosts>
    
    /**
     * The [NodeLabelDataKey] key to specify [candidates][NodeLabelCandidates] for each node label.
     * @see [GenericLabelingData.nodeLabelCandidates]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23NODE_LABEL_CANDIDATES_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABEL_CANDIDATES_DATA_KEY: NodeLabelDataKey<NodeLabelCandidates>
    
    /**
     * The [NodeLabelDataKey] key used to associate an node label candidate processor delegate with a node label to modify the weights calculated during the [GenericLabeling].
     * @see [GenericLabelingData.nodeLabelCandidateProcessors]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23NODE_LABEL_CANDIDATE_PROCESSOR_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABEL_CANDIDATE_PROCESSOR_DATA_KEY: NodeLabelDataKey<(IEnumerable<LabelCandidate>, LayoutNodeLabel) -> Void>
    
    /**
     * A [data key][NodeLabelDataKey] for publishing the chosen candidates for all affected node labels.
     * @see [EDGE_LABEL_CANDIDATE_RESULT_DATA_KEY]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23NODE_LABEL_CANDIDATE_RESULT_DATA_KEY">Online Documentation</a>
     */
     val NODE_LABEL_CANDIDATE_RESULT_DATA_KEY: NodeLabelDataKey<LabelCandidate>
  }
}

inline fun GenericLabeling(
    block: GenericLabeling.() -> Unit
): GenericLabeling {
    return GenericLabeling()
        .apply(block)
}
