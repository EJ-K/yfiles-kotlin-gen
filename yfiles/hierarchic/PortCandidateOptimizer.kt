// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.PortCandidateSet

/**
 * This class is an implementation of the [IPortConstraintOptimizer] interface that tries to assign the edges of the graph to [ports][yfiles.layout.PortConstraint] considering the specified [PortCandidate][yfiles.layout.PortCandidate]s.
 * @see [PortCandidate.cost][yfiles.layout.PortCandidate.cost]
 * @see [PortCandidateSet.entries]
 * @see [PortCandidateSet.connectionCount]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PortCandidateOptimizer] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-constructor-PortCandidateOptimizer">Online Documentation</a>
 */
external open class PortCandidateOptimizer  () : PortConstraintOptimizerBase {

/**
 * Gets or sets the penalty cost associated with each back-loop.
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the penalty cost is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23backLoopPenalty">Online Documentation</a>
 */
open var backLoopPenalty: Double
/**
 * Gets or sets the penalty cost associated with a crossing that would occur if a given combination of [PortCandidate][yfiles.layout.PortCandidate]s would be chosen.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the crossing penalty is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23crossingPenalty">Online Documentation</a>
 */
open var crossingPenalty: Double
/**
 * Gets or sets whether or not this implementation uses a deterministic algorithm to assign the [PortCandidate][yfiles.layout.PortCandidate]s.
 * 
 * Default value - `true`. A deterministic algorithm will be applied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23deterministic">Online Documentation</a>
 */
open var deterministic: Boolean
/**
 * Gets or sets the penalty cost associated with each edge being assigned to a port which has already reached its [capacity][yfiles.layout.IPortCandidateSetEntry.connections].
 * 
 * Default value - `100.0`
 * @throws ArgumentError if the penalty cost is negative
 * @see [IPortCandidateSetEntry.connections][yfiles.layout.IPortCandidateSetEntry.connections]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23overUsagePenalty">Online Documentation</a>
 */
open var overUsagePenalty: Double
/**
 * Returns the data provider that provides the port candidate sets for nodes.
 * @param [graph] The graph that stores the data provider
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-method-getPortCandidateSetDataProvider">Online Documentation</a>
 */
 open protected   fun getPortCandidateSetDataProvider( graph: LayoutGraph ):IDataProvider<Node, PortCandidateSet>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-method-insertSameLayerStructures">Online Documentation</a>
 */
 override   fun insertSameLayerStructures( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory ):PortConstraintOptimizerSameLayerData
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-method-optimizeAfterLayering">Online Documentation</a>
 */
 override   fun optimizeAfterLayering( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-method-optimizeAfterSequencing">Online Documentation</a>
 */
 override   fun optimizeAfterSequencing( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortCandidateOptimizer%23PortCandidateOptimizer-method-optimizeAfterSequencingForSingleNode">Online Documentation</a>
 */
 override   fun optimizeAfterSequencingForSingleNode( node: Node ,
 inEdgeOrder: IComparer<in Edge> ,
 outEdgeOrder: IComparer<in Edge> ,
 graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : ClassMetadata<PortCandidateOptimizer> {
}
}

inline fun PortCandidateOptimizer(
    block: PortCandidateOptimizer.() -> Unit
): PortCandidateOptimizer {
    return PortCandidateOptimizer()
        .apply(block)
}
